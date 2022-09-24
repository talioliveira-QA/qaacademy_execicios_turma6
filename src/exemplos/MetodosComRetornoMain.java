package exemplos;

public class MetodosComRetornoMain {
    public static void main(String[] args) {
        String nomeAll = nome()+ "  "+ nome1()+ "  "+ nome2()+ "  "+ nome3() +"  "+ nome4();
        System.out.println(nomeAll);
           }
    public static String nome(){
        return "Talita";
            }
    public static String nome1(){
        return "Adriano";
    }
    public static String nome2(){
        return "Vivi";
    }
    public static String nome3(){
        return "Lívia";
    }
    public static String nome4(){
        return "Pepe";
    }
}
