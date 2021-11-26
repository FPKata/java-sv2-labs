package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void testCreate(){
        BankAccount bankAccount = new BankAccount("Kis Mari", "11223344", 256005);
        assertEquals("Kis Mari", bankAccount.getNameOfOwner());
        assertEquals("11223344", bankAccount.getAccountNumber());
        assertEquals(256005, bankAccount.getBalance());
    }
}