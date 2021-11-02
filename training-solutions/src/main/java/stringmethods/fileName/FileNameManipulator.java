package stringmethods.fileName;

public class FileNameManipulator {

    public char findLastCharacter(String fileName){
        fileName = fileName.trim();
        int lastIndex = fileName.length() - 1;
        return fileName.charAt(lastIndex);
    }
    public String findFileExtension(String fileName){
        fileName = fileName.trim();
        int dotIndex = fileName.indexOf(".");
        String extensionOfFile = fileName.substring(dotIndex + 1, fileName.length());
        return extensionOfFile;
    }
    public boolean identifyFilesByExtension(String ext, String fileName){
        fileName = fileName.trim();
        ext = ext.trim();
        return fileName.endsWith(ext);
    }
    public boolean compareFilesByName(String searchedFileName, String actualFileName){
        return actualFileName.trim().equals(searchedFileName.trim());
    }
    public String changeExtensionToLowerCase(String fileName){
        fileName = fileName.trim();
        int dotIndex = fileName.indexOf(".");
        String namePart = fileName.substring(0, dotIndex);
        String extensionOfFile = fileName.substring(dotIndex + 1, fileName.length());
        return namePart + "." + extensionOfFile.toLowerCase();
    }
    public  String replaceStringPart(String fileName, String present, String target){
        if (fileName.contains(present)){
            return fileName.replace(present, target);
        }
        fileName = "Failed to replace".concat(fileName);
        return fileName;
    }

    public void printOut(boolean isSame){
        if (isSame) {
            System.out.println("They are the same.");
        }
        else {
            System.out.println("They are not the same.");
        }
    }



    public static void main(String[] args) {
        FileNameManipulator fnm = new FileNameManipulator();

        char lastChar = fnm.findLastCharacter("próbafájl.EXT");
        System.out.println("Last character : " + lastChar);

        String fileExt = fnm.findFileExtension("próbafájl.EXT");
        System.out.println("File extension : " + fileExt);

        boolean byExt = fnm.identifyFilesByExtension("EXT", "próbafájl.EXT");
        System.out.println(byExt);

        boolean isSame = fnm.compareFilesByName("próbafájl.ext","próbafájl.ext" );
        fnm.printOut(isSame);

        String changedFileName = fnm.changeExtensionToLowerCase("próbafájl.EXT");
        System.out.println("Changed fileName to " + changedFileName);

        String replaced = fnm.replaceStringPart("próbafájl.EXT", "EXT", "asd");
        System.out.println("New filename : " + replaced);
    }
}
