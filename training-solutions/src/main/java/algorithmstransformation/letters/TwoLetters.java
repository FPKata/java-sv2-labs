package algorithmstransformation.letters;

import java.util.ArrayList;
import java.util.List;

public class TwoLetters {
    public List<String> getFirstTwoLetters(List<String> words){
        List<String> firstTwoLetters = new ArrayList<>();
        for (String actual : words){
            firstTwoLetters.add(actual.substring(0, 2));
        }
        return  firstTwoLetters;
    }
}
