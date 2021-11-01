package stringbasic;

public class Person {
    private String name;
    private String email;
    private String tajNumber;
    private String bankAccountNumber;
    private String mobile;

    public Person(String name, String email, String tajNumber, String bankAccountNumber, String mobile){
        this.name = name;
        this.email = email;
        this.tajNumber = tajNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTajNumber() {
        return tajNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getMobile() {
        return mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTajNumber(String tajNumber) {
        this.tajNumber = tajNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
