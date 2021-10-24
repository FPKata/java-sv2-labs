package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1999-12-31");
        LocalTime startTime = LocalTime.parse("19:00");
        LocalTime endTime = LocalTime.parse("21:00");

        Performance performance = new Performance(date,"Artist", startTime, endTime);
        System.out.println(performance.getInfo());
    }
}
