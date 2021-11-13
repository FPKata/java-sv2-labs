package chars;

public class WhiteSpace {
    public String makeWhitespaceToStar(String  text){
        for (int i = 0; i < text.length() - 1; i++){
            char c = text.charAt(i);
            if (Character.isWhitespace(c)){
                c = '*';
            }
        }
        return text;
    }

    public static void main(String[] args) {
        WhiteSpace whiteSpace = new WhiteSpace();
        System.out.println(whiteSpace.makeWhitespaceToStar("df 45 32  ."));
    }
}
