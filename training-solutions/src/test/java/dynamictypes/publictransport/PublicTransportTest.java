package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {
    @Test
    void testPublicVehicles(){
        PublicVehicle bus = new Bus(11, 15.3, "Volvo");
        PublicVehicle tram = new Tram(14, 12.7, 3);
        PublicVehicle metro = new Metro(3, 33.5, 14);

        PublicTransport publicTransport = new PublicTransport();
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3, publicTransport.getPublicVehicles().size());
    }
}