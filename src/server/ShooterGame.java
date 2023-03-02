package server;

public class ShooterGame extends Game {
    public ShooterGame(int satisfactionValue) {
        super(satisfactionValue);
    }

    @Override
    public void getPlayed() {
        System.out.println("PEW PEW PEW PEW PEW");
    }
}
