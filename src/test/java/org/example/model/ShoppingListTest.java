package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class ShoppingListTest {
    private ShoppingList shoppingList;

    @BeforeEach
    void setUp() {
        shoppingList = new ShoppingList(FruitType.CHERRY, FruitType.PEAR, FruitType.PEACH);
    }

    @Test
    void getBasketTypes() {
        assertEquals(3, shoppingList.getBasketTypes().size());
        assertTrue(shoppingList.getBasketTypes().containsAll(List.of(FruitType.CHERRY, FruitType.PEAR, FruitType.PEACH)));
    }
}