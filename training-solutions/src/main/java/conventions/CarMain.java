package conventions;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car("Suzuki", "XBZ", 5, 7);

        System.out.println("Your car is a(n) " + myCar.getCarType());
        System.out.println("Its engine is " + myCar.getEngineType());
        System.out.println("It has got " + myCar.getDoors() + " doors");
        System.out.println(myCar.getPersons() + " person(s) can be seated");

        myCar.setCarType("Ford");
        myCar.setEngineType("ABC");
        myCar.setDoors(3);
        myCar.setPersonS(5);
        myCar.addModelName("Focus");

        System.out.println("Your car is a(n) " + myCar.getCarType());
        System.out.println("Its engine is " + myCar.getEngineType());
        System.out.println("It has got " + myCar.getDoors() + " doors");
        System.out.println(myCar.getPersons() + " person(s) can be seated");
    }
}
