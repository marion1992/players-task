package com.mario.intuit.task.intuittask.rests.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mario.intuit.task.intuittask.entity.Player;
import lombok.Data;

import java.util.List;

@Data
public class GetPlayersResponse {
    @JsonProperty("players")
    private List<Player> players ;
}
