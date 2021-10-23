package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {
    public static void main(String[] args) {
        Prefix pre = new Prefix("Prof.");
        FirstName firstName = new FirstName("Firstname");
        LastName lastName = new LastName("Lastname");

        String fullName = pre.getPre() + " " + firstName.getFirst() + " " + lastName.getLast();
        System.out.println(fullName);
    }
}
