package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {
    public List<String> getStreets(){
        List<String> streets = new ArrayList<>();
        streets.add(LocalDate.now().toString());
        streets.add("Alma utca");
        streets.add("Körte utca");
        streets.add("Fecske utca");
        streets.add("Tó utca");
        return streets;
    }

    public void writeStreets(Path path){
        List<String> streets = getStreets();
        try{
            Files.write(path, streets);
        }catch(IOException ioe){
           throw new IllegalStateException("Error while writing file", ioe);
        }
    }
}
