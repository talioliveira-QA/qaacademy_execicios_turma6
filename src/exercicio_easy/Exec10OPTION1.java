package exercicio_easy;

public class Exec10OPTION1 {
public String investimento(double valorInvestimento, double taxaJuros){
    taxaJuros = taxaJuros*10;
    double valorJuros = valorInvestimento*taxaJuros;
    double valorTotal = valorInvestimento+valorJuros;
    return "O valor de investimento é de "+valorInvestimento+ ", "+ "renderá em 10 anos "+valorJuros +"" +
            " de juros, resultando no valor total de "+valorTotal;



}

//    public static void main(String[] args) {
//        double valorInvestimento,taxaJuros,valorJuros,valorTotal;
//        valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Investimento"));
//        taxaJuros = 0.05*10;
//        valorJuros = valorInvestimento*taxaJuros;
//        valorTotal = valorInvestimento+valorJuros;
//        System.out.println("Você investiu:"+valorInvestimento);
//        System.out.println("Rendeu:"+valorJuros+" de juros");
//        System.out.println("O valor total é:"+valorTotal);
//    }
}

//Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a. Ao final
//de 10 anos, exibir o valor investido, valor de juros e o total com juros. Considerando que a remuneração será
//no regime de juros simples
