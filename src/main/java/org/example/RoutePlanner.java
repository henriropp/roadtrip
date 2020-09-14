package org.example;

import org.example.model.FruitStand;
import org.example.model.FruitType;
import org.example.model.RoadTrip;
import org.example.model.RouteInfo;
import org.example.model.ShoppingList;

public class RoutePlanner {
    private final RoadTrip roadTrip;

    public RoutePlanner(RoadTrip roadTrip) {
        this.roadTrip = roadTrip;
    }

    public RouteInfo findCheapestFruitStand() {
        final ShoppingList alt1 = new ShoppingList(FruitType.PEAR, FruitType.CHERRY);
        final ShoppingList alt2 = new ShoppingList(FruitType.PEAR, FruitType.PEACH);

        final FruitStand cheapestFruitStandAlt1 = findCheapestFruitStand(alt1);
        final FruitStand cheapestFruitStandAlt2 = findCheapestFruitStand(alt2);

        final int priceAlt1 = getPriceFor(cheapestFruitStandAlt1, alt1);
        final int priceAlt2 = getPriceFor(cheapestFruitStandAlt2, alt2);

        if (priceAlt1 == priceAlt2) {
            final int indexAlt1 = roadTrip.getLocationOf(cheapestFruitStandAlt1);
            final int indexAlt2 = roadTrip.getLocationOf(cheapestFruitStandAlt2);

            return new RouteInfo(Math.min(indexAlt1, indexAlt2), priceAlt1);

        } else if (priceAlt1 < priceAlt2) {
            return new RouteInfo(roadTrip.getLocationOf(cheapestFruitStandAlt1), priceAlt1);

        }

        return new RouteInfo(roadTrip.getLocationOf(cheapestFruitStandAlt2), priceAlt2);
    }

    private FruitStand findCheapestFruitStand(ShoppingList shoppingList) {
        return roadTrip.getFruitStands().stream()
                .reduce(null, (cheapestSoFar, current) -> {
                    if (cheapestSoFar == null) {
                        return current;
                    }

                    final int currentPrice = getPriceFor(current, shoppingList);
                    final int cheapestPrice = getPriceFor(cheapestSoFar, shoppingList);

                    return currentPrice < cheapestPrice ? current : cheapestSoFar;
                });
    }

    private int getPriceFor(FruitStand fruitStand, ShoppingList shoppingList) {
        return fruitStand.queryPriceForFruitBaskets(shoppingList.getBasketTypes());
    }
}
