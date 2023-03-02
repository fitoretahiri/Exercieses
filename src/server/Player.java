package server;

public abstract class Player {
    public int satisfaction;

    public void playGame(Game game) {
        raiseSatisfaction(game);
        enjoyGame(game);
    }

    public void raiseSatisfaction(Game game) {
        satisfaction = satisfaction + game.satisfactionValue;
    }

    public abstract void enjoyGame(Game game);

//    public void joinServer(Server server) {
//        server.addPlayer(this);
//    }
}
