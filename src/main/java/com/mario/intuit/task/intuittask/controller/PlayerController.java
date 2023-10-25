package com.mario.intuit.task.intuittask.controller;

import com.mario.intuit.task.intuittask.entity.Player;
import com.mario.intuit.task.intuittask.service.CSVService;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.List;

@Controller
public class PlayerController {

    public List<Player> retrievePlayersData() throws IOException {
        String filePath = "player.csv";
        CSVService<Player> playerCsvService = new CSVService<>(Player.class);
        return playerCsvService.getData(filePath);
    }

    public Player retrievePlayerData(String playerId) throws IOException {
        List<Player> players = retrievePlayersData();
        return players.stream().filter(p -> p.getPlayerId().equals(playerId))
                .findFirst()
                .orElse(null);
    }
}
