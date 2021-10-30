package chars;

import java.util.Scanner;

public class Words {
    public String  pushWord(String word){
        String newWord = "";
        for (int i = 0; i < word.length(); i++){
            newWord = newWord + (char) (word.charAt(i) + 1);
        }
       return newWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your word?");
        String word = scanner.nextLine();
        Words words = new Words();
        System.out.println(words.pushWord(word));
    }
}
