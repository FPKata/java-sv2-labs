package exceptionmulticatch.converter;

public class BinaryStringConverter {
    public boolean[] binaryStringToBooleanArray(String binaryString){
        if (binaryString == null){
            throw new NullPointerException("Binary string is null.");
        }
        boolean[] booleans = new boolean[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++){
            char ch = binaryString.charAt(i);
            if (ch != '0' && ch!= '1'){
                throw new IllegalArgumentException("Binary string is not valid.");
            }
            if (ch == '1') {
                booleans[i] = true;
            }
            else {
                booleans[i] = false;
            }
        }
        return booleans;
    }

    public String booleanArrayToBinaryString(boolean[] booleans){
        if (booleans == null){
            throw new NullPointerException("Boolean array is null.");
        }
        if (booleans.length == 0){
            throw new IllegalArgumentException("Boolean array is empty.");
        }
        StringBuilder sb = new StringBuilder(booleans.length);
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i])
                sb.append('1');
            else
                sb.append('0');
        }
        return sb.toString();
    }
}
