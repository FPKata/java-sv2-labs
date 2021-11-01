package typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion c = new Conversion();
        System.out.println(c.convertDoubleToDouble(3.4567));
        int[] numbersInt = {2, 45, 0, -3, 456, 128, 56, 67};
        byte[] newArray = c.convertIntArrayToByteArray(numbersInt);
        System.out.println(Arrays.toString(newArray));
    }
}
