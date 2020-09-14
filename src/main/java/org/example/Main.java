package org.example;

import org.example.model.FruitBasket;
import org.example.model.FruitStand;
import org.example.model.FruitType;
import org.example.model.Price;
import org.example.model.RoadTrip;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final RoutePlanner routePlanner = createRoutePlanner();

        System.out.println(String.format("FruitStand stop number %d is the cheapest", routePlanner.findCheapestFruitStand() + 1));
    }

    private static RoutePlanner createRoutePlanner() {
        return new RoutePlanner(
                createRoadTrip(
                        createFruitStand(
                                createBasket(FruitType.CHERRY, 5),
                                createBasket(FruitType.PEACH, 7)
                        ),
                        createFruitStand(
                                createBasket(FruitType.CHERRY, 2),
                                createBasket(FruitType.PEACH, 4)
                        ),
                        createFruitStand(
                                createBasket(FruitType.CHERRY, 1),
                                createBasket(FruitType.PEACH, 4)
                        ),
                        createFruitStand(
                                createBasket(FruitType.CHERRY, 2),
                                createBasket(FruitType.PEACH, 5)
                        )
                )
        );
    }

    private static RoadTrip createRoadTrip(FruitStand... fruitStands) {
        return new RoadTrip(List.of(fruitStands));
    }

    private static FruitStand createFruitStand(FruitBasket... baskets) {
        return new FruitStand(List.of(baskets));
    }

    private static FruitBasket createBasket(FruitType type, int price) {
        return new FruitBasket(type, new Price(price));
    }

}
