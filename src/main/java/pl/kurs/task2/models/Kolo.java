package pl.kurs.task2.models;

import java.util.Objects;

public class Kolo extends Figura {
    private final int d;

    public Kolo(int d) {
        this.d = d;
    }


    @Override
    double calculatePerimeter() {
        return d * Math.PI;
    }

    @Override
    double calculateArea() {
        return Math.PI * (d * d) / 4;
    }

    @Override
    public String toString() {
        return "Figura nr " + getNumber() + ": " + "Koło o promieniu " + (d / 2) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kolo kolo = (Kolo) o;
        return d == kolo.d;
    }

    @Override
    public int hashCode() {
        return Objects.hash(d);
    }
}