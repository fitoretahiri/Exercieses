package problem6;

import java.util.List;

public class Hotel implements MoneyFlower {
    public Money money;
    public String name;
    public int stars;
    public int price;
    public List<HotelStaff> staff;

    public Hotel(Money money, String name, int stars, int price, List<HotelStaff> staff) {
        this.money = money;
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.staff = staff;
    }

    @Override
    public Money getMoney() {
        return money;
    }

    public void recieveGuest(Client client) throws ClientMissingMoneyException {
        staffGreet();
        if (client.getMoney().getMoney() < price) {
            throw new ClientMissingMoneyException("Client can not pay for hotel");
        }
        money.addMoney(price);
    }

    private void staffGreet() {
        staff.forEach(staff -> staff.greet());
    }

}
