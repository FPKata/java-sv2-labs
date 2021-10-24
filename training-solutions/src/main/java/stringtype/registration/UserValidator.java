package stringtype.registration;

public class UserValidator {

    public static boolean isValidUsername(String username){
        return !"".equals(username);
    }

    public static boolean isValidPassword(String password1, String password2){
        return (password1.equals(password2) && password1.length() > 7);
    }

    public static boolean isValidEmail(String email){
        boolean isRightAt = email.indexOf("@") > 0 ;
        boolean isRightDot = email.indexOf(".") > email.indexOf("@") + 1;
        isRightAt = isRightAt && email.indexOf(".") < email.length() - 1;
        return isRightAt && isRightDot;
    }
}
