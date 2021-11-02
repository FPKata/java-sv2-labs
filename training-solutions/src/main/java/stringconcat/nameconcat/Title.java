package stringconcat.nameconcat;

public enum Title {
    MR("Mr."), MRS("MRS."), MS("Ms."), DR("Dr.");

    private String titleStr;

    Title(String titleStr){
        this.titleStr = titleStr;
    }

    public String  getTitleStr(){
        return titleStr;
    }
}
