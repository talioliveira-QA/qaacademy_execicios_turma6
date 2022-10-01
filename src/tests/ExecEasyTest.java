package tests;

import exercicio_easy.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExecEasyTest {
    @

    @Test
    public void exibirInss1(){
        Exec7 exec7 = new Exec7();
        String inss = exec7.exibirInss(1010.00);
        assertEquals("O valor a ser pago é:75.75",inss);
    }

    @Test
    public void resultadoAprovado() {
        Exec6 exec6 = new Exec6();
        String media = exec6.notas(6, 8);
        assertEquals("Aprovado", media);
    }

    @Test
    public void resultadoReprovado() {
        Exec6 exec6 = new Exec6();
        String media = exec6.notas(2, 5);
        assertEquals("Reprovado", media);
    }
        @Test
        public void resultaExame(){
        Exec6 exec6 = new Exec6();
        String media = exec6.notas(5,5);
        assertEquals("Exame",media);
        }

    @Test
    public void soma3Numeros() {
        Exec5 exec5 = new Exec5();
        String soma = exec5.soma(8, 3, 1);
        assertEquals("A soma é:12", soma);
    }

    @Test
    public void subtracao3Numeros() {
        Exec5 exec5 = new Exec5();
        String subtracao = exec5.subtracao(8, 3, 1);
        assertEquals("A subtração é:4", subtracao);
    }

    @Test
    public void exibirMultiplicacao() {
        Exec5 exec5 = new Exec5();
        String multiplicacao = exec5.multiplicacao(2, 3, 1);
        assertEquals("A multiplicação é:6", multiplicacao);
    }

    @Test
    public void exibirMedia() {
        Exec5 exec5 = new Exec5();
        String media = exec5.media(2, 3, 4);
        assertEquals("A media é:3", media);
    }

    @Test
    public void exibirDobro() {
        Exec4 exec4 = new Exec4();
        String dobro = exec4.dobroNum(10);
        assertEquals("O dobro é: 20", dobro);
    }

    @Test
    public void nomeSobrenome() {

        Exec3 exec3 = new Exec3();
        exec3.nomeSobrenome("João", "Souza");
        assertEquals("Souza João", exec3.nomeSobrenome("João", "Souza"));
    }

    @Test
    public void testeDeJuncaoPalavra() {
        Exec2 exec2 = new Exec2();
        exec2.exibirPalavra("Bolsonaro");
        assertEquals("A palavra é:Bolsonaro", exec2.exibirPalavra("Bolsonaro"));
    }


}
