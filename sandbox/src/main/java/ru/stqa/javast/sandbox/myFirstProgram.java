package ru.stqa.javast.sandbox;

public class myFirstProgram {

    public static void main(String[] args) {
        Point p1 = new Point(0.0,0.0, 3.0, 4.0);

        System.out.println("Расстояние между точками " + p1.distance());
    }

}
