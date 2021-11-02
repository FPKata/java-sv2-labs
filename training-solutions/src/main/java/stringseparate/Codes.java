package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codes {
    public  String getCodesStartWithLetter(List<String> codes){
        StringBuilder sb = new StringBuilder("Betűvel kezdődő kódok: ");
        boolean first = true;
        for (String code : codes) {
            if (Character.isLetter(code.charAt(0))){
                if (first){
                    first = false;
                }
                else{
                    sb.append(", ");
                }
            }
            sb.append(code);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Codes codes = new Codes();
        List<String> medleyCodes = new ArrayList<>(Arrays.asList("asd234", "345tzu", "gt56z7", "456jkl", "cvb999"));

        System.out.println(codes.getCodesStartWithLetter(medleyCodes));
    }
}
