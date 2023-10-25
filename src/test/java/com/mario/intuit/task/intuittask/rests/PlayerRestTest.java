package com.mario.intuit.task.intuittask.rests;

import com.mario.intuit.task.intuittask.controller.PlayerController;
import com.mario.intuit.task.intuittask.entity.Player;
import com.mario.intuit.task.intuittask.rests.response.GetPlayerResponse;
import com.mario.intuit.task.intuittask.rests.response.GetPlayersResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PlayerRestTest {
    private PlayerRest playerRest;
    private PlayerController playerController;

    @BeforeEach
    void setUp() {
        playerController = mock(PlayerController.class);
        playerRest = new PlayerRest(playerController);
    }

    @Test
    void testGetPlayers() throws IOException {
        List<Player> mockPlayers = new ArrayList<>();
        when(playerController.retrievePlayersData()).thenReturn(mockPlayers);
        ResponseEntity<GetPlayersResponse> responseEntity = playerRest.getPlayers();
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        GetPlayersResponse response = responseEntity.getBody();
        assert response != null;
        assertEquals(mockPlayers, response.getPlayers());
    }

    @Test
    void testGetPlayer() throws IOException {
        String playerId = "aaronto01";
        Player mockPlayer = new Player();
        when(playerController.retrievePlayerData(playerId)).thenReturn(mockPlayer);
        ResponseEntity<GetPlayerResponse> responseEntity = playerRest.getPlayer(playerId);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        GetPlayerResponse response = responseEntity.getBody();
        assert response != null;
        assertEquals(mockPlayer, response.getPlayer());
    }
}