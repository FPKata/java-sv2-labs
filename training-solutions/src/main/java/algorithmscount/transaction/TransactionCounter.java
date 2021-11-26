package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {
    public int countEntryLessThan(List<Transaction> transactions, int maxAmount){
        int count = 0;
        for (Transaction actual : transactions){
            if (actual.getTransactionType().toString().equals("CREDIT") && actual.getAmount() < maxAmount){
                count++;
            }
        }
        return count;
    }
}
