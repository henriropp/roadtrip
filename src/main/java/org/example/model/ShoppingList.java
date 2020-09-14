package org.example.model;

import java.util.Collections;
import java.util.List;

public class ShoppingList {
    private List<FruitType> basketTypes;

    public ShoppingList(FruitType... basketTypes) {
        this.basketTypes = List.of(basketTypes);
    }

    public List<FruitType> getBasketTypes() {
        return Collections.unmodifiableList(basketTypes);
    }
}
