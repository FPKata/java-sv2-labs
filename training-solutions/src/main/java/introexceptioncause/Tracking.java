package introexceptioncause;

import java.util.List;

public class Tracking {
    public static void main(String[] args) {
        TrackPoints trackPoints = new TrackPoints();
        try{
            List<String> trackings = trackPoints.ReadTrackings();
            List<Integer> heights = trackPoints.getHeights(trackings);
            trackPoints.print(heights);
        }catch(IllegalStateException ise){
            ise.printStackTrace();
        }
    }
}
