package introexceptiontrace.aquarium;

public class AquariumMain {

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        Fish littleFish = new Fish("little", "yellow");
        aquarium.addFish(littleFish);
        Fish bigFish = new Fish("big", "red");
        aquarium.addFish(bigFish);
        Fish middleFish = new Fish("middle", "orange");
        aquarium.addFish(middleFish);
        Fish hugeFish = new Fish("huge", "gold");
        aquarium.addFish(hugeFish);
        System.out.println(aquarium.getNumberOfFish());
    }
}
