package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public String getDeletedFlights(){
        StringBuilder sb = new StringBuilder("Törölt járatok: ");
        for (Flight f : flights) {
            if (f.getStatus() == Status.DELETED){
                sb.append("\n");
                sb.append(f.getFlightNumber());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Airport airport = new Airport();
        Flight flight1 = new Flight("AS-1234", Status.ACTIVE);
        Flight flight2 = new Flight("AS-5678", Status.DELETED);
        Flight flight3 = new Flight("AS-5432", Status.DELETED);
        Flight flight4 = new Flight("AS-1111", Status.ACTIVE);
        Flight flight5 = new Flight("AS-2222", Status.ACTIVE);
        airport.addFlight(flight1);
        airport.addFlight(flight2);
        airport.addFlight(flight3);
        airport.addFlight(flight4);
        airport.addFlight(flight5);

        String deletedFlights = airport.getDeletedFlights();
        System.out.println(deletedFlights);
    }
}
