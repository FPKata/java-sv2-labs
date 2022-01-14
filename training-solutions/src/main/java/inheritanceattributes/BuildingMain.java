package inheritanceattributes;

public class BuildingMain {
    public static void main(String[] args) {
        Building building = new Building("building", 300.32, 3);
        SchoolBuilding schoolBuilding = new SchoolBuilding("school", 1200.2, 2,14);
        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
