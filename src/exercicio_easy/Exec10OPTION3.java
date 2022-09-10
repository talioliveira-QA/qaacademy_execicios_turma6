package exercicio_easy;

import javax.swing.*;

public class Exec10OPTION3 {
    public static void main(String[] args) {
        double investimento, taxa = 0.05, valorJuros = 0, valorTotal = 0, i = 1;
        investimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Investimento"));
        while (i <= 10) {
            valorJuros = ((investimento + valorJuros) * taxa) + valorJuros;
            i = i + 1;
        }
        System.out.println("Valor do juros:"+valorJuros);
        System.out.println("Valor Investido:"+investimento);
        System.out.println("Valor Total:"+(investimento+valorJuros));
    }
}
