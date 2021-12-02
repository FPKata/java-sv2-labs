package introexceptionwritefile;

import controladvanced.numbers.ForbiddenSevens;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        List<String> birthdays = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many data do you want to store?");
        int numberOfData;
        try{
            numberOfData = Integer.parseInt(scanner.nextLine());
        }catch(NumberFormatException nfe){
            throw new IllegalStateException("Not a number", nfe);
        }

        for (int i = 0; i < numberOfData; i++){
            System.out.println("Enter next name and birthday!");
            String data = scanner.nextLine();
            birthdays.add(data);
        }

        Path path = Paths.get("src/main/resources/birthdays.txt");
        try{
            Files.write(path, birthdays);
        }catch(IOException ioe){
            throw new IllegalStateException("Error while writing file!");
        }
    }
}
