package exercicio_easy;

import javax.swing.*;

public class Exec7option1 {
    public static void main(String[] args) {
        double salario, inss;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o salario"));
        if (salario<=1045.00) {
            inss = salario * 0.075;
            System.out.println("O valor a ser pago é:" + inss);
        }
        if(salario>=1045.01&&salario<=2089.00){
            inss = salario*0.09;
            System.out.println("O valor a ser pago é:"+inss);
        }
        if(salario>=2089.61&&salario<=3134.40){
            inss=salario*0.12;
            System.out.println("O valor a ser pago é:"+inss);
        }
        if(salario>=3134.41&&salario<=6110.06){
            inss=salario*0.14;
            System.out.println("O valora ser pago é:"+inss);
        }



    }
}
