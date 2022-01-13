package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("school", 12);
        School primary = new PrimarySchool("primary", 8);
        School secondary = new SecondarySchool("secondary", 4);

//        System.out.println(school.getName() + school.getNumberOfYears());
//        System.out.println(primary.getName() + primary.getNumberOfYears());
//        System.out.println(secondary.getName() + secondary.getNumberOfYears());
        System.out.println(school);
        System.out.println(primary);
        System.out.println(secondary);
    }
}
