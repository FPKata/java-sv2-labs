package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter title of film:");
        String title = scanner.nextLine();
        System.out.println("Enter number of tickets:");
        int numberOfTickets = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number of row:");
        int numberOfRow = scanner.nextInt();
        scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:\n")
                .append("Vásárló neve: ")
                .append(name + "\n")
                .append("Film címe: ")
                .append(title + "\n")
                .append("Lefoglalt helyek: ");
        for (int i = 0; i < numberOfTickets; i++){
            sb.append(numberOfRow + ". sor " + (i+1) + ".szék ");
        }
        sb.append("\n").append("Jó szórakozást!");
        System.out.print(sb);
    }
}
