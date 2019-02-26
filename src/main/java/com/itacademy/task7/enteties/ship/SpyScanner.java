package com.itacademy.task7.enteties.ship;

import com.itacademy.task7.enteties.CivilShip;
import com.itacademy.task7.enteties.ShipTypes;
import lombok.Builder;
import lombok.Data;

@Data
@ShipType(type = ShipTypes.CRUSIER)
public class SpyScanner extends CivilShip {

    private String scanner;

    @Builder
    public SpyScanner(int fuel, String fueType, String name, int armor, String color, String scanner) {
        super(fuel, fueType, name, armor, color);
        this.scanner = scanner;
    }
}
