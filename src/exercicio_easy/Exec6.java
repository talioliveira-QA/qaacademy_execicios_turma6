package exercicio_easy;

import javax.swing.*;

public class Exec6 {
    public static void main(String[] args) {
        int nota1, nota2, media;
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota1"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota2"));
        media = (nota1 + nota2) / 2;
        if (media > 5)
            System.out.println("Aprovado");
        if (media < 5)
            System.out.println("Reprovado");
        if (media == 5)
            System.out.println("Exame");
    }
}
