package primitiveTypes;

public class PrimitiveTypesMain {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a);
        Integer b = 2;  //boxing
        System.out.println(b);
        Integer c = a;  //boxing
        System.out.println(c);
        Integer d = b;
        System.out.println(d);
        Integer e = Integer.valueOf(2);
        System.out.println(e);
        System.out.println("--------");
        int f = Integer.valueOf(2);  //unboxing
        System.out.println(f);
        int g = Integer.valueOf(a);  //unboxing
        System.out.println(g);
        int h = Integer.valueOf(c);  //unboxing
        System.out.println(h);
        int i = Integer.parseInt("2");
        System.out.println(i);
        Integer j = Integer.parseInt("2");
        System.out.println(j);  //unboxing
        System.out.println("++++++++++++++++++++++++");
        boolean k = true;
        System.out.println(k);
        Boolean l = true;  //boxing
        System.out.println(l);
        boolean m = Boolean.valueOf(true);  //unboxing
        System.out.println(m);
        Boolean n = Boolean.valueOf(true);
        System.out.println(n);
        boolean o = Boolean.parseBoolean("TrUe");
        System.out.println(o);
        System.out.println("-------");
        Boolean p = Boolean.parseBoolean("TrUe");  //boxing
        System.out.println(p);
        boolean q = Boolean.parseBoolean("TreU");
        System.out.println(q);
        Boolean r = Boolean.parseBoolean("TreU");  //boxing
        System.out.println(r);
    }
}
