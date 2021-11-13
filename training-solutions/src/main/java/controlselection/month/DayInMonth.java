package controlselection.month;

//import java.util.GregorianCalendar;

public class DayInMonth {
    public int getDaysOfMonth(int year, String month){
        //GregorianCalendar gc = new GregorianCalendar();
        switch (month.toLowerCase()){
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
               return 31;
            case "április":
            case "június":
            case "szeptember":
            case "november":
                return 30;
            case "február":
                //if (isLeapYear(year))
                if ((year > 1582) && (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                    return 29;
                }
                else{
                    return 28;
                }
            default:
                return 0;
        }
    }
}
