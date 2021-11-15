package introexceptiontrycatch;


import java.util.Arrays;
import java.util.List;

public class FirstLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("nyuszi", "tök", "kávé", null, "kamilla");
        try{
            for (String actual : words){
                System.out.print(actual.charAt(0) + " ");
            }
        }
        catch (NullPointerException npe){
            System.out.println();
            System.out.println("Van a listában egy null értékű változó! ");
        }
    }
}
