package typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double numberDouble){
        int numberInt = (int) numberDouble;
        return numberInt * 1.0;
    }

    public byte[] convertIntArrayToByteArray(int[] numbersInt){
        byte[] newArray = new byte[numbersInt.length];
        for (int i = 0; i < numbersInt.length ; i++) {
            if (numbersInt[i] < 0 || numbersInt[i] > 127) {
                newArray[i] = -1;
            }else {
                newArray[i] = (byte) numbersInt[i];
            }
        }
        return newArray;
    }
}
