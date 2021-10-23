package javaapi;

public class Upper {
    public static void main(String[] args){
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#toUpperCase()
        String string ="Hello World!";
        String upperString = string.toUpperCase();
        System.out.println(upperString);
    }
}
