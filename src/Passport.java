package algorithms.src;
import java.util.Date;

public class Passport {
    public String id;
    public String firstName;
    public String lastName;
    public Date birthDay;
    public Date expireDate;

    public Passport(String id, String firstName, String lastName, Date birthDay, Date expireDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.expireDate = expireDate;
    }
}
