package exercicio_medium;

public class Exe3M {
    public static void main(String[] args) {
        int i = 0, soma = 0;
        while (i <= 1000) {
            soma = i + soma;
            if (soma <= 1500) {
                System.out.println("A soma é " + soma);
            }
            i++;
        }
    }
}

