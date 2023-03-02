package problem2;

public class SimpleClient extends NamedPerson implements Client {
    public int money;

    public SimpleClient(int money) {
        this.money = money;
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public void addMoney(int addedMoney) {
        this.money = this.money + addedMoney;
    }

    @Override
    public void useHotel(Hotel hotel) {
        hotel.recieveGuest(this);
        payForHotel(hotel);
    }

    private void payForHotel(Hotel hotel) {
        money = money - hotel.price;
        hotel.money = hotel.money + hotel.price;
    }
}
