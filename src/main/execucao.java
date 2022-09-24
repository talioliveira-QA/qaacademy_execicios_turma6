package main;

import exemplos.MetodoSemMain;
import exercicio_easy.Exec2;
import exercicio_easy.Exec3;
import exercicio_easy.Exec4;
import exercicio_easy.Exec5;

import java.sql.SQLOutput;

public class execucao {
    public static void main(String[] args) {
        Exec5 exec5 = new Exec5();
        int num1 = 8, num2 = 3, num3 = 2;
        System.out.println(exec5.soma(8,3,2));
        System.out.println(exec5.subtracao(8,3,2));
        System.out.println(exec5.multiplicacao(8,3,2));
        System.out.println(exec5.media(8,3,2));

//        Exec4 exec4 = new Exec4();
//        System.out.println(exec4.dobroNum(3));


//        Exec3 exec3 = new Exec3();
//        System.out.println(exec3.nomeSobrenome("Lívia","Valentina"+" "));


//        Exec2 exec2 = new Exec2();
//        System.out.println(exec2.exibirPalavra(" Lívia Valentina"));

//        MetodoSemMain instanciacao = new MetodoSemMain();
//        instanciacao.escreverNomeSobrenome();
//        System.out.println(instanciacao.nome+instanciacao.sobrenome);
//        System.out.println(instanciacao.nomeFilha());
//        System.out.println(instanciacao.nomeFilha1("Lívia ", "Valentina"));
    }
}
