package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        System.out.println("Persons:");
        Scanner scanner = new Scanner((System.in));
        int persons = scanner.nextInt();
        boolean Boat2IsFree = true;
        boolean Boat3IsFree = true;
        boolean Boat5IsFree = true;

        switch (persons) {
            case 1:
            case 2:
                Boat2IsFree = false;
                break;
            case 3:
                Boat3IsFree = false;
                break;
            case 4:
            case 5:
                Boat5IsFree = false;
                break;
            case 6:
            case 7:
                Boat2IsFree = false;
                Boat5IsFree = false;
                break;
            case 8:
                Boat3IsFree = false;
                Boat5IsFree = false;
                break;
            default:
                Boat2IsFree = false;
                Boat3IsFree = false;
                Boat5IsFree = false;
        }
        String str2 = !Boat2IsFree ? "Boat for 2 occupied" : "";
        String str3 = !Boat3IsFree ? "Boat for 3 occupied" : "";
        String str5 = !Boat5IsFree ? "Boat for 5 occupied" : "";
        String message = str2 + "\n" + str3 + "\n" + str5;
        int leftInPersons = persons > 10 ? persons - 10 : 0;
        System.out.println(message);
        System.out.println("Persons left on beach: " + leftInPersons);
    }
}
