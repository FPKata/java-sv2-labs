package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

public class PaulStreetBoys {
    public List<String> readNames(){
        try {
            return Files.readAllLines(Path.of("src/main/resources/palutcaifiuk.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file!", ioe);
        }
    }

    public void writeNamesToConsol(List<String> names){
        for (String actual : names){
            if (actual.equals("Nemecsek Ernő")){
                System.out.println(actual.toLowerCase());
            }else{
                System.out.println(actual);
            }
        }
    }
    public static void main(String[] args) {
        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();

        try{
            List<String> names = paulStreetBoys.readNames();
            paulStreetBoys.writeNamesToConsol(names);
        }catch(IllegalStateException ise){
            ise.printStackTrace();
        }
    }
}
