package looptypes;

import java.util.Arrays;
import java.util.List;

public class StudyGroup {
    public static void printStudyGroup(List<String> students){
        for (String item : students){
            if (item.length()<11){
                System.out.println(item + "  1. csoport");
            }
            else {
                System.out.println(item + "  2. csoport");
            }
        }
    }

    public static void main(String[] args) {
        List<String> students = Arrays.asList("_123456789", "BBBB", "CCCCCCCCCCC", "DDDDDDDDDDDDDDDDDDDD");
        printStudyGroup(students);
    }
}
