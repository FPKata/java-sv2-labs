package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        System.out.println(IntroControl.subtractTenIfGreaterThanTen(3));
        System.out.println(IntroControl.describeNumber(1));
        System.out.println(IntroControl.greetingToJoe("Joe"));
        System.out.println(IntroControl.calculateBonus(100000));
        System.out.println(IntroControl.calculateConsumption(11000, 10012));
        IntroControl.printNumbers(22);
        IntroControl.printNumbersBetween(12, 25);
        IntroControl.printNumbersBetweenAnyDirection(35,44);
        IntroControl.printOddNumbers(23);
    }
}
