package com.mario.intuit.task.intuittask.controller;

import com.mario.intuit.task.intuittask.entity.Player;
import com.mario.intuit.task.intuittask.service.CSVService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class PlayerControllerTest {
    private PlayerController playerController;

    private CSVService<Player> csvService;

    @BeforeEach
     void setUp() {
        csvService = Mockito.mock(CSVService.class);
        playerController = new PlayerController();
    }

    @Test
     void testRetrievePlayerData() throws IOException {
        String playerId = "aaronto01";
        Player mockPlayer = new Player();
        mockPlayer.setPlayerId("aaronto01");
        List<Player> mockPlayers = Arrays.asList(
                mockPlayer
        );
        when(csvService.getData("player.csv")).thenReturn(mockPlayers);
        Player player = playerController.retrievePlayerData(playerId);
        assertEquals("aaronto01", player.getPlayerId());
    }
}