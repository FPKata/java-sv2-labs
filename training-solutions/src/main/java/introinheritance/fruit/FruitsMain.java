package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();

        System.out.println("--------Gyümölcs------------");
        fruit.setName("Ananász");
        System.out.println(fruit.getName());
        fruit.setWeight(3.0);
        System.out.println(fruit.getWeight());

        System.out.println("-----------Szőlő---------");
        Grape grape = new Grape();
        grape.setType("Borszőlő");
        System.out.println(grape.getType());
        System.out.println(grape.getName());
        grape.setName("Saszla");
        System.out.println(grape.getName());
        System.out.println(grape.getWeight());
        grape.setWeight(13.0);
        System.out.println(grape.getWeight());

        System.out.println("--------Alma--------");
        Apple apple = new Apple();
        System.out.println(apple.getName());
        apple.setName("Idared");
        System.out.println(apple.getName());
        System.out.println(apple.getWeight());
        apple.setWeight(23.0);
        System.out.println(apple.getWeight());
        System.out.println(apple.getPieces());
        apple.setPieces(4);
        System.out.println(apple.getPieces());

        System.out.println("--------Golden--------");
        GoldenDelicious golden = new GoldenDelicious();
        System.out.println(golden.getName());
        golden.setName("Golden");
        System.out.println(golden.getName());
        System.out.println(golden.getWeight());
        golden.setWeight(33.0);
        System.out.println(golden.getWeight());
        System.out.println(golden.getPieces());
        golden.setPieces(14);
        System.out.println(golden.getPieces());
        System.out.println(golden.getColour());

        System.out.println("--------Starking--------");
        Starking starking = new Starking();
        System.out.println(starking.getName());
        starking.setName("Starking");
        System.out.println(starking.getName());
        System.out.println(starking.getWeight());
        starking.setWeight(43.0);
        System.out.println(starking.getWeight());
        System.out.println(starking.getPieces());
        starking.setPieces(24);
        System.out.println(starking.getPieces());
        System.out.println(starking.getColour());
    }
}
