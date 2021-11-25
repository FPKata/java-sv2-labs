package introexceptionthrow;

public class SsnValidator {
    public boolean isValidSsn(String ssn){
        if (ssn.length() != 9){
            return false;
        }
        try {
            int sum = 0;
            for (int i = 0; i < ssn.length() - 1; i += 2){
                sum += getAnIntFromChar(ssn.charAt(i)) * 3;
            }
            for (int i = 1; i < ssn.length() - 1; i += 2){
                sum += getAnIntFromChar(ssn.charAt(i)) * 7;
            }
            return (getAnIntFromChar(ssn.charAt(8)) == (sum % 10));
        }catch (IllegalArgumentException iae){
            return false;
        }
    }
    public int getAnIntFromChar(char character){
        if (character < '0' || character > '9'){
            throw new IllegalArgumentException("Not only numbers");
        }
        return character - '0';
    }
}
