package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {
    @Test
    void testAmount(){
        Payable payable = new Amount();
        assertEquals(444, payable.getPayableAmount(444));
    }

    @Test
    void testCash(){
        Payable payable = new Cash();

        assertEquals(440, payable.getPayableAmount(441));
        assertEquals(445, payable.getPayableAmount(443));
        assertEquals(445, payable.getPayableAmount(446));
        assertEquals(450, payable.getPayableAmount(449));
        assertEquals(445, payable.getPayableAmount(445));
    }

    @Test
    void testBankAtm(){
        Payable payable = new BankAtm();

        assertEquals(1000, payable.getPayableAmount(444));
        assertEquals(2000, payable.getPayableAmount(1111));
    }
}