package Customizada;

import javax.swing.*;

public class ExceptionCustomizadaII {

    public static void main(String[] args) {

        int [] numerado = {4, 5, 8, 10};
        int [] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++){
            try {

                if ( numerado[i] %2 != 0)
                    throw new DivisãoNaoExataException("Divisão não exata!", numerado[i], denominador[i]);

                int resultado = numerado[i] / denominador[i];
                System.out.println(resultado);

            } catch (DivisãoNaoExataException | ArithmeticException | ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,e.getMessage());
            }


        }

        System.out.println("O programa continua...");
    }
}
