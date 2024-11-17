import java.util.List;
import java.util.Objects;

public class Person {
    private String fName;
    private String lName;
    private String email;
    private List<BankAccount> accounts;


    public Person(String fName, String lName, String email, List<BankAccount> accounts) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s)", fName, lName,email);
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}
