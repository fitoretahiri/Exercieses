package server;

public abstract class Game {
    public int satisfactionValue;

    public Game(int satisfactionValue) {
        this.satisfactionValue = satisfactionValue;
    }

    public abstract void getPlayed();
}
