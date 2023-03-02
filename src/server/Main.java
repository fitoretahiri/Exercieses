package server;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Game game = new ShooterGame(100);
        Player player1 = new CasualPlayer();
        player1.satisfaction = 10;
        Player player2 = new CompetitivePlayer();
        Server server = new Server(new ArrayList<>(List.of(player1, player2)), game);
        server.start();
        try {
            Thread.sleep(5000);
           // new CompetitivePlayer().joinServer(server);
            Thread.sleep(2000);
            server.stop();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(player1.satisfaction);
        System.out.println(player2.satisfaction);

    }
}
