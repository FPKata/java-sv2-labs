package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        List<String> toDos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        while(!end){
            System.out.println("Enter next todo!");
            String toDo = scanner.nextLine();
            if("x".equals(toDo)){
                end = true;
            }else{
                toDos.add(toDo);
            }
        }

        Path path = Paths.get("src/main/resources/todos.txt");
        try{
            Files.write(path, toDos);
        }catch(IOException ioe){
            throw new IllegalStateException("Error while writing file!", ioe);
        }
    }
}
