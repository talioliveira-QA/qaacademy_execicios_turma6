package exercicio_easy;

import javax.swing.*;

public class Exec10OPTION1 {
    public static void main(String[] args) {
        double valorInvestimento,taxaJuros,valorJuros,valorTotal;
        valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Investimento"));
        taxaJuros = 0.05*10;
        valorJuros = valorInvestimento*taxaJuros;
        valorTotal = valorInvestimento+valorJuros;
        System.out.println("Você investiu:"+valorInvestimento);
        System.out.println("Rendeu:"+valorJuros+" de juros");
        System.out.println("O valor total é:"+valorTotal);
    }
}
