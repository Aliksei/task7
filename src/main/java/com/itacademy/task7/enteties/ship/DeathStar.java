package com.itacademy.task7.enteties.ship;

import com.itacademy.task7.enteties.WarShip;
import lombok.Builder;
import lombok.Data;

@Data
public class DeathStar extends WarShip {

    private int fightersCapacity;

    @Builder
    public DeathStar(int fuel, String fueType, String name, int armor, int damage, int fightersCapacity) {
        super(fuel, fueType, name, armor, damage);
        this.fightersCapacity = fightersCapacity;
    }
}
