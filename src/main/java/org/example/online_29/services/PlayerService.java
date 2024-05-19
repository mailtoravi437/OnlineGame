package org.example.online_29.services;

import org.example.online_29.exceptions.PlayerNotFoundException;
import org.example.online_29.modals.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    public static List<Player> players = new ArrayList<Player>();

    public Player getPlayer(String playerId) throws PlayerNotFoundException {
        // Get player by id
        for(Player player : players) {
            if(player.getId().equals(playerId)) {
                return player;
            }
        }
        throw new PlayerNotFoundException();
    }

}
