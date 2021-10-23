package statements;

public class TimeMain {
    public static void main(String[] args) {
        Time time1 = new Time(13, 9, 51);
        Time time2 = new Time(14, 5, 27);

        int inMinutes = time1.getInMinutes();
        int inSeconds = time1.getInSeconds();
        System.out.println("In minutes: " + inMinutes);
        System.out.println("In seconds: " + inSeconds);

        boolean earlier = time1.earlierThan(time2);
        System.out.println(earlier);

        System.out.println(time1.toString());
        System.out.println(time2);

    }
}
