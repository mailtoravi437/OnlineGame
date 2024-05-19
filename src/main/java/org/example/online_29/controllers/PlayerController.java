package org.example.online_29.controllers;

import org.example.online_29.factory.PlayerFactory;
import org.example.online_29.modals.Player;
import org.example.online_29.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    public ResponseEntity<Player> createPlayer(@RequestParam String id, @RequestParam String name) {
        Player player = PlayerFactory.createPlayer(id, name);
        return new ResponseEntity<Player>(player, HttpStatus.CREATED);
    }

}
