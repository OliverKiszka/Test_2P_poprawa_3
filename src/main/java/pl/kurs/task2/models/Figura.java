package pl.kurs.task2.models;

import java.util.List;

public abstract class Figura {
    private int number;
    private static int counter;

    abstract double calculatePerimeter();

    abstract double calculateArea();

    public static Kwadrat stworzKwadrat(int a) {
        Figura kwadrat = new Kwadrat(a);
        kwadrat.number = ++counter;
        return (Kwadrat) kwadrat;
    }

    public static Kolo stworzKolo(int d) {
        Figura kolo = new Kolo(d);
        kolo.number = ++counter;
        return (Kolo) kolo;
    }

    public static Prostokat stworzProstokat(int a, int b) {
        Figura prostokat = new Prostokat(a,b);
        prostokat.number = ++counter;
        return (Prostokat) prostokat;
    }

    public int getNumber() {
        return number;
    }

    public static Figura getFiguraWithHighestPerimeter(List<Figura> figury) {
        if (figury != null && !figury.isEmpty()) {
            Figura resultFigura = null;
            double maxPerimeter = 0;
            for (Figura f : figury) {
                if (f != null) {
                    double perimeter = f.calculatePerimeter();
                    if (perimeter > maxPerimeter) {
                        maxPerimeter = perimeter;
                        resultFigura = f;
                    }
                }
            }
            return resultFigura;
        } else {
            return null;
        }
    }

    public static Figura getFiguraWithHighestArea(List<Figura> figury) {
        if (figury != null && !figury.isEmpty()) {
            Figura resultFigura = null;
            double maxArea = 0;
            for (Figura f : figury) {
                if (f != null) {
                    double area = f.calculateArea();
                    if (area > maxArea) {
                        maxArea = area;
                        resultFigura = f;
                    }
                }
            }
            return resultFigura;
        } else {
            return null;
        }
    }


}