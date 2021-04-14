package com.elias.app.model;

public class Triangle {

    private final Point A;
    private final Point B;
    private final Point C;
    private final double AB_LENGTH;
    private final double BC_LENGTH;
    private final double CA_LENGTH;

    public Triangle(Point A, Point B, Point C, double AB_LENGTH, double BC_LENGTH, double CA_LENGTH) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.AB_LENGTH = AB_LENGTH;
        this.BC_LENGTH = BC_LENGTH;
        this.CA_LENGTH = CA_LENGTH;
    }

    public Triangle(double AB_LENGTH, double BC_LENGTH, double CA_LENGTH) {
        this.AB_LENGTH = AB_LENGTH;
        this.BC_LENGTH = BC_LENGTH;
        this.CA_LENGTH = CA_LENGTH;
        this.A = null;
        this.B = null;
        this.C = null;
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public Point getC() {
        return C;
    }

    public double getAB_LENGTH() {
        return AB_LENGTH;
    }

    public double getBC_LENGTH() {
        return BC_LENGTH;
    }

    public double getCA_LENGTH() {
        return CA_LENGTH;
    }

    //Method calculating side length based on x,y coordinates
    public static double sideLength(Point one, Point two) {
        int xDiff = Math.abs(one.getX() - two.getX());
        int yDiff = Math.abs(one.getY() - two.getY());
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    public static TriangleType typeOfTriangle(Triangle triangle) {
        double ab = triangle.AB_LENGTH;
        double bc = triangle.BC_LENGTH;
        double ca = triangle.CA_LENGTH;
       return triangle.A!=null
                 ? triangle.A.getX() == triangle.B.getX() && triangle.B.getX() == triangle.C.getX() ||
                   triangle.A.getY() == triangle.B.getY() && triangle.B.getY() == triangle.C.getY() ||
                   ab==0 || bc == 0 || ca==0 || ab+bc<=ca || bc+ca<=ab || ca+ab<=bc
                    ? TriangleType.NONE
                    : (ab != bc && ab != ca && bc != ca)
                        ? TriangleType.SCALENE
                        : TriangleType.ISOSCELES
                 : ab==0 || bc == 0 || ca==0 || ab+bc<=ca || bc+ca<=ab || ca+ab<=bc
                    ? TriangleType.NONE
                    : (ab != bc && ab != ca && bc != ca)
                        ? TriangleType.SCALENE
                        : ab == bc && bc == ca
                            ? TriangleType.EQUILATERAL
                            : TriangleType.ISOSCELES;
    }

    public enum TriangleType {
        SCALENE,
        ISOSCELES,
        EQUILATERAL,
        NONE
    }


}
