package exercicio_easy;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Exec10OPTION2 {
    public static void main(String[] args) {
        double investimento,taxa=0.05,valorJuros=0,valorTotal=0,i=1;
        investimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Investimento"));

        while(i<=10){
            valorJuros= investimento*taxa+valorJuros;
            i=i+1;
        }
            System.out.println("Valor do Juros:"+valorJuros);
            System.out.println("Valor Investido:"+investimento);
            System.out.println("Valor Total:"+(investimento+valorJuros));
        }
    }

