package com.company;

import java.util.List;

public class Server {
    private String name;
    private Game game;
    List<PlayBehaviour> players;

    public Server(String name, Game game, List<PlayBehaviour> players) {
        this.name = name;
        this.game = game;
        this.players=players;
    }

    public void playGame(){
        if (game.start()) {
            players.forEach(player -> {
                player.play(game);
            });
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
