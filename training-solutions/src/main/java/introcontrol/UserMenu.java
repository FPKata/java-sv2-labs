package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználók felvétele");
        System.out.println("Többi: Kilépés");

        Scanner scanner = new Scanner(System.in);
        System.out.println("2Válassz a menüpontok közül!");
        int numberMenu = scanner.nextInt();
        if (numberMenu == 1){
            System.out.println("1. Felhasználók listázása");
        }
        else if (numberMenu == 2){
            System.out.println("1. Felhasználók felvétele");
        }
    }
}
