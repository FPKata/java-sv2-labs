package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        //Összefűzés
        System.out.println(1 + "2");
        System.out.println("1" + 2);
        String numbers = "1" + "2";
        System.out.println(numbers);
        String num1 = "1";
        String num2 = "2";
        System.out.println(num1.concat(num2));
        //Osztás
        double quotient1 = 3 / 4;
        double quotient2 = 3.0 / 4;
        double quotient3 = 3 / 4.0;
        System.out.println(quotient1);
        System.out.println(quotient2);
        System.out.println(quotient3);
        //Nagy szám
        double number= 3_244_444_444D;
        long big = (long) number;
        System.out.println(big);
        //String, mint objektum
        String word = "title".toUpperCase();
        System.out.println(word);
        //Szám bináris stringként
        System.out.println("1 binárisan : 0b" + Integer.toBinaryString(1));
        System.out.println(0b1);
        System.out.println("-1 binárisan :0b" + Integer.toBinaryString(-1));
        System.out.println(0b11111111111111111111111111111111);
    }
}
