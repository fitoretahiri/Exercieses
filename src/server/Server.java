package server;

import java.util.List;

public class Server {
    public List<Player> players;
    public Game game;
    public boolean running;

    public Server(List<Player> players, Game game) {
        this.players = players;
        this.game = game;
    }

    public void start() {
        running = true;
        Thread thread = new Thread(() -> {
            while (running) {
                players.forEach(player -> player.playGame(game));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted, \n" + e.getMessage());
                    System.out.println(e);
                }
            }
        });
        thread.start();
    }

    public void stop() {
        running = false;
    }

//    public void addPlayer(Player player) {
//        players.add(player);
//    }
}
