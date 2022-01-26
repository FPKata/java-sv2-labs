package streamsalgorithms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int yearOfBirth;

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}' + "\n";
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Kiss Mari", 1999),
                new Employee("Nagy Géza", 1980),
                new Employee("Aradszky Arabella", 1987),
                new Employee("Babos Vajk", 2001),
                new Employee("Oláh Mónika", 2011),
                new Employee("Kovács Ágota", 1988),
                new Employee("Török Kálmán", 2020),
                new Employee("Zeleni Titusz", 1966));

        //Összegezd az alkalmazottak születési éveit!
        int sum = employees
                .stream()
                .mapToInt(Employee::getYearOfBirth)
                .sum();
        System.out.println(sum);

        //Összegezd az alkalmazottak életkorát!
        int sumAges = employees
                .stream()
                .mapToInt(employee -> employee.getYearOfBirth())
                .map(n -> LocalDate.now().getYear() - n)
                .sum();
        System.out.println(sumAges);

        //Add vissza streammel, hány alkalmazott van a listában!
        long count = employees
                .stream()
                .count();
        System.out.println(count);

        //Add vissza, hány alkalmazott született 1990-nél korábban!
        long countEarlierThan = employees
                .stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .count();
        System.out.println(countEarlierThan);

        //Add vissza a legkorábban született alkalmazott születési évét!
        int min = employees
                .stream()
                .mapToInt(Employee::getYearOfBirth)
                .min()
                .orElseThrow(() -> new IllegalArgumentException("Empty list"));
        System.out.println(min);

        //Add vissza a legkorábban született alkalmazott nevét! (Itt szükség lesz a findFirst() záróműveletre.)
        String name = employees
                .stream()
                .sorted(new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.getYearOfBirth() - o2.getYearOfBirth();
                    }
                })
                .map(Employee::getName)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Empty"));
        System.out.println(name);

        //Add vissza, hogy igaz-e, hogy minden alkalmazott 1980 előtt született-e?
        boolean before = employees
                .stream()
                .allMatch(employee -> employee.getYearOfBirth() < 1980);
        System.out.println(before);

        //Add vissza egy listában az összes, 1990-nél korábban született alkalmazottat!
        System.out.println(employees
                .stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .collect(Collectors.toList()));

        //Add vissza egy listában az összes alkalmazott nevét!
        System.out.println(employees
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toList())
        );

        //Add vissza egy listában az összes, 1990-nél korábban született alkalmazott nevét!
        System.out.println(employees
                .stream()
                .filter(employee -> employee.getYearOfBirth() < 1990)
                .map(Employee::getName)
                .collect(Collectors.toList()));
    }
}
