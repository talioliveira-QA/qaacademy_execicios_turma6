package exercicio_medium;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Exe5M {
    public void menorNumero (int numeroDigitado) {
        int i = 1, anterior=0;
        while (i <= 5) {
            if (numeroDigitado < anterior || i == 1) {
                anterior = numeroDigitado;
            }
            i++;
        }
        System.out.println("O menor numero digitado é:"+anterior);
    }

//    public static void main(String[] args) {
//        int i = 1, anterior=0, numeroDigitado;
//        while (i <= 5) {
//            numeroDigitado=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
//            if (numeroDigitado < anterior || i == 1) {
//                anterior = numeroDigitado;
//            }
//            i++;
//        }
//        System.out.println("O menor numero digitado é:"+anterior);
//    }
}
//Inicio Algoritmo
//Declarar variável numérica: i = 1, anterior,numeroDigitado;
// Enquanto(i<=5)
//numeroDigitado = Ler();
//Se(numeroDigitado < anterior || i==1)
//  anterior = numeroDigitado;
//Fim Se
//i++;
//Fim Enquanto
//Exibir (“O menor digitado é: ”+anterior);
//Fim Algoritmo

//    Faça um algoritmo para ler 5 números, verificar e exibir, quais dos 5 números digitados, é o menor.