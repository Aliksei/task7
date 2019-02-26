package com.itacademy.task7.enteties;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.itacademy.task7.enteties.ship.CruiserShip;
import com.itacademy.task7.enteties.ship.DeathStar;
import com.itacademy.task7.enteties.ship.FighterShip;
import lombok.Builder;
import lombok.Data;

@Data
@JsonSubTypes({
        @JsonSubTypes.Type(value = CruiserShip.class, name = "Cruiser"),
        @JsonSubTypes.Type(value = DeathStar.class, name = "Death Star"),
        @JsonSubTypes.Type(value = FighterShip.class, name = "Fighter")
})
public abstract class WarShip extends SpaceShip {

    private int damage;

    @Builder
    public WarShip(int fuel, String fueType, String name, int armor, int damage) {
        super(fuel, fueType, name, armor);
        this.damage = damage;
    }
}
