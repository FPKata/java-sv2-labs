package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Holiday {
    public static void main(String[] args) {
        try{
            List<String> holidayList = Files.readAllLines(Path.of("holiday_.txt"));
            System.out.println(holidayList);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
