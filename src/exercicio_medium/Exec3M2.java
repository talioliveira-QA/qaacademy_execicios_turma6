package exercicio_medium;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Exec3M2 {
    public static void main(String[] args) {
        int i=0, soma=0;
        while (i<=1000){
            soma= i+soma;
            if (soma >= 1500)
            break;//parar FIM SE
            System.out.println(soma);
            i++;//i=i+1
            }
        }//FIM ENQUANTO
     }

