package algorithms.src;
import java.util.Date;

public class Person {
    public String firstName;
    public String lastName;
    public Date birthDay;

    public Passport passport;

    public Person(String firstName, String lastName, Date birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public void getPassport(PassportBuilding passportBuilding) {
        passport = passportBuilding.createPassport(firstName, lastName, birthDay);
    }
}
