package org.example.online_29.modals;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Player {
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

}
