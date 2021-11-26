package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {
    @Test
    void testContainsBalanceGreaterThan(){
        BankAccountDecisionMaker bankAccountDecisionMaker = new BankAccountDecisionMaker();
        List<BankAccount> list = Arrays.asList(
                new BankAccount("Tompa Mihály", "11223344", 132000),
                new BankAccount("Kiss Róbert", "11111111", 34000),
                new BankAccount("Kiss Mária", "13243546", 99000),
                new BankAccount("Szabó Nándor", "34543210", 59999));

        assertTrue(bankAccountDecisionMaker.containsBalanceGreaterThan(list, 100000));
    }
}