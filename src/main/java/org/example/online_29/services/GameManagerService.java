package org.example.online_29.services;


import org.example.online_29.modals.Game;
import org.example.online_29.modals.GameStatus;
import org.example.online_29.modals.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameManagerService {
    List<Game> gamesList = new ArrayList<>();
    public String startNewGame(Player contractor) {
        // Start a new game
        Game game = new Game(contractor);
        gamesList.add(game);
        game.setGameStatus(GameStatus.WAITING_FOR_PLAYERS);
        return game.getGameId();
    };

    public void joinGame(String gameId, Player player) {
        Game game = getGameById(gameId);
        game.addPlayer(player);
    }

    public Game getGameById(String gameId) {
        // Get game by id
        for(Game game : gamesList) {
            if(game.getGameId().equals(gameId)) {
                return game;
            }
        }
        return null;
    }
}
