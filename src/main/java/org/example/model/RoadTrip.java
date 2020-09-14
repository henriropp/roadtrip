package org.example.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RoadTrip {
    private final List<FruitStand> fruitStands;

    public RoadTrip(List<FruitStand> fruitStands) {
        this.fruitStands = new ArrayList<>(fruitStands);
    }

    public List<FruitStand> getFruitStands() {
        return Collections.unmodifiableList(fruitStands);
    }

    public int getLocationOf(FruitStand cheapestFruitStand) {
        return fruitStands.indexOf(cheapestFruitStand);
    }
}
