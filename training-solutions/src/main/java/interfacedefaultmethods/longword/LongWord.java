package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.List;

public class LongWord implements FileOperation{
    private Path path;

    public LongWord(Path path) {
        this.path = path;
    }

    @Override
    public String getLongWord() {
        List<String> partsOfWord = readFromFile(path);
        String firstPart = partsOfWord.get(0);
        int lengthOfWord = firstPart.length() + partsOfWord.size() - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lengthOfWord; i++){
            if (i < firstPart.length()){
                sb.append(firstPart.charAt(i));
            } else {
                sb.append(partsOfWord.get(i - (firstPart.length() - 1)).charAt(firstPart.length() - 1));
            }
        }
        return sb.toString();
    }
}
