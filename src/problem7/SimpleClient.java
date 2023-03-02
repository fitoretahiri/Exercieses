package problem7;

public class SimpleClient extends NamedPerson implements Client {
    public Money money;
    private UseHotelBehaviour useHotelBehaviour;

    public SimpleClient(Money money) {
        this.money = money;
        this.useHotelBehaviour = new SimpleUseHotelBehaviour();
    }

    @Override
    public Money getMoney() {
        return money;
    }

    @Override
    public void useHotel(Hotel hotel) {
        useHotelBehaviour.useHotel(hotel, this);
    }
}
