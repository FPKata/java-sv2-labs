package algorithmssum.transaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionSumCalculatorTest {
    TransactionSumCalculator transactionSumCalculator = new TransactionSumCalculator();

    @Test
        void testSumAmountOfCreditEntries(){
        List<Transaction> transactions = Arrays.asList(
            new Transaction("12345678-11223344", TransactionOperation.CREDIT, 11111),
            new Transaction("12345678-11111111", TransactionOperation.CREDIT, 22222),
            new Transaction("12345678-22222222", TransactionOperation.DEBIT, 33333),
            new Transaction("12345678-33333333", TransactionOperation.CREDIT, 44444),
            new Transaction("12345678-44444444", TransactionOperation.DEBIT, 55555));

        assertEquals(77777, transactionSumCalculator.sumAmountOfCreditEntries(transactions));
    }
}