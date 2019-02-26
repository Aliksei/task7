package com.itacademy.task7.enteties.ship;

import com.itacademy.task7.enteties.WarShip;
import lombok.Builder;
import lombok.Data;

@Data
public class FighterShip extends WarShip {

    private int speed;

    @Builder
    public FighterShip(int fuel, String fueType, String name, int armor, int damage, int speed) {
        super(fuel, fueType, name, armor, damage);
        this.speed = speed;
    }
}
