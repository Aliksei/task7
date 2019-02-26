package com.itacademy.task7.enteties;

public enum ShipTypes {
    CRUSIER("Cruiser"),
    DEATH_STAR("Death Star"),
    FIGHTER("Fighter"),
    SPY("Spy"),
    TRANSPORT("Transport");

    private String value;

    ShipTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
