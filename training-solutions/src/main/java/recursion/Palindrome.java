package recursion;

import java.util.Arrays;

public class Palindrome {
    public boolean isPalindrome(String word){
        if (word.length() <= 1){
            return true;
        }
        char[] temp = word.toCharArray();
        if (temp[0] == temp[temp.length - 1]){
            char[] newWord = Arrays.copyOfRange(temp, 1, temp.length - 1);
            return isPalindrome(new String(newWord));
        }else{
            return false;
        }
    }
}
