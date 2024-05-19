package org.example.online_29.modals;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
       for(Suit suit: Suit.values()){
           for(Rank rank: Rank.values()){
               cards.add(new Card(suit,rank));
           }
       }
    }

}
