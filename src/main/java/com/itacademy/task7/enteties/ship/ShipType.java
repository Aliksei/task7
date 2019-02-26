package com.itacademy.task7.enteties.ship;

import com.itacademy.task7.enteties.ShipTypes;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ShipType {

    ShipTypes type();

}
