package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {
    public List<String> ReadTrackings(){
        try {
            return Files.readAllLines(Path.of("src/main/resources/tracking.csv"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }
    public List<Integer> getHeights(List<String> trackings){
        List<Integer> heights = new ArrayList<>();
        for (String actual : trackings){
            String[] temp = actual.split(";");
            int height = Integer.parseInt(temp[2]);
            heights.add(height);
        }
        return heights;
    }

    public void print (List<Integer> heights){
        for (int i = 0; i < heights.size() - 1; i++){
            System.out.println(heights.get(i + 1) - heights.get(i));
        }
    }
}
