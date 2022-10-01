package exercicio_medium;

public class Exe3M {
    public void somaNumeros() {
        int i = 0, soma = 0;
        while (i <= 1000) {
            soma = i + soma;
            if (soma <= 1500) {
                System.out.println("A soma é " + soma);
            }
            i++;
        }
    }
//    public static void main(String[] args) {
//        int i = 0, soma = 0;
//        while (i <= 1000) {
//            soma = i + soma;
//            if (soma <= 1500) {
//                System.out.println("A soma é " + soma);
//            }
//            i++;
//        }
//    }
}

//   Faça um algoritmo para calcular e exibir a soma de todos os números de 0 a 1000. E
//   parar se caso a soma atingir 1500(Ou mais). EX: 0 +1, 1+2, 3+4.. 1500 | break ou parar
