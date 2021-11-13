package controlselection.consonant;

public class ToConsonant {
    public char getConsonantOrVowel(char character){
        switch (character){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return (char) (character + 1);
            default:
                return character;
        }
    }


}
