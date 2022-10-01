package exercicio_easy;

import javax.swing.*;

public class Exec11 {
    public String somaMais2CemVezes (int numero){
        int i=1;
        while (i<=100){
            numero = numero+2;
            i++;
        }
        return"A soma é "+ numero;

}
//    public static void main(String[] args) {
//        int numeroDigitado, i = 1;
//        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
//        while (i <= 100) {
//            System.out.println("A soma é:" + numeroDigitado);
//            numeroDigitado = numeroDigitado+2;
//            i = i + 1;
//        }
//    }
}
