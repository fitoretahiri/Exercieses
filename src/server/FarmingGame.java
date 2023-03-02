package server;

public class FarmingGame extends Game {
    public FarmingGame(int satisfactionValue) {
        super(satisfactionValue);
    }

    @Override
    public void getPlayed() {
        System.out.println("Farming farming ...");
    }
}
