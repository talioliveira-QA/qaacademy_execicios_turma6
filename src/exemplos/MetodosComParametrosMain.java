package exemplos;

public class MetodosComParametrosMain {
    public static void main(String[] args) {
        System.out.println(texto1("Talita ","Oliveira")+ ", "+ texto3("Lívia ","Oliveira")+ ", "+ texto5("Vitória ","Oliveira")+ " e "+ texto7("Adriano ","Oliveira"));
        texto("Talita", "Oliveira");
        texto2("Adriano","Oliveira");
        texto4("Vitória","Oliveira");
        texto6("Lívia","Valentina");
    }
    public static void texto(String a, String b) {
        System.out.println(a+" "+   b);
    }
    public static String texto1(String a, String b) {
        return a + b;
    }
    public static void texto2(String c, String d) {
        System.out.println(c+" "+d);
    }
    public static String texto3(String c,String d){
        return c + d;
    }
        public static void texto4(String e, String f){
            System.out.println(e+" "+f);
    }
    public static String texto5(String e, String f){
        return e + f;
    }
    public static void texto6(String g, String h){
        System.out.println(g+" "+h);
    }
    public static String texto7(String g, String h){
        return g + h;
    }

}
