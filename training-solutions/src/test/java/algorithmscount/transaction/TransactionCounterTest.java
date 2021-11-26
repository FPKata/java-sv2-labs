package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {
    @Test
    void testCountEntryLessThan(){
        TransactionCounter counter = new TransactionCounter();
        List<Transaction> transactions = Arrays.asList(
                new Transaction("1234", TransactionType.CREDIT, 12345),
                new Transaction("4321", TransactionType.DEBIT, 23456),
                new Transaction("1456", TransactionType.CREDIT, 112345),
                new Transaction("2222", TransactionType.CREDIT, 123450),
                new Transaction("7654", TransactionType.CREDIT, 1222),
                new Transaction("1234", TransactionType.DEBIT, 12345));

        assertEquals(2, counter.countEntryLessThan(transactions, 100000));
    }
}