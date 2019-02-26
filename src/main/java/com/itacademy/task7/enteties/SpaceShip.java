package com.itacademy.task7.enteties;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "className")
public abstract class SpaceShip {

    private int fuel;

    private String fueType;

    private String name;

    private int armor;

}
