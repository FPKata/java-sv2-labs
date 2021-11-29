package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Neptun {

    public  List<String> readCodes() throws IOException {
        return Files.readAllLines(Path.of("neptun.csv"));
    }
    public static void main(String[] args) {
        try{
            List<String> codes = new Neptun().readCodes();
            System.out.println(codes);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
