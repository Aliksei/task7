package com.itacademy.task7.enteties.ship;

import com.itacademy.task7.enteties.CivilShip;
import lombok.Builder;
import lombok.Data;

@Data
public class TransportShip extends CivilShip {

    private int capacity;

    @Builder
    public TransportShip(int fuel, String fueType, String name, int armor, String color, int capacity) {
        super(fuel, fueType, name, armor, color);
        this.capacity = capacity;
    }
}
