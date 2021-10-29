package composition.realestate;

public class RealEstateDotcom {
    public static void main(String[] args) {
        Address monorAddress = new Address("Monor", "2010", "Pesti", 55);
        Details monorDetails = new Details("CSOK-os ház nagy családnak", monorAddress, 90, 500);
        RealEstate monorRealEstate = new RealEstate("Eladó ház Monoron", 35000000, monorDetails);

        System.out.println(monorRealEstate);
//        System.out.println("---------------------------------");
//        System.out.println(monorAddress);
//        System.out.println("---------------------------------");
//        System.out.println(monorDetails);
    }
}
