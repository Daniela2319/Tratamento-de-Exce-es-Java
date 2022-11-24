import javax.swing.*;

public class UncheckedEx {

    // fazer divisão de 2 numeros inteiro
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try { //teste
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false; // para parar o loopin
            } catch (NumberFormatException e) { //captura erro
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro. " + e.getMessage()); // imprimir para usuário.
                //e.printStackTrace(); // imprimir para programador vê.
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0. " + e.getClass()); // pode deixa sem objeto também.
                e.printStackTrace();
            } finally {
                System.out.println("Chegou no finally");
            }
            System.out.println("O código contiuna...");

        } while (continueLooping);
    }

    public static int dividir(int a, int b){
        return a / b;
    }

}
