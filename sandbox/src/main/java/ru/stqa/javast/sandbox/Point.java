package ru.stqa.javast.sandbox;

public class Point {
    public double x, y, x1, y1;

    public Point(double x, double y, double x1, double y1) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }

    public double distance() {
        return  Math.sqrt((this.y1 - this.y)*(this.y1 - this.y) + (this.x1 - this.x)*(this.x1 - this.x));

    }
}
