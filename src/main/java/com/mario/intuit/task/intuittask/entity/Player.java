package com.mario.intuit.task.intuittask.entity;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

@Data
public class Player {
    @CsvBindByName(column = "playerId")
    private String playerId;

    @CsvBindByName(column = "birthYear")
    private Integer birthYear;

    @CsvBindByName(column = "birthMonth")
    private Integer birthMonth;

    @CsvBindByName(column = "birthDay")
    private Integer birthDay;

    @CsvBindByName(column = "birthCountry")
    private String birthCountry;

    @CsvBindByName(column = "birthState")
    private String birthState;

    @CsvBindByName(column = "birthCity")
    private String birthCity;

    @CsvBindByName(column = "deathYear")
    private Integer deathYear;

    @CsvBindByName(column = "deathMonth")
    private Integer deathMonth;

    @CsvBindByName(column = "deathDay")
    private Integer deathDay;

    @CsvBindByName(column = "deathCountry")
    private String deathCountry;

    @CsvBindByName(column = "deathState")
    private String deathState;

    @CsvBindByName(column = "deathCity")
    private String deathCity;

    @CsvBindByName(column = "nameFirst")
    private String nameFirst;

    @CsvBindByName(column = "nameLast")
    private String nameLast;

    @CsvBindByName(column = "nameGiven")
    private String nameGiven;

    @CsvBindByName(column = "weight")
    private Integer weight;

    @CsvBindByName(column = "height")
    private Integer height;

    @CsvBindByName(column = "bats")
    private String bats;

    @CsvBindByName(column = "throws")
    private String throwsParam;

    @CsvBindByName(column = "debut")
    private String debut;

    @CsvBindByName(column = "finalGame")
    private String finalGame;

    @CsvBindByName(column = "retroID")
    private String retroID;

    @CsvBindByName(column = "bbrefID")
    private String bbrefID;

}
