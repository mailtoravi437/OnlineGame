package org.example.online_29.exceptions;

public class PlayerNotFoundException extends RuntimeException{
    public PlayerNotFoundException() {
        System.out.println("Player not found");
    }
}
