package algorithms.src.problem2;

import java.util.List;

public class Hotel {
    public int money;
    public String name;
    public int stars;
    public int price;
    public List<HotelStaff> staff;

    public Hotel(int money, String name, int stars, int price, List<HotelStaff> staff) {
        this.money = money;
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.staff = staff;
    }

    public void recieveGuest(Client client) {
        staffGreet();
    }

    private void staffGreet() {
        staff.forEach(staff -> staff.greet());
    }
}
