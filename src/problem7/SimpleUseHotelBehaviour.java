package problem7;

public class SimpleUseHotelBehaviour implements UseHotelBehaviour {
    @Override
    public void useHotel(Hotel hotel, Client client) {
        try {
            hotel.recieveGuest(client);
            payForHotel(hotel, client);
        } catch (ClientMissingMoneyException e) {
            System.out.println(e.getMessage());
        }
    }

    private void payForHotel(Hotel hotel, Client client) {
        client.getMoney().addMoney(-hotel.price);
        hotel.getMoney().addMoney(hotel.price);
    }
}
