package exercicio_easy;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Exec8OPTION2 {
    public static void main(String[] args) {
        double salario, ir = 0;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        if (salario > 0 && salario<=1903.98)
        System.out.println("ISENTO");
        else
        {
            if (salario >= 1903.99 && salario <= 2826.65) {
                ir = (salario * 0.075) - 142.80;
            }
            if (salario >= 2826.66 && salario <= 3751.05) {
                ir = (salario * 0.15) - 354.80;
            }
            if (salario >= 3751.06 && salario <= 4664.68) {
                ir = (salario * 0.225) - 636.13;
            }
            if (salario > 4664.68) {
                ir = (salario * 0.275) - 869.36;
            }
            System.out.println("O valor do salario bruto é:" + salario);
            System.out.println("O valor do salario liquido é:" + (salario - ir));
            System.out.println("O valor do Imposto de renda é:" + ir);
            }
    }

}

