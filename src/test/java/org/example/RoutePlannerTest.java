package org.example;

import org.example.model.RoadTrip;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.example.FruitStandTestHelper.FRUIT_STAND_5;
import static org.example.FruitStandTestHelper.FRUIT_STAND_6;
import static org.example.FruitStandTestHelper.FRUIT_STAND_8;
import static org.example.FruitStandTestHelper.FRUIT_STAND_9;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class RoutePlannerTest {
    private RoutePlanner routePlanner;

    @Test
    void findCheapestFruitStand_route1() {
        final RoadTrip roadTrip = new RoadTrip(
                List.of(
                        FRUIT_STAND_8,
                        FRUIT_STAND_5,
                        FRUIT_STAND_9,
                        FRUIT_STAND_6
                )
        );
        routePlanner = new RoutePlanner(roadTrip);

        assertEquals(1, routePlanner.findCheapestFruitStand());
    }

    @Test
    void findCheapestFruitStand_route2() {
        final RoadTrip roadTrip = new RoadTrip(
                List.of(
                        FRUIT_STAND_8,
                        FRUIT_STAND_9,
                        FRUIT_STAND_6,
                        FRUIT_STAND_5
                )
        );
        routePlanner = new RoutePlanner(roadTrip);

        assertEquals(3, routePlanner.findCheapestFruitStand());
    }

    @Test
    void findCheapestFruitStand_same_price() {
        final RoadTrip roadTrip = new RoadTrip(
                List.of(
                        FRUIT_STAND_5,
                        FRUIT_STAND_9,
                        FRUIT_STAND_6,
                        FRUIT_STAND_5
                )
        );
        routePlanner = new RoutePlanner(roadTrip);

        assertEquals(0, routePlanner.findCheapestFruitStand());
    }
}