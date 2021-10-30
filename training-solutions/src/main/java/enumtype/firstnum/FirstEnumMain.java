package enumtype.firstnum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        System.out.println(Continent.AMERICA);
        System.out.println(Continent.ASIA);
        System.out.println(Continent.EUROPA);
        System.out.println(Continent.ANTARCTICA);
        System.out.println(Continent.AUSTRALIA);
        System.out.println(Continent.AFRICA);
        System.out.println(Arrays.toString(Continent.values()));
        System.out.println();
        System.out.println(Ocean.valueOf("PACIFIC"));
        System.out.println(Ocean.valueOf("ATLANTIC"));
        System.out.println(Ocean.valueOf("INDIAN"));
        System.out.println();
        System.out.println(Football.CSATÁR.name());
        System.out.println(Football.KAPUS.name());
        System.out.println(Football.HÁTVÉD.name());
        System.out.println(Football.SÖPRÖGETŐ.name());
        System.out.println(Football.KÖZÉPPÁLYÁS.name());
        System.out.println(Football.VÉDŐ.name());
    }
}

