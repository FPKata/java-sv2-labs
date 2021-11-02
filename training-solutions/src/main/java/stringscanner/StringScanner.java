package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a barokk körmondatot!");
        String sentence = scanner.nextLine();

        Scanner sentenceByWords = new Scanner(sentence);
        while (sentenceByWords.hasNext()){
            System.out.println(sentenceByWords.next());
        }
        System.out.println("---------------------------");
        System.out.println("Kérem a barokk körmondatot!");
        String anotherSentence = scanner.nextLine();

        Scanner anotherSentenceByClause = new Scanner(anotherSentence).useDelimiter(", ");
        while (anotherSentenceByClause.hasNext()){
            System.out.println(anotherSentenceByClause.next());
        }
    }
}
