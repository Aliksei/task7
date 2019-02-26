package com.itacademy.task7.controller;

import com.itacademy.task7.enteties.SpaceShip;
import com.itacademy.task7.enteties.ship.FighterShip;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipController {

    @PostMapping(value = "//spaceship", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SpaceShip> createShip(@RequestBody SpaceShip spaceShip) {
        System.out.println(spaceShip);
        return new ResponseEntity<>(FighterShip.builder()
                .speed(100)
                .armor(200)
                .damage(100)
                .fuel(100)
                .fueType("")
                .name("Fighter M1")
                .build(), HttpStatus.OK);
    }


}
