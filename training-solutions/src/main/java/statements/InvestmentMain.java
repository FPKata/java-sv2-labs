package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Investment :");
        int fund = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Interest rate :");
        int interestRate = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Days of checking (< 366):");
        int periodInDays= scanner.nextInt();
        scanner.nextLine();
        System.out.println("End of investment :");
        int end = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Another end of Investment :");
        int anotherEnd = scanner.nextInt();
        scanner.nextLine();

        Investment investment = new Investment(fund, interestRate);
        double yields = investment.getYields(periodInDays);
        double close1 = investment.close(end);
        double close2 = investment.close(anotherEnd);

        System.out.println("Your investment :");
        System.out.println(investment.getFund());
        System.out.println("Interest rate :");
        System.out.println(investment.getInterestRate() + " %");
        System.out.println("Total fund :" + investment.getFund());
        System.out.println("Your yield for " + periodInDays + " days: " + yields);
        System.out.println("Your closeup for " + end + " days: " + close1);
        System.out.println("Your closeup for " + anotherEnd + " days: " + close2);
    }
}
