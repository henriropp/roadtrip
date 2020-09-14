package org.example;

import org.example.model.FruitBasket;
import org.example.model.FruitStand;
import org.example.model.FruitType;
import org.example.model.Price;

import java.util.List;

public class FruitStandTestHelper {
    public static final FruitStand FRUIT_STAND_1 = new FruitStand(List.of(
            new FruitBasket(FruitType.CHERRY, new Price(5)),
            new FruitBasket(FruitType.PEACH, new Price(2)),
            new FruitBasket(FruitType.PEAR, new Price(3))
    ));
    public static final FruitStand FRUIT_STAND_2 = new FruitStand(List.of(
            new FruitBasket(FruitType.CHERRY, new Price(2)),
            new FruitBasket(FruitType.PEACH, new Price(1)),
            new FruitBasket(FruitType.PEAR, new Price(2))
    ));
    public static final FruitStand FRUIT_STAND_3 = new FruitStand(List.of(
            new FruitBasket(FruitType.CHERRY, new Price(4)),
            new FruitBasket(FruitType.PEACH, new Price(4)),
            new FruitBasket(FruitType.PEAR, new Price(1))
    ));
    public static final FruitStand FRUIT_STAND_4 = new FruitStand(List.of(
            new FruitBasket(FruitType.CHERRY, new Price(1)),
            new FruitBasket(FruitType.PEACH, new Price(3)),
            new FruitBasket(FruitType.PEAR, new Price(2))
    ));
}
