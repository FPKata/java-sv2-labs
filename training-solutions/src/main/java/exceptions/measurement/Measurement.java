package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {
    public List<String> readFromFile(Path path){
        try {
            return Files.readAllLines(path);

            }catch(IOException ioe){
                throw new IllegalStateException("Cannot read file.", ioe);
            }
        }

    public List<String> validate(List<String> lines){
        List<String> linesWithErrors = new ArrayList<>();
        for (String actual : lines){
            if (!isValidLine(actual)){
                linesWithErrors.add(actual);
            }
        }
        return linesWithErrors;
    }

    private boolean isValidLine(String actual) {
        String[] parts = actual.split(",");
        try{
            return validateLength(parts)
                    && validateLineNumber(parts[0])
                    && validateMeasuredValue(parts[1])
                    && validateName(parts[2]);
        }catch(IndexOutOfBoundsException e){
            return false;
        }
    }

    private boolean validateName(String part) {
        String[] nameParts = part.split(" ");
        return nameParts.length >= 2;
    }

    private boolean validateMeasuredValue(String part) {
        try{
            Double.parseDouble(part);
            return true;
        }catch(NumberFormatException nfe){
            return false;
        }
    }

    private boolean validateLineNumber(String part) {
        try{
            Integer.parseInt(part);
            return true;
        }catch(NumberFormatException nfe){
            return false;
        }
    }

    private boolean validateLength(String[] parts) {
        return parts.length == 3;
    }
}
