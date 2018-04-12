package ru.stqa.javast.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void testPoints() {
        Point p = new Point(0.0, 0.0, 3.0, 4.0);
        Assert.assertEquals(p.distance(),5.0);
    }

    @Test
    public void testPoints1() {
        Point p = new Point(4.0, 7.0, 4.0, 15.0);
        Assert.assertEquals(p.distance(),8.0);
    }
}
