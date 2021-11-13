package formatlocalprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private List<Double> kmsPerDay = new ArrayList<>();
    private String name;

    public Run(String name){
        this.name = name;
    }

    public void addRun(double km){
        kmsPerDay.add(km);
    }

    public String printFormattedRunText(){
        return String.format("Kedves %s! A mai dátum: %tD. Ezen a héten ez a(z) %d. futásod. " +
                "Most %.2f km-t futottál", name, LocalDate.now(), kmsPerDay.size() - 1, kmsPerDay);
    }
}
