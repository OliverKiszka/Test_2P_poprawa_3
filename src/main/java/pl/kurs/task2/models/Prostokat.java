package pl.kurs.task2.models;

import java.util.Objects;

public class Prostokat extends Figura {
    private final int a;
    private final int b;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    double calculatePerimeter() {
        return 2 * (a + b);
    }

    @Override
    double calculateArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Figura nr " + getNumber() + ": " + "Prostokat o bokach " + a + "x" + b + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prostokat prostokat = (Prostokat) o;
        return a == prostokat.a && b == prostokat.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}