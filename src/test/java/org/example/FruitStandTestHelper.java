package org.example;

import org.example.model.FruitBasket;
import org.example.model.FruitStand;
import org.example.model.FruitType;
import org.example.model.Price;

import java.util.List;

public class FruitStandTestHelper {
    public static final FruitStand FRUIT_STAND_8 = new FruitStand(List.of(
            new FruitBasket(FruitType.CHERRY, new Price(5)),
            new FruitBasket(FruitType.PEACH, new Price(3))
    ));
    public static final FruitStand FRUIT_STAND_5 = new FruitStand(List.of(
            new FruitBasket(FruitType.CHERRY, new Price(2)),
            new FruitBasket(FruitType.PEACH, new Price(3))
    ));
    public static final FruitStand FRUIT_STAND_9 = new FruitStand(List.of(
            new FruitBasket(FruitType.CHERRY, new Price(4)),
            new FruitBasket(FruitType.PEACH, new Price(4))
    ));
    public static final FruitStand FRUIT_STAND_6 = new FruitStand(List.of(
            new FruitBasket(FruitType.CHERRY, new Price(3)),
            new FruitBasket(FruitType.PEACH, new Price(3))
    ));
}
