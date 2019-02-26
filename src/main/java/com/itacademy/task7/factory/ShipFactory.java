//package com.itacademy.task7.factory;
//
//import com.itacademy.task7.enteties.ShipTypes;
//import com.itacademy.task7.enteties.SpaceShip;
//import com.itacademy.task7.enteties.ship.ShipType;
//import java.util.EnumMap;
//import java.util.Map;
//import org.reflections.Reflections;
//
//
//public class ShipFactory {
//
//    public static final Map<ShipTypes, Class> mapping = new EnumMap<>(ShipTypes.class);
//
//    static {
//        new Reflections("com.itacademy.task7.enteties.ship")
//                .getSubTypesOf(Object.class)
//                .stream()
//                .filter(clazz -> clazz.isAnnotationPresent(ShipType.class))
//                .forEach(clazz -> mapping.put(clazz.getAnnotation(ShipType.class).type(), clazz));
//    }
//
//    public static SpaceShip buildShip(final ShipTypes shipType, final Map<String, String> params) {
//        try {
//            Class aClass = mapping.get(shipType);
//        } catch (InstantiationException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//}
