package introexceptionfinally;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;
        while(number % 2 != 0){
            System.out.println("Enter a number!");
            String StringNumber = scanner.nextLine();
            try{
                number = Integer.parseInt(StringNumber);
            }catch(NumberFormatException nfe){
                throw  new IllegalStateException("Not a number", nfe);
            }
            finally{
                System.out.println("End of round.");
            }
        }
    }
}
