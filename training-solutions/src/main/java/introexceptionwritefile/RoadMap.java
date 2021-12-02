package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    public static void main(String[] args) {
        List<String> towns = Arrays.asList("Hajdúdorog", "Debrecen", "Hajdúszoboszló", "Püspökladány", "Kisújszállás",
                "Szolnok", "Cegléd", "Budapest");
        Path path = Paths.get("roadmap.txt");
        try{
            Files.write(path, towns);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }

}
