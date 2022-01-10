package methodoverloading;

import java.util.Arrays;
import java.util.List;

public class ClassFiveA {
    private List<String> students = Arrays.asList("Gárdos Helga", "Joó Lilla", "Kiss József", "Nagy Béla",
            "Németh Dóra", "Pongrácz Imola", "Rendes Richárd", "Szabó Nóra", "Takács Júlia", "Vígh Elemér");

    public String getTodayReferringStudent(int number){
        return students.get(number - 1);
    }

    public String getTodayReferringStudent(Number number){
        return students.get(number.getValue() - 1);
    }

    public String getTodayReferringStudent(String number){
        return students.get(Number.valueOf(number.toUpperCase()).getValue() - 1);
    }
}
