package org.example.online_29.modals;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Game {
    private String gameId;
    private List<Player> playersList;
    private Deck deck;
    private Player contractor;
    private GameStatus gameStatus;
    private Player winner;
    private double amount;

    public Game(Player contractor) {
        this.gameId = UUID.randomUUID().toString();
        this.contractor = contractor;
        this.gameStatus = GameStatus.GAME_INITIATED;
    }

    public void addPlayer(Player player) {
        this.playersList.add(player);
    }

}
