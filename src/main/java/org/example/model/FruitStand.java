package org.example.model;

import java.util.List;

public class FruitStand {
    private final List<FruitBasket> inventory;

    public FruitStand(List<FruitBasket> inventory) {
        this.inventory = inventory;
    }

    public int queryPriceForFruitBaskets(List<FruitType> basketTypes) {
        return basketTypes.stream()
                .reduce(0, (total, fruitType) -> total + priceForFruitType(fruitType), Integer::sum);
    }

    private int priceForFruitType(FruitType fruitType) {
        return inventory.stream()
                .filter(fruitBasket -> fruitBasket.isOfType(fruitType))
                .map(fruitBasket -> fruitBasket.getPrice().getValue())
                .findFirst()
                .orElseThrow(() -> new RuntimeException(String.format("%s not available", fruitType)));
    }
}
