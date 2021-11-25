package introexceptionthrow;

public class Adult {
    private String name;
    private int age;

    public Adult(int age) {
        this.age = age;
        if (age < 18){
            throw new IllegalArgumentException("Too young person. Rejected.");
        }else{
            System.out.println("OK");
        }
    }
}
