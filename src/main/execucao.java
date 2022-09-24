package main;

import exemplos.MetodoSemMain;

public class execucao {
    public static void main(String[] args) {
        MetodoSemMain instanciacao = new MetodoSemMain();
        instanciacao.escreverNomeSobrenome();
        System.out.println(instanciacao.nome+instanciacao.sobrenome);
        System.out.println(instanciacao.nomeFilha());
        System.out.println(instanciacao.nomeFilha1("Lívia ", "Valentina"));
    }
}