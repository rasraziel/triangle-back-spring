package com.elias.app;

import com.elias.app.model.Point;
import com.elias.app.model.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TriangleTests {

    Point a,b,c;

    @Test
    public void checkIfScalene() {
        a = new Point(0,0);
        b = new Point(5,4);
        c = new Point(5,0);
        Triangle t = new Triangle(a,b,c,Triangle.sideLength(a,b), Triangle.sideLength(b,c), Triangle.sideLength(c,a));
        assertEquals(Triangle.TriangleType.SCALENE, Triangle.typeOfTriangle(t));
    }

    @Test
    public void checkIfNoTriangle1() {
        a = new Point(0,1);
        b = new Point(0,4);
        c = new Point(0,3);
        Triangle t = new Triangle(a,b,c,Triangle.sideLength(a,b), Triangle.sideLength(b,c), Triangle.sideLength(c,a));
        assertEquals(Triangle.TriangleType.NONE, Triangle.typeOfTriangle(t));
    }

    @Test
    public void checkIfNoTriangle2() {
        a = new Point(0,0);
        b = new Point(5,5);
        c = new Point(5,5);
        Triangle t = new Triangle(a,b,c,Triangle.sideLength(a,b), Triangle.sideLength(b,c), Triangle.sideLength(c,a));
        assertEquals(Triangle.TriangleType.NONE, Triangle.typeOfTriangle(t));
    }

    @Test
    public void checkIfNoTriangle3() {
        a = new Point(1,6);
        b = new Point(2,6);
        c = new Point(3,6);
        Triangle t = new Triangle(a,b,c,Triangle.sideLength(a,b), Triangle.sideLength(b,c), Triangle.sideLength(c,a));
        assertEquals(Triangle.TriangleType.NONE, Triangle.typeOfTriangle(t));
    }

    @Test
    public void checkIfIsosceles() {
        a = new Point(0,0);
        b = new Point(5,5);
        c = new Point(10,0);
        Triangle t = new Triangle(a,b,c,Triangle.sideLength(a,b), Triangle.sideLength(b,c), Triangle.sideLength(c,a));
        assertEquals(Triangle.TriangleType.ISOSCELES, Triangle.typeOfTriangle(t));
    }

    @Test
    public void checkIfEquilateral() {
        Triangle t = new Triangle(5,5,5);
        assertEquals(Triangle.TriangleType.EQUILATERAL, Triangle.typeOfTriangle(t));
    }


}
