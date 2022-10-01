package exercicio_easy;

public class Exec6 {

    public String notas(int nota1, int nota2) {
      int media = (nota1+nota2)/2;
        if (media > 5) {
            return "Aprovado";
        }
        if (media < 5) {
            return "Reprovado";
        }
        if (media == 5) {
            return "Exame";
        }
        return null;
    }
}




//    public static void main(String[] args) {
//        int nota1, nota2, media;
//        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota1"));
//        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota2"));
//        media = (nota1 + nota2) / 2;
//        if (media > 5)
//            System.out.println("Aprovado");
//        if (media < 5)
//            System.out.println("Reprovado");
//        if (media == 5)
//            System.out.println("Exame");
//    }


//    Faça um algoritmo para ler duas notas, calcular a média.
//        E SE - a média > 5 Exibir aprovado;SE a média < que 5 exibir reprovado;
//        Se media = 5 exibir exame.
