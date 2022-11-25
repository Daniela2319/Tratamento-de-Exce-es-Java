package CheckedException;

import javax.swing.*;
import java.io.*;
/*
Imprimir um arquivo no Console.
 */
public class CheckedException {

    public static void main(String[] args)  {

        String nomeDoArquivo = "Sabedoria-da-Natureza.txt";
        try { // tratando exceção de erro o correr no programa
            imprimirArquivoNoConsolei(nomeDoArquivo);
        } catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que você deseja imprimir!" + e.getCause());
            //throw new RuntimeException(e);
        }

        catch (IOException e) { // tratamento IOException é mãe e sempre fica por útimo
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte!");
                e.printStackTrace();

        }finally {
            System.out.println("Chegou no finally");
        }

        System.out.println("Apesar de exception ou não, o programa continua..");

    }
    public static void imprimirArquivoNoConsolei(String nomeDoarquivo) throws IOException {

        File f = new File(nomeDoarquivo); // inicio um objeto tipo file

        BufferedReader br = new BufferedReader(new FileReader(f.getName())); //criar um butter todo documento
        String line = br.readLine(); // lê linha por linha

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // abrindo o console

        do { // laço ate fica nulo
            bw.write(line);
            bw.newLine(); //escrever nova linha
            line=br.readLine();
        } while (line != null);
        bw.flush(); // descarregar
        br.close();
    }
}
