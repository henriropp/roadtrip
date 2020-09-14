package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class FruitBasketTest {
    private FruitBasket fruitBasket;

    @BeforeEach
    void setUp() {
        fruitBasket = new FruitBasket(FruitType.PEACH, new Price(5));
    }

    @Test
    void isOfType() {
        assertTrue(fruitBasket.isOfType(FruitType.PEACH));
    }

    @Test
    void getPrice() {
        assertEquals(5, fruitBasket.getPrice().getValue());
    }
}