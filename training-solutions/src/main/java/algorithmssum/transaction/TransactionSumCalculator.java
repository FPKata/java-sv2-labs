package algorithmssum.transaction;

import java.util.List;

public class TransactionSumCalculator {
    public int sumAmountOfCreditEntries(List<Transaction> transactions){
        int sum = 0;
        for (Transaction actual : transactions){
            if (actual.getTransactionOperation().toString().equals("CREDIT"))
            sum += actual.getAmount();
        }
        return sum;
    }
}
