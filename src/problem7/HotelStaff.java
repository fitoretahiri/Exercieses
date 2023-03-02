package problem7;

public class HotelStaff extends NamedPerson implements Client {
    public Money money;
    public UseHotelBehaviour useHotelBehaviour;

    public HotelStaff(Money money) {
        this.money = money;
        useHotelBehaviour = new UseHotelHalfPriceBehaviour();
    }

    public void greet() {
        System.out.println("Hello!");
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
