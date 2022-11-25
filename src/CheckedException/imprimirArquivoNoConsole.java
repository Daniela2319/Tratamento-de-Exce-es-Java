package CheckedException;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class imprimirArquivoNoConsole {



    public static void arquivoNoConsole() throws IOException {

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite sua opinião sobre a natureza: ");
        pw.flush(); //descarregar o contéudo do método write no console

        Scanner scan = new Scanner(System.in); // abertura do teclado
        String line = scan.nextLine();// captura da linha do teclado

        File f = new File("Sabedoria-da-Natureza.txt"); // classe utilizada para especificar  arquivo

        BufferedWriter bw = null; // padão decorator
        try {
            bw = new BufferedWriter(new FileWriter(f.getName()));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro insperado! Entre contato com suporte!");
            //throw new RuntimeException(e);
        }

        // escreve dentro no documento
        do { //faça:
            bw.write(line); // escreva na buffer interno a linha capturada pelo scanner
            bw.newLine(); // pule para proxima linha no buffer
            bw.flush(); // terminado o laço, descarrega as informações capturada pelo teclado no arquivo
            line= scan.nextLine(); // pegue a proxima linha do teclado
        }while (!(line.equalsIgnoreCase("fim")));
        // Repita as operações do laço do-while. Quando digitar a palavra 'fim', pare.
        pw.printf("Arquivo \"%s\" foi criado com sucesso!",f.getName());
        //Utiliza o método printf da classe PrintWrite para formatar a mensagem que será exibida

        //fechando os fluxos
        pw.close(); // fechamento do fluxo de saida para o console
        scan.close(); // fechamento do fluxo entrada através do teclado
        bw.close(); // fechamento do fluxo saida para escrita no documen


    }

    public static void main(String[] args) throws IOException {
        arquivoNoConsole();

    }

}





