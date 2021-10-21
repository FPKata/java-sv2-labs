package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        boolean b = false;
        //System.out.println("Not initialized b (boolean) :" + b) ;
        System.out.println(b);

        int a = 2; a = 4;
        System.out.println("a = " + a);

        //System.out.println("i (not defined yet) = " + i);
        int i = 3;
        int j = 4;
        System.out.println("i = "+ i + "   j = " + j);

        int k = i;
        System.out.println("k = " + k);

        String s = "Hello World!";
        System.out.println(s);

        String t = s;
        System.out.println(t);

        {
            int x = 0;
            System.out.println("x = " + x);
            System.out.println("a = " + a);
        }
        //System.out.println("x = " + x);
    }
}
