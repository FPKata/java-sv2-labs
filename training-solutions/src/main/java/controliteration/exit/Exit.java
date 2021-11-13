package controliteration.exit;

import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Az ügyfélszolgálat menüje jelenleg nem elérhető.")
                .append("Kilépés az \"x\" billentyű megnyomásával");
        Scanner scanner = new Scanner(System.in);
        String sc = "";
        while (!"x".equals(sc)) {
            System.out.println(sb);
            sc = scanner.nextLine();
        }
        System.out.println("Végre!!!");
    }
}
