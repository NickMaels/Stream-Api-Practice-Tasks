package com.stream.tasks.traders.models;

import java.util.Objects;

public class Trader {

    private final String name;
    private final String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return name + " in " + city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trader trader = (Trader) o;
        return Objects.equals(name, trader.name) && Objects.equals(city, trader.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }
}
