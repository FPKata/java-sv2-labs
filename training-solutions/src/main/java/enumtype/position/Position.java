package enumtype.position;

public enum Position {
    MANAGER(300000,"Free car"), RECEPTIONIST(100000, "Free coffee"),
    HR(250000,"Free petrol"), DIRECTOR(500000, "Free holidays"),
    SECRETARY(180000,"Free lunch");
    private int salary;
    private String benefit;
    Position(int salary, String benefit){
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary(){
        return salary;
    }

    public String getBenefit(){
        return benefit;
    }
}
