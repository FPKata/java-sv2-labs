package schoolrecords;

public class Mark {
    private MarkType markType;
    private Subject subject;
    private Tutor tutor;
    //private String MarkString;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        this.markType = markType;
        if (subject == null){
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        this.subject = subject;
        if (tutor == null){
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        this.tutor = tutor;
    }

//    public Mark(String markString, Subject subject, Tutor tutor) {
//        this.MarkString = markString;
//        this.subject = subject;
//        this.tutor = tutor;
//    }


    @Override
    public String toString() {
        return markType.text + markType.value;
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
