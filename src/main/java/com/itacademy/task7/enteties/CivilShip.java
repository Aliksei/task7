package com.itacademy.task7.enteties;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.itacademy.task7.enteties.ship.CruiserShip;
import com.itacademy.task7.enteties.ship.DeathStar;
import com.itacademy.task7.enteties.ship.FighterShip;
import com.itacademy.task7.enteties.ship.SpyScanner;
import com.itacademy.task7.enteties.ship.TransportShip;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonSubTypes({
        @JsonSubTypes.Type(value = SpyScanner.class, name = "Spy"),
        @JsonSubTypes.Type(value = TransportShip.class, name = "Transport"),
})
public abstract class CivilShip extends SpaceShip{

    private String color;

    @Builder
    public CivilShip(int fuel, String fueType, String name, int armor, String color) {
        super(fuel, fueType, name, armor);
        this.color = color;
    }
}
