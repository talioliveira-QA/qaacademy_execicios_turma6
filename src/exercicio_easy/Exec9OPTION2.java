package exercicio_easy;

public class Exec9OPTION2 {
    public int tabuada(int numeroDigitado) {
        int i = 0, resultado = 0;

        while (i <= 10) {
            resultado = numeroDigitado * i;
            i++;
        }
        return numeroDigitado;
    }
}


//    public String [] Tabuada(int numeroDigitado){
//        int i = 0;
//        String vetorTabuada[] = new String[11];
//        while (i<=10) {
//            vetorTabuada[i]=numeroDigitado+ " x "+i+ " = "+ numeroDigitado*i;
//            i++;
//        }
//        return vetorTabuada;
//    }
//    }
//    public String Tabuada(int numeroDigitado, int i) {
//        while (i <= 10) {
//                        return numeroDigitado + " x " + i + " = " + numeroDigitado * i;
//        }
//        return null;
//    } **TENTATIVA SEM VETOR




//OBS: NÃO CONSEGUI REPLICAR O i+i=1

//    public static void main(String[] args) {
//        int numeroDigitado,i=1;
//        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite numero inteiro"));
//        while(i<=10) {
//            System.out.println(numeroDigitado + "x" + i + "=" + numeroDigitado * i);
//            i = i + 1;
//        }
//    }


//Faça um algoritmo para ler um número inteiro entre: 1 e 10, calcular e exibir a tabuada deste
// número digitado. Ex.: 10 x 1 = 10, .., 10 x 10 = 100.