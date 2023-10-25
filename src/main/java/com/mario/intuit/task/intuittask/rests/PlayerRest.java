package com.mario.intuit.task.intuittask.rests;

import com.mario.intuit.task.intuittask.controller.PlayerController;
import com.mario.intuit.task.intuittask.entity.Player;
import com.mario.intuit.task.intuittask.rests.response.GetPlayerResponse;
import com.mario.intuit.task.intuittask.rests.response.GetPlayersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerRest {
    @Autowired
    private PlayerController playerController;

    public PlayerRest(PlayerController playerController) {
        this.playerController = playerController;
    }

    @GetMapping(value = "/api/players",
            produces = {"application/json"})
    public ResponseEntity<GetPlayersResponse> getPlayers() {
        GetPlayersResponse getPlayersResponse = new GetPlayersResponse();
        try {
            List<Player> players = playerController.retrievePlayersData();
            getPlayersResponse.setPlayers(players);
            return new ResponseEntity<>(getPlayersResponse, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(getPlayersResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping(value = "/api/player/{playerId}",
            produces = {"application/json"})
    public ResponseEntity<GetPlayerResponse> getPlayer(@PathVariable String playerId) {
        GetPlayerResponse getPlayerResponse = new GetPlayerResponse();
        try {
            Player player = playerController.retrievePlayerData(playerId);
            getPlayerResponse.setPlayer(player);
            return new ResponseEntity<>(getPlayerResponse, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(getPlayerResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
