package introexceptionthrow;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        this.name = name;
        if (name.equals(null) || name.equals("")){
            throw new IllegalArgumentException("Your name is empty.");
        }
        this.socialSecurityNumber = socialSecurityNumber;
        if (!new SsnValidator().isValidSsn(socialSecurityNumber)){
            throw new IllegalArgumentException("Invalid Social Security Number.");
        }
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth < 1900){
            throw new IllegalArgumentException("Invalid year of birth.");
        }

    }

    public static void main(String[] args) {
        Patient firstPatient = new Patient("Kis Éva", "123456788", 2000);
        System.out.println(firstPatient.getName());
        System.out.println(firstPatient.getSocialSecurityNumber());
        System.out.println(firstPatient.getYearOfBirth());

//        Patient secondPatient = new Patient("", "123456788", 2000);
//        System.out.println(firstPatient.getName());
//        System.out.println(firstPatient.getSocialSecurityNumber());
//        System.out.println(firstPatient.getYearOfBirth());

//        Patient thirdPatient = new Patient("Kis Éva", "123456789", 2000);
//        System.out.println(firstPatient.getName());
//        System.out.println(firstPatient.getSocialSecurityNumber());
//        System.out.println(firstPatient.getYearOfBirth());

        Patient fourthPatient = new Patient("Kis Éva", "123456788", 1000);
        System.out.println(firstPatient.getName());
        System.out.println(firstPatient.getSocialSecurityNumber());
        System.out.println(firstPatient.getYearOfBirth());
    }
}
