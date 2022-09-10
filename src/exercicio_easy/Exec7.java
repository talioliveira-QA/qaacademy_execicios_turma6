package exercicio_easy;

import javax.swing.*;

public class Exec7 {
    public static void main(String[] args) {
        double salario, inss1, inss2, inss3, inss4;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o salario"));
        inss1 = (salario * 0.075);
        inss2 = (salario * 0.09);
        inss3 = (salario * 0.12);
        inss4 = (salario * 0.14);
        if (salario <= 1045.00)
            System.out.println("O valor a ser pago é:" + inss1);
        if (salario >= 1045.00 && salario <= 2089.60)
            System.out.println("O valor a ser pago é:" + inss2);
        if (salario >= 2089.61 && salario <= 3134.40)
            System.out.println("O valor a ser pago é:" + inss3);
        if (salario >= 3134.41 && salario <= 6101.06)
            System.out.println("O valor a ser pago é:" + inss4);
    }
}
