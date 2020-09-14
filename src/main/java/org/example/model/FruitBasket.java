package org.example.model;

public class FruitBasket {
    private final FruitType contentType;
    private final Price price;

    public FruitBasket(FruitType contentType, Price price) {
        this.contentType = contentType;
        this.price = price;
    }

    public boolean isOfType(FruitType fruitType) {
        return fruitType.equals(contentType);
    }

    public Price getPrice() {
        return price;
    }
}
