package org.example.online_29.modals;

import jakarta.persistence.Enumerated;
import lombok.Getter;


@Getter
public enum Rank {
    ACE("A"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    ;

    private final String rank;
    Rank(String rank) {
        this.rank = rank;
    }
}
