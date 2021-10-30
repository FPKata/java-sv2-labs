package chars;

import java.util.Scanner;

public class LettersAndDigits {

    public String printLetterOrDigit(String test) {
        String str ="";
        for (int i = 0; i < test.length(); i++) {
            if (Character.isAlphabetic(test.charAt(i))) {
                str += test.charAt(i) + " : betű\n";
            } else if (Character.isDigit(test.charAt(i))) {
                str += test.charAt(i) + " : számjegy\n";
            } else {
                str += test.charAt(i) + " : egyéb\n";
            }
        }
        return str;
    }

    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy tetszőleges karaktersorozatot!");
        String test = scanner.nextLine();
        System.out.println(lettersAndDigits.printLetterOrDigit(test));
    }
}
