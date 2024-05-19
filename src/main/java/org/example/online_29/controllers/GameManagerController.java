package org.example.online_29.controllers;

import lombok.NonNull;
import org.example.online_29.exceptions.GameNotFoundException;
import org.example.online_29.modals.Game;
import org.example.online_29.modals.Player;
import org.example.online_29.services.GameManagerService;
import org.example.online_29.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gameManager")
public class GameManagerController {

    @Autowired
    private GameManagerService gameManagerService;

    @Autowired
    PlayerService playerService;

    @GetMapping("/{gameId}")
    public ResponseEntity<Game> getGameById(@PathVariable String gameId) {
        try {
            Game game = gameManagerService.getGameById(gameId);
            return new ResponseEntity<>(game, HttpStatus.OK);
        } catch (GameNotFoundException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/startNewGame/{userId")
    public ResponseEntity<String> startNewGame(@RequestParam @NonNull String userId) {
        Player contractor = playerService.getPlayer(userId);
        String gameId = gameManagerService.startNewGame(contractor);
        return new ResponseEntity<>(gameId, HttpStatus.CREATED);
    }

    @PostMapping("/joinGame/{gameId}")
    public ResponseEntity<Void> joinGame(@RequestParam @NonNull String gameId,@RequestParam @NonNull String userId) {
        Player player = playerService.getPlayer(userId);
        gameManagerService.joinGame(gameId, player);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}