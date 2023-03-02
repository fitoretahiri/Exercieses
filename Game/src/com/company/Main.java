package com.company;
/*Create an OOP program based on a game and its servers.
 - Players can play a specific game
 - Games increase satisfaction of player
 - Different types of players SlowPlayer CompetitivePlayer all play differently
 - Different types of servers for different types of games
 - Every second every player on the server will play the game the server is based on
 */


import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PlayBehaviour player=new CompetitivePlayer("firstUser",20);
        PlayBehaviour player1=new SlowPlayer("slowPlayer",18);

        Server server=new Server("Server1",new Game("League of Legends", 14,true),
                List.of(player,player1, new CompetitivePlayer("bestPlayer",21)));
        int countTimePlayed=0;
        for (int i=0; i<20; i++){
            server.playGame();
            countTimePlayed++;
        }

        player.getSatisfaction(countTimePlayed);
        player1.getSatisfaction(countTimePlayed);

    }
}
