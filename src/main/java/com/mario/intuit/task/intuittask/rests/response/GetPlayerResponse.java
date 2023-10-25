package com.mario.intuit.task.intuittask.rests.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mario.intuit.task.intuittask.entity.Player;
import lombok.Data;

@Data
public class GetPlayerResponse {
    @JsonProperty("player")
    private Player player ;
}
