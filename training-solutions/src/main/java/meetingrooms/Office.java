package meetingrooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    //1
    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }
    //2
    public void printNames(){
        for (MeetingRoom actual : meetingRooms){
            System.out.print(actual.getName() + " ");
        }
        System.out.println();
    }
    //3
    public void printNamesReverse(){
        List<String> reverseList = new ArrayList<>();
        int listSize = meetingRooms.size();

        for (int i = listSize - 1; i >= 0; i--){
            reverseList.add(meetingRooms.get(i).getName());
        }
        for (String actual : reverseList){
            System.out.print(actual + " ");
        }
        System.out.println();
    }
    //4
    public void printEvenNames(){
        for (int i = 1; i < meetingRooms.size(); i += 2){
            System.out.println(meetingRooms.get(i).getName() + " ");
        }
        System.out.println();
    }
    //5
    public void printAreas(){
        for (MeetingRoom actual : meetingRooms){
            System.out.println(actual.getName() + " ");
            printWidthLengthArea(actual);
        }
        System.out.println();
    }
    //6
    public void printMeetingRoomsWithName(){
        System.out.println("Melyik tárgyalót keresi? Kérem, írja be a nevét!");
        Scanner scanner = new Scanner(System.in);
        String nameForSearching = scanner.nextLine();
        for (MeetingRoom actual : meetingRooms){
            if (nameForSearching.equals(actual.getName())){
                printWidthLengthArea(actual);
            }
        }
        System.out.println();
    }
    //7
    public void printMeetingRoomContains(){
        System.out.println("Mi a névtöredék, ami alapján keresi a tárgyalót?");
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        for (MeetingRoom actual : meetingRooms) {
            for (int i = 0; i <= actual.getName().length() - part.length(); i++) {
                if (part.equalsIgnoreCase(actual.getName().substring(i, i + part.length()))){
                    printWidthLengthArea(actual);
                }
            }
        }
        System.out.println();
    }
    //8
    public void printAreasLargerThan(){
        System.out.println("Mekkora területnél legyen nagyobb a tárgyaló?");
        Scanner scanner = new Scanner(System.in);
        int minimumArea = scanner.nextInt();
        for (MeetingRoom actual : meetingRooms){
            if (actual.getArea(actual.getLength(), actual.getWidth()) > minimumArea){
                System.out.print(actual.getName() + " ");
                printWidthLengthArea(actual);
            }
        }
        System.out.println();
    }

    public void printWidthLengthArea(MeetingRoom actual){
        System.out.println(actual.getWidth() + " * "
                + actual.getLength() + " = "
                + actual.getArea(actual.getLength(), actual.getWidth()));
    }

    public void printIfOfficeEmpty(){
        if (meetingRooms.size() == 0){
            System.out.println("Nincs még egy tárgyaló sem a rendszerben.\n" +
                                "Kérem válassza az 1. menüpontot!");
                }
    }
}
