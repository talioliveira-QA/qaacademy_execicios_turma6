package exercicio_easy;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Exec9OPTION2 {
    public static void main(String[] args) {
        int numeroDigitado,i=1,resultado;
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite numero inteiro"));
        while(i<=10) {
            System.out.println(numeroDigitado + "x" + i + "=" + numeroDigitado * i);
            i = i + 1;
        }
    }
}
