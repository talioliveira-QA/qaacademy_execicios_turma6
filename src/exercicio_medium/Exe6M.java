package exercicio_medium;

public class Exe6M {
    public static void main(String[] args) {
        int fat=10,i,fatfixo;
        i=fat;
        fatfixo=fat;
        while(i>1){
            fat=fat*(i-1);
            i--;
        }
        System.out.println("O valor fatorial de "+fatfixo+" é:"+fat);
    }
}
