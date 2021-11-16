package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    private Office office = new Office();

    public void printMenu(){
        StringBuilder sb = new StringBuilder();
        office.printIfOfficeEmpty();
        sb.append("1. Tárgyaló rögzítése\n")
                .append("2. Tárgyalók sorrendben\n")
                .append("3. Tárgyalók visszafele sorrendben\n")
                .append("4. Minden második tárgyaló\n")
                .append("5. Területek\n")
                .append("6. Keresés pontos név alapján\n")
                .append("7. Keresés névtöredék alapján\n")
                .append("8. Keresés területek alapján\n")
                .append("9. Kilépés");
        System.out.println(sb);
    }

    public void readOffice(){
        String answer = "y";

        while(answer.equalsIgnoreCase("y")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Adja meg a tárgyaló adatait! (elnevezés, hosszúság, szélesség)");

            String name = scanner.nextLine();
            int length = scanner.nextInt();
            scanner.nextLine();
            int width = scanner.nextInt();
            scanner.nextLine();

            office.addMeetingRoom(new MeetingRoom(name, length, width));
            System.out.println("Felvettem a tárgyalót. Akar másikat felvenni? y/n");
            answer = scanner.nextLine();
        }
    }

    public void runMenu(){
        int numberOfMenu = 0;

        while (numberOfMenu != 9) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Válasszon a menüből!");
            numberOfMenu = scanner.nextInt();
            scanner.nextLine();
            switch (numberOfMenu) {
                case 1:
                    readOffice();
                    break;
                case 2:
                    office.printNames();
                    break;
                case 3:
                    office.printNamesReverse();
                    break;
                case 4:
                    office.printEvenNames();
                    break;
                case 5:
                    office.printAreas();
                    break;
                case 6:
                    office.printMeetingRoomsWithName();
                    break;
                case 7:
                    office.printMeetingRoomContains();
                    break;
                case 8:
                    office.printAreasLargerThan();
                    break;
                case 9:
                    System.out.println("Kilépés...");
                    break;
                default:
                    System.out.println("Ez nem érvényes választás.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();

        meetingRoomController.runMenu();

    }
}
