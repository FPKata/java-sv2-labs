package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Poem {
    public  List<String> readPoem(){
        try {
            return Files.readAllLines(Path.of("src/main/resources/poem.txt"));
        } catch (IOException ioe) {
            throw  new IllegalStateException("Cannot read file");
        }
    }

    public String getFirstLetters(List<String> lines){
        StringBuilder firstLetters = new StringBuilder();
        for (String actual : lines){
            firstLetters.append(actual.charAt(0));
        }
        return firstLetters.toString();
    }

    public static void main(String[] args) {
        try{
            List<String> lines = new Poem().readPoem();
            System.out.println(new Poem().getFirstLetters(lines));
        }catch(IllegalStateException ise){
            ise.printStackTrace();
        }
    }
}
