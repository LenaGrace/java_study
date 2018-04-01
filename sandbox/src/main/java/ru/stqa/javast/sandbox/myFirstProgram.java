package ru.stqa.javast.sandbox;

public class myFirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello everyone!");
        Point p2 = new Point();
        Point p1 = new Point();
        p1.x = 0.0;
        p1.y = 0.0;
        p2.x = 4.0;
        p2.y = 3.0;
        System.out.println("Расстояние между точками " + distance(p1,p2));
    }

    public static double distance(Point p1, Point p2) {
        double l = Math.sqrt((p2.y - p1.y)*(p2.y - p1.y) + (p2.x - p1.x)*(p2.x - p1.x));
        return l;

    }
}
