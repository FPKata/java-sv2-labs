package inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Jonh Doe", 30000);
        PriorityPassenger priorityPassenger = new PriorityPassenger("Jack Doe", 30000, 20);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Jane Doe", 30000,
                20);
        System.out.println(passenger.getName());
        System.out.println(passenger.getPriceOfPlaneTicket());
        System.out.println(priorityPassenger.getName());
        System.out.println(priorityPassenger.getPriceOfPlaneTicket());
        System.out.println(firstClassPassenger.getName());
        System.out.println(firstClassPassenger.getPriceOfPlaneTicket());
    }
}
