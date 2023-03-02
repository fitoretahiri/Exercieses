package problem1;

public class Client extends NamedPerson {
    public int money;

    public Client(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void useHotel(Hotel hotel) {
        hotel.recieveGuest(this);
        payForHotel(hotel);
    }

    private void payForHotel(Hotel hotel) {
        money = money - hotel.price;
        hotel.money = hotel.money + hotel.price;
    }
}
