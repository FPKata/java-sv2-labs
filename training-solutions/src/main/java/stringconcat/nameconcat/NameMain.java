package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        System.out.println(new Name("Family", null, "Given", Title.DR).concatNameWesternStyle());
        System.out.println(new Name("Family", "", "Given", Title.DR).concatNameWesternStyle());
        System.out.println(new Name("Family", "Middle", "Given", null).concatNameWesternStyle());
        System.out.println(new Name("Family", "Middle", "Given", Title.DR).concatNameWesternStyle());
        System.out.println("----------------------------------");
        System.out.println(new Name("Family", "", "Given", Title.DR).concatNameHungarianStyle());
        System.out.println(new Name("Family", null, "Given", Title.DR).concatNameHungarianStyle());
        System.out.println(new Name("Family", "Middle", "Given", null).concatNameHungarianStyle());
        System.out.println(new Name("Family", "Middle", "Given", Title.DR).concatNameHungarianStyle());
    }
}
