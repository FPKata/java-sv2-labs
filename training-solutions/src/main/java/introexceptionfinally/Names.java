package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Names {
    public String writeFirst(String prefix, List<String> names){
        for (String actual : names){
            if (actual.startsWith(prefix)){
                return actual;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Names name = new Names();
        try{
            //List<String> names = Files.readAllLines(Path.of("src/main/resources/names.txt"));
            //List<String> names = Files.readAllLines(Path.of("src/main/resources/names1.txt"));
            List<String> names = Files.readAllLines(Path.of("src/main/resources/names_.txt"));
            System.out.println(name.writeFirst("dr", names));
        }catch(IOException ioe){
            throw new IllegalStateException("Cannot read file!", ioe);
        }finally{
            System.out.println("End of reading");
        }
    }
}
