package schoolrecords;

public enum MarkType {
    A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"),
    D(2, "close fail"), F(1, "fail");

    public final int value;
    public final String text;

    MarkType(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
