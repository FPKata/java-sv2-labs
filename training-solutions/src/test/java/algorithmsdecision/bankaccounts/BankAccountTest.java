package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount bankAccount = new BankAccount("Kiss Csaba", "12345678", 100000);

    @Test
    void testCreate(){
        assertEquals("Kiss Csaba", bankAccount.getNameOfOwner());
        assertEquals("12345678", bankAccount.getAccountNumber());
        assertEquals(100000, bankAccount.getBalance());
    }

    @Test
    void testWithdraw(){
        bankAccount.withdraw(30000);
        assertEquals(70000, bankAccount.getBalance());
        assertTrue(bankAccount.withdraw(20000));
        assertFalse(bankAccount.withdraw(200000));
    }

    @Test
    void testDeposit(){
        bankAccount.deposit(30000);
        assertEquals(130000, bankAccount.getBalance());
    }
}