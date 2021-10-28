package intromethods.employee;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate hiringYear;
    private int salary;

    public Employee(String name, LocalDate hiringYear, int salary){
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    public void raiseSalary(int raising){
        salary = salary + raising;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                '}';
//    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", hiringYear=" + hiringYear +
//                ", salary=" + salary +
//                '}';
//    }

    public String getName(){
        return name;
    }

    public LocalDate getHiringYear(){
        return hiringYear;
    }


    public int getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name = name;
    }
}
