package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Shopping {
    public static void main(String[] args) {
        try{
            List<String> shoppingList = Files.readAllLines(Path.of("shopping.txt"));
            System.out.println(shoppingList);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
