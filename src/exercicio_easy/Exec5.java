package exercicio_easy;

import javax.swing.*;

public class Exec5 {
    public static void main(String[] args) {
        int numero1, numero2, numero3,soma, subtracao, multiplicacao, media;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 3"));
        soma = numero1+numero2+numero3;
        subtracao = numero1-numero2-numero3;
        multiplicacao = numero1*numero2*numero3;
        media = soma/3;
        System.out.println("A soma dos numeros digitados é:"+soma);
        System.out.println("A subtração dos numeros digitados é:"+subtracao);
        System.out.println("A multiplicação dos numeros digitados é:"+multiplicacao);
        System.out.println("A media dos numeros digitados é:"+media);
            }
}
