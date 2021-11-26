package algorithmssum.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void testCreate(){
        Transaction transaction = new Transaction("12345678-12121212", TransactionOperation.CREDIT, 1111);
        assertEquals("12345678-12121212", transaction.getAccountNumber());
        assertEquals(TransactionOperation.CREDIT, transaction.getTransactionOperation());
        assertEquals(1111, transaction.getAmount());
    }

}