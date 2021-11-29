package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Operations {

    public List<String> readFile() throws IOException {
        return Files.readAllLines(Path.of("underground.txt"));
    }

    public String getDailySchedule(List<String> list){
        StringBuilder dailySchedule = new StringBuilder(LocalDate.now().toString());
        dailySchedule.append(", ");
        for (String actual : list){
            if (actual.charAt(0) == '2'){
                dailySchedule.append(actual + " ");
            }
        }
        return dailySchedule.toString();
    }
}
