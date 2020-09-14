package org.example.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class RoadTripTest {
    @Test
    void oneFruitStand() {
        final RoadTrip roadTrip = new RoadTrip(List.of(mock(FruitStand.class)));

        assertEquals(1, roadTrip.getFruitStands().size());
    }

    @Test
    void fruitStandOrder() {
        final FruitStand fruitStand1 = mock(FruitStand.class);
        final FruitStand fruitStand2 = mock(FruitStand.class);
        final FruitStand fruitStand3 = mock(FruitStand.class);

        final RoadTrip roadTrip = new RoadTrip(List.of(fruitStand1, fruitStand2, fruitStand3));

        assertEquals(fruitStand1, roadTrip.getFruitStands().get(0));
        assertEquals(fruitStand2, roadTrip.getFruitStands().get(1));
        assertEquals(fruitStand3, roadTrip.getFruitStands().get(2));
    }
}