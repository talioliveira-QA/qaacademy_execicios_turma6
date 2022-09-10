package exercicio_easy;

import javax.swing.*;

public class Exec11 {
    public static void main(String[] args) {
        int numeroDigitado, i = 1;
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        while (i <= 100) {
            System.out.println("A soma é:" + numeroDigitado);
            numeroDigitado = numeroDigitado+2;
            i = i + 1;
        }
    }
}
