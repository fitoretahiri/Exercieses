package problem5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client client = new SimpleClient(new Money(100));
        Hotel hotel = new Hotel(new Money(0), "The Continental", 4, 30, List.of(new HotelStaff(), new HotelStaff()));
        try {
            client.useHotel(hotel);

            client.useHotel(hotel);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(client.getMoney());
        System.out.println(hotel.money);
        System.out.println(hotel.price);
    }
}
