package algorithms.src;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PassportBuilding passportBuilding = new PassportBuilding(List.of(new Staff()));
        Person person = new Person("Din", "Dedaqi", new Date());
        System.out.println(person.passport);
        person.getPassport(passportBuilding);

        System.out.println(person.passport.id);
        System.out.println(person.passport.firstName);
        System.out.println(person.passport.lastName);
        System.out.println(person.passport.birthDay);

    }
}
