package typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion c = new Conversion();
        System.out.println(c.convertDoubleToDouble(3.4567));
        System.out.println("--------");
        int[] numbersInt = {2, 45, 0, -3, 456, 128, 56, 67};
        byte[] newArray = c.convertIntArrayToByteArray(numbersInt);
        System.out.println(Arrays.toString(newArray));
        System.out.println("--------");
        System.out.println(c.getFirstDecimal(3.45678));
    }
}
