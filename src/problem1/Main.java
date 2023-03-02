package problem1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Dini", 100);
        Hotel hotel = new Hotel(0, "The Continental", 4, 30, List.of(new HotelStaff(), new HotelStaff()));
        client.useHotel(hotel);
        client.useHotel(hotel);
        System.out.println(client.money);
        System.out.println(hotel.money);
        System.out.println(hotel.price);
    }
}
