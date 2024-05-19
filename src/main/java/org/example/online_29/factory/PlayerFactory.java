package org.example.online_29.factory;

import org.example.online_29.modals.Player;
import org.example.online_29.services.PlayerService;

public class PlayerFactory {
    private static int playerIdCounter = 0;

    public static Player createPlayer(String id, String name) {
       Player player  =  new Player(id, name);
       PlayerService.players.add(player);
       return player;
    }
}
