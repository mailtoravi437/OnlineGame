package org.example.online_29.exceptions;

public class GameNotFoundException extends RuntimeException{
    public GameNotFoundException() {
        System.out.println("Game not found");
    }
}
