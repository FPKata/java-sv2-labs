package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Word {
    public String getFirstWordWithA(Path path){
        List<String> words = readWords(path);
        for (String actual : words){
            if (actual.startsWith("A")){
                return actual;
            }
        }
        return "A";
    }

    private List<String> readWords(Path path){
        try{
            return Files.readAllLines(path);
        }catch(IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }
}
