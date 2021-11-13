package controlselection.accents;

public class WithoutAccents {
    public char getWithoutAccents(char character){
        char[] withAccent = {'á', 'é', 'í', 'ó', 'ö', 'ő', 'ú', 'ü', 'ű'};
        char[] withoutAccent = {'a', 'e', 'i', 'o', 'o', 'o', 'u', 'u', 'u'};
        for (int i = 0; i < withAccent.length; i++){
            if (character == withAccent[i]){
                character = withoutAccent[i];
            }
        }
        return character;
    }
}
