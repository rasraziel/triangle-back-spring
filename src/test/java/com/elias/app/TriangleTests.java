package com.elias.app;

import com.elias.app.controller.TriangleController;
import com.elias.app.model.Point;
import com.elias.app.model.Triangle;
import com.elias.app.model.TriangleRequestPoints;
import com.elias.app.model.TriangleRequestSides;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TriangleTests {

    Point a,b,c;

    @Test
    public void checkIfScalene() {
        a = new Point(0,0);
        b = new Point(5,4);
        c = new Point(5,0);
        Triangle t = new Triangle(a,b,c);
        assertEquals(Triangle.Type.SCALENE, t.typeOfTriangle());
    }

    @Test
    public void checkIfNoTriangle1() {
        a = new Point(0,1);
        b = new Point(0,4);
        c = new Point(0,3);
        TriangleRequestPoints req = new TriangleRequestPoints(a,b,c);
        TriangleController con = new TriangleController();
        assertTrue(con.isInvalidRequestPoints(req));
    }

    @Test
    public void checkIfNoTriangle2() {
        a = new Point(0,0);
        b = new Point(5,5);
        c = new Point(5,5);
        TriangleRequestPoints req = new TriangleRequestPoints(a,b,c);
        TriangleController con = new TriangleController();
        assertTrue(con.isInvalidRequestPoints(req));
    }

    @Test
    public void checkIfNoTriangle3() {
        a = new Point(1,6);
        b = new Point(2,6);
        c = new Point(3,6);
        TriangleRequestPoints req = new TriangleRequestPoints(a,b,c);
        TriangleController con = new TriangleController();
        assertTrue(con.isInvalidRequestPoints(req));
    }

    @Test
    public void checkIfNoTriangle4() {
        a = new Point(0,0);
        b = new Point(150,150);
        c = new Point(300,300);
        TriangleRequestPoints req = new TriangleRequestPoints(a,b,c);
        TriangleController con = new TriangleController();
        assertTrue(con.isInvalidRequestPoints(req));
    }

    @Test
    public void checkIfNoTriangleSides1() {
        double ab = 0;
        double bc = 1;
        double ca = 2;
        TriangleRequestSides req = new TriangleRequestSides(ab, bc ,ca);
        TriangleController con = new TriangleController();
        assertTrue(con.isInvalidRequestSides(req));
    }

    @Test
    public void checkIfNoTriangleSides2() {
        double ab = 1;
        double bc = 2;
        double ca = 3;
        TriangleRequestSides req = new TriangleRequestSides(ab, bc ,ca);
        TriangleController con = new TriangleController();
        assertTrue(con.isInvalidRequestSides(req));
    }

    @Test
    public void checkIfIsosceles() {
        a = new Point(0,0);
        b = new Point(5,5);
        c = new Point(10,0);
        Triangle t = new Triangle(a,b,c);
        assertEquals(Triangle.Type.ISOSCELES, t.typeOfTriangle());
    }

    @Test
    public void checkIfEquilateral() {
        a = new Point(0,0);
        b = new Point(2,3.46);
        c = new Point(4,0);
        Triangle t = new Triangle(a,b,c);
        assertEquals(Triangle.Type.EQUILATERAL, t.typeOfTriangle());
    }


}
