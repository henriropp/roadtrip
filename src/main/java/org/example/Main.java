package org.example;

import org.example.model.FruitBasket;
import org.example.model.FruitStand;
import org.example.model.FruitType;
import org.example.model.Price;
import org.example.model.RoadTrip;
import org.example.model.RouteInfo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final RoutePlanner routePlanner = createRoutePlanner();

        final RouteInfo routeInfo = routePlanner.findCheapestFruitStand();

        System.out.printf("FruitStand stop number %d is the cheapest, price is %d%n", routeInfo.getIndex() + 1, routeInfo.getCost());
    }

    private static RoutePlanner createRoutePlanner() {
        return new RoutePlanner(
                createRoadTrip(
                        createFruitStand(
                                createBasket(FruitType.CHERRY, 5),
                                createBasket(FruitType.PEACH, 7),
                                createBasket(FruitType.PEAR, 3)
                        ),
                        createFruitStand(
                                createBasket(FruitType.CHERRY, 2),
                                createBasket(FruitType.PEACH, 4),
                                createBasket(FruitType.PEAR, 3)
                        ),
                        createFruitStand(
                                createBasket(FruitType.CHERRY, 1),
                                createBasket(FruitType.PEACH, 4),
                                createBasket(FruitType.PEAR, 3)
                        ),
                        createFruitStand(
                                createBasket(FruitType.CHERRY, 2),
                                createBasket(FruitType.PEACH, 5),
                                createBasket(FruitType.PEAR, 3)
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
