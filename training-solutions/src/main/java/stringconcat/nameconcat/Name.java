package stringconcat.nameconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title){
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public String concatNameWesternStyle(){
        String fullName;
        if (title != null){
            fullName = title.getTitleStr().concat(" ");
            fullName = fullName.concat(givenName);
        }
        else{
            fullName = givenName;
        }
        fullName = fullName.concat(" ");
        if (middleName != null && !"".equals(middleName)){
            fullName = fullName.concat(middleName);
            fullName = fullName.concat(" ");
        }
        fullName = fullName.concat(familyName);
        return fullName;
    }

    public String concatNameHungarianStyle(){
        String fullName;
        if (title != null){
            fullName = title.getTitleStr();
            fullName = fullName + " ";
            fullName = fullName + familyName;
        }
        else{
            fullName = familyName;
        }
        fullName = fullName + " ";
        fullName = fullName + givenName;
        if (middleName != null && !"".equals(middleName)){
            fullName += " ";
            fullName = fullName + middleName;
        }
        return fullName;
    }
}
