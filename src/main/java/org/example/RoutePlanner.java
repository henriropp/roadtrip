package org.example;

import org.example.model.FruitStand;
import org.example.model.FruitType;
import org.example.model.RoadTrip;

import java.util.List;

public class RoutePlanner {
    private final RoadTrip roadTrip;

    public RoutePlanner(RoadTrip roadTrip) {
        this.roadTrip = roadTrip;
    }

    public int findCheapestFruitStand() {
        final FruitStand cheapestFruitStand = roadTrip.getFruitStands().stream()
                .reduce(null, (cheapestSoFar, current) -> {
                    if (cheapestSoFar == null) {
                        return current;
                    }

                    final int currentPrice = getPriceFor(current, FruitType.CHERRY, FruitType.PEACH);
                    final int cheapestPrice = getPriceFor(cheapestSoFar, FruitType.CHERRY, FruitType.PEACH);

                    return currentPrice < cheapestPrice ? current : cheapestSoFar;
                });

        return roadTrip.getLocationOf(cheapestFruitStand);
    }

    private int getPriceFor(FruitStand fruitStand, FruitType... fruitTypes) {
        return fruitStand.queryPriceForFruitBaskets(List.of(fruitTypes));
    }
}
