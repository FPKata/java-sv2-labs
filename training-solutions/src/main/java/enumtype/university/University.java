package enumtype.university;

public enum University {
    ELTE("Eötvös Lóránd Tudományegyetem"), SZFE("Színház- és Filmművészeti Egyetem"),
    PTE("Pécsi Tudományegyetem"), DE("Debreceni Egyetem"), BME("Budapesti Műszaki Egyetem");

    private String fullName;

    University(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }
}
