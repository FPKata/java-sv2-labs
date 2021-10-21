package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distanceInKm =new Distance(342.09, false);
        System.out.println("The measured distance is " + distanceInKm.getDistanceInKm() + " km and this is " + distanceInKm.isExact() + ".");
        int newDistance = (int) distanceInKm.getDistanceInKm();
        System.out.println(newDistance);
    }
}
