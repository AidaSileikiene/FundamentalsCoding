package example4;

public class Account {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private String domainName = "imone.lt";

    public Account(String firstName, String lastName, String password, String department, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.department = department;
        this.email = email;
    }

    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
