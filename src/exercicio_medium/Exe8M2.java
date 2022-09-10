package exercicio_medium;

import javax.swing.*;

public class Exe8M2 {
    public static void main(String[] args) {
        String vetorMeses[] = new String[12];
        vetorMeses[0] = "Janeiro";
        vetorMeses[1] = "Fevereiro";
        vetorMeses[2] = "Março";
        vetorMeses[3] = "Abril";
        vetorMeses[4] = "Maio";
        vetorMeses[5] = "Junho";
        vetorMeses[6] = "Julho";
        vetorMeses[7] = "Agosto";
        vetorMeses[8] = "Setembro";
        vetorMeses[9] = "Outubro";
        vetorMeses[10] = "Novembro";
        vetorMeses[11] = "Dezembro";
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero e saiba qual mês você vai ficar milionário"));
        System.out.println("O mês que você ficará milionário é: "+vetorMeses[num-1]);
    }
}

