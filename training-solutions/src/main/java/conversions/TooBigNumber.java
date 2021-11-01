package conversions;

public class TooBigNumber {
    public long getRigthResult(int number){
        long longNumber = 2_147_483_647;
        longNumber += number;
        return longNumber;
    }
    public static void main(String[] args) {
        TooBigNumber tooBigNumber = new TooBigNumber();
        long result = tooBigNumber.getRigthResult(63);
        System.out.println(result);
    }
}
