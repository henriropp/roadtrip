package org.example.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class PriceTest {

    @Test
    void getValue() {
        final Price price = new Price(5);

        assertEquals(5, price.getValue());
    }
}