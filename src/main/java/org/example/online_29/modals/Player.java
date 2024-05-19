package org.example.online_29.modals;

import lombok.Data;

import java.util.List;

@Data
public class Player implements Observer{
    private String id;
    private String name;
    private String email;
    private String password;
    private List<Card> hand;

    public Player(String id,String name) {
        this.id = id;
        this.name = name;
    }

    public void addCardtoHand(Card card) {
        this.hand.add(card);
    }

    public void update(Player player) {
        // Update the player
        System.out.println("Move updated by player "+ player.getName());
    }

}
