package introexceptionthrow;

public class Validation {
    public void validateName(String name){
        if (name == null || name.equals("")){
            throw new IllegalArgumentException("Given name is empty!");
        }
    }
    public void validateAge(String ageString){
        if (ageString.equals("")){
            throw new IllegalArgumentException("Given age is empty!");
        }
        int age = Integer.parseInt(ageString);
        if ( age < 0 || age > 120 ){
            throw new IllegalArgumentException("Not a proper age!");
        }
        for (int i = 0; i < ageString.length(); i++){
            if (!Character.isDigit(ageString.charAt(i))){
                throw new IllegalArgumentException("Not a number!");
            }
        }
    }
}
