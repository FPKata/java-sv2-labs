package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String word){
        StringBuilder sb = new StringBuilder(word);
        if (word.equalsIgnoreCase(sb.reverse().toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();
        boolean result = palindromeValidator.isPalindrome("görög");
        if (result){
            System.out.println("Yes, it is a palindrome!");
        }
        else{
            System.out.println("No, it is not a palindrome.");
        }
    }
}
