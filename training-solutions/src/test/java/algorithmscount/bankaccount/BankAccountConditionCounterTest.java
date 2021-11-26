package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {
    BankAccountConditionCounter counter = new BankAccountConditionCounter();
    @Test
    void testCountWithBalanceGreaterThan(){
        List<BankAccount> accounts = Arrays.asList(
                new BankAccount("Kis Mari", "11223344", 11111),
                new BankAccount("Nagy Mari", "12345678", 158000),
                new BankAccount("John Doe", "12121212", 85000),
                new BankAccount("Mike Jackson", "33333333", 1000000000),
                new BankAccount("J Lo", "99999999", 50));

        assertEquals(3, counter.countWithBalanceGreaterThan(accounts, 80001));
        assertEquals(2, counter.countWithBalanceGreaterThan(accounts, 100000));
    }
}