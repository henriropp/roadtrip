package org.example.model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class FruitStandTest {
    private FruitStand fruitStand;

    @BeforeEach
    void setUp() {
        fruitStand = new FruitStand(
                List.of(
                        new FruitBasket(FruitType.PEACH, new Price(3)),
                        new FruitBasket(FruitType.CHERRY, new Price(6))
                )
        );
    }

    @Test
    void queryPriceForFruitBaskets() {
        assertEquals(6, fruitStand.queryPriceForFruitBaskets(List.of(FruitType.CHERRY)));
        assertEquals(3, fruitStand.queryPriceForFruitBaskets(List.of(FruitType.PEACH)));
        assertEquals(9, fruitStand.queryPriceForFruitBaskets(List.of(FruitType.PEACH, FruitType.CHERRY)));
        assertEquals(6, fruitStand.queryPriceForFruitBaskets(List.of(FruitType.PEACH, FruitType.PEACH)));
    }
}