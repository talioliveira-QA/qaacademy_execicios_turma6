package exercicio_medium;

public class Exe4M {
    public void multiplicacao() {
        int i = 1, mult = 1;
        while (i <= 1000) {
            mult = i * mult;
            if (mult >= 1000) {
                mult = 1;
            }
            System.out.println(mult);
            i++;
        }
    }

//    public static void main(String[] args) {
//        int i = 1, mult = 1;
//        while (i <= 1000) {
//            mult = i * mult;
//            if (mult >= 1000) {
//                mult = 1;
//            }
//            System.out.println(mult);
//            i++;
//        }
//    }
}

//}//
