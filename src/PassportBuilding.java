package algorithms.src;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class PassportBuilding {
    List<Staff> staff;

    public PassportBuilding(List<Staff> staff) {
        this.staff = staff;
    }

    public Passport createPassport(String name, String lastName, Date birthDay) {
        System.out.println("Passport Created");
        int random=(int) (Math.random()* staff.size());
        if (staff.get(random).approvePassport()) {
            return new Passport("P0" + Math.random(), name, lastName, birthDay, new Date()); //date plus 10 years
        } else {
            return null;
        }
    }
}
