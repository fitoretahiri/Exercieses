package problem5;

public class SimpleClient extends NamedPerson implements Client {
    public Money money;

    public SimpleClient(Money money) {
        this.money = money;
    }

    @Override
    public Money getMoney() {
        return money;
    }

    @Override
    public void useHotel(Hotel hotel) {
        hotel.recieveGuest(this);
        payForHotel(hotel);
    }

    private void payForHotel(Hotel hotel) {
        money = null;
        money.addMoney(-hotel.price); // NullPointerException
        hotel.money.addMoney(hotel.price);
    }
}
