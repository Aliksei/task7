package com.itacademy.task7.enteties.ship;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.itacademy.task7.enteties.WarShip;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CruiserShip extends WarShip {

    private int numberOfWeapon;

    @Builder
    public CruiserShip(int fuel, String fueType, String name, int armor, int damage, int numberOfWeapon) {
        super(fuel, fueType, name, armor, damage);
        this.numberOfWeapon = numberOfWeapon;
    }
}
