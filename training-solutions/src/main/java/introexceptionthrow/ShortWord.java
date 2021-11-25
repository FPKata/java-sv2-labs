package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = scanner.nextLine();

        if (word.length() > 6){
            throw new IllegalArgumentException("Too long word!");
        }
        for (int i = 0; i < word.length(); i++){
            if (!Character.isLetter(word.charAt(i))){
                throw new IllegalArgumentException("Contains other characters");
            }
        }
        System.out.println("Your choice is " + word);
    }
}
