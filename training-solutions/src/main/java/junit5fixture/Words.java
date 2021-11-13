package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public void addWord(String word){
        words.add(word);
    }

    public void getWordsStartWith(String prefix){
        //System.out.println(prefix + " " + prefix.length());
        List<String> wordsToRemove = new ArrayList<>();
        int prefixLength = prefix.length();
        for (String actual : words){
            if (!actual.substring(0, prefixLength).equals(prefix)){
                //System.out.println(actual.substring(0, prefixLength));
                wordsToRemove.add(actual);
            }
        }
        words.removeAll(wordsToRemove);
    }

    public void getWordsWithLength(int length){
        List<String> wordsToRemove = new ArrayList<>();
        for (String actual : words){
            if (actual.length() != length){
                wordsToRemove.add(actual);
            }
        }
        words.removeAll(wordsToRemove);
    }

    public List<String> getWords() {
        return words;
    }
}
