package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
       // System.out.println(args.length);
        for (String item : args) {
            switch (item) {
                case "/add":
                    System.out.println("Hozzáadás");
                    break;
                case "/list":
                    System.out.println("Listázás");
                    break;
                case "/delete":
                    System.out.println("Törlés");
                    break;
                default:
                    System.out.println("Ismeretlen művelet");
            }
        }
    }
}

