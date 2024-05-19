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
    private int currentPlayerIndex;

    public Game(Player contractor) {
        this.gameId = UUID.randomUUID().toString();
        this.contractor = contractor;
        this.gameStatus = GameStatus.GAME_INITIATED;
        this.currentPlayerIndex = 0;
    }

    public void addPlayer(Player player) {
        this.playersList.add(player);
    }

    public void startGame() {
        this.deck = new Deck();
        this.deck.shuffle();
        this.gameStatus = GameStatus.INPROGRESS;
    }

    public void endGame() {
        this.gameStatus = GameStatus.FINISHED;
    }

    public void nextPlayer() {
        this.currentPlayerIndex = (this.currentPlayerIndex + 1) % this.playersList.size();
    }



}
