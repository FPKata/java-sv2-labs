package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {
    private List<Hour> hoursOfDay = new ArrayList<>();

    public void addHour(Hour hour){
        hoursOfDay.add(hour);
    }

    public void setDayPeriod(){
        for (Hour actual : hoursOfDay){
            if (actual.getHourNumber() < 22 && actual.getHourNumber() > 6){
                actual.setPeriod(DayPeriod.DAYTIME);
            }
            else{
                actual.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }
}
