package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime){
        this.description = description;
        this.startTime = startTime;
    }

    public void registerPerson(int person){
        numberOfPeople = numberOfPeople + person;
    }

    public void ride(double km){
        kms = kms + km;
    }

    public String getDescription(){
        return description;
    }

    public LocalDate getStartTime(){
        return startTime;
    }

    public int getNumberOfPeople(){
        return numberOfPeople;
    }

    public double getKms(){
        return kms;
    }

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Makótól Jeruzsálemig", LocalDate.of(2021,12,31));
        System.out.println("Description :" + cyclingTour.getDescription());
        System.out.println("StartTime :" + cyclingTour.getStartTime());
        System.out.println("NumberOfPeople :" + cyclingTour.getNumberOfPeople());
        System.out.println("KMs :" + cyclingTour.getKms());

        cyclingTour.registerPerson(5);
        cyclingTour.ride(168);
        cyclingTour.registerPerson(15);
        cyclingTour.ride(97);

        System.out.println("Description :" + cyclingTour.getDescription());
        System.out.println("StartTime :" + cyclingTour.getStartTime());
        System.out.println("NumberOfPeople :" + cyclingTour.getNumberOfPeople());
        System.out.println("KMs :" + cyclingTour.getKms());
    }
}
