package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void testCreate(){
        Transaction transaction = new Transaction("12345678", TransactionType.CREDIT, 12345);
        assertEquals("12345678", transaction.getAccountNumber());
        assertEquals(TransactionType.CREDIT, transaction.getTransactionType());
        assertEquals(12345, transaction.getAmount());
    }
}