package problem6;

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
        try {
            hotel.recieveGuest(this);
        } catch (ClientMissingMoneyException e) {
            System.out.println(e.getMessage());
        }
        payForHotel(hotel);
    }

    private void payForHotel(Hotel hotel) {
        money.addMoney(-hotel.price);
        hotel.money.addMoney(hotel.price);
    }
}
