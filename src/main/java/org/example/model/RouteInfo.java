package org.example.model;

public class RouteInfo {
    private final int index;
    private final int cost;

    public RouteInfo(int index, int cost) {
        this.index = index;
        this.cost = cost;
    }

    public int getIndex() {
        return index;
    }

    public int getCost() {
        return cost;
    }
}
