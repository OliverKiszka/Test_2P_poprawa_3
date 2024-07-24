package pl.kurs.task2.models;


import java.util.Objects;

public class Kwadrat extends Figura {
    private final int a;

    public Kwadrat(int a) {
        this.a = a;
    }

    @Override
    double calculatePerimeter() {
        return 4 * a;
    }

    @Override
    double calculateArea() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Figura nr " + getNumber() + ": " + "Kwadrat o boku " + a + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kwadrat kwadrat = (Kwadrat) o;
        return a == kwadrat.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}