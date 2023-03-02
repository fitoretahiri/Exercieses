package problem3;

public class HotelStaff extends NamedPerson implements Client {
    public Money money;
    public void greet() {
        System.out.println("Hello!");
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
        money.withDrawMoney(hotel.price);
        hotel.money = hotel.money + hotel.price;
    }
}
