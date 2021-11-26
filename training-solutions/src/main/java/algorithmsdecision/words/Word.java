package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> words, String maxWord){
        boolean contains = false;
        int i = 0;
        while (!contains && i < words.size()){
            if (words.get(i).length() > maxWord.length()){
                contains = true;
            }
            i++;
        }
        return contains;
    }
}
