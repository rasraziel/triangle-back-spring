package com.elias.app.model;

public class Triangle {

    public enum Type {
        SCALENE,
        ISOSCELES,
        EQUILATERAL,
        NONE
    }

    private final Point A;
    private final Point B;
    private final Point C;
    private double AB_LENGTH;
    private double BC_LENGTH;
    private double CA_LENGTH;



    //Constructor for Point based objects
    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
        AB_LENGTH = Triangle.sideLength(A, B);
        BC_LENGTH = Triangle.sideLength(B, C);
        CA_LENGTH = Triangle.sideLength(C, A);
    }

    //Constructor for side based objects
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


    //Method calculating side length based on x,y coordinates using the Pythagorean theorem
    public static double sideLength(Point one, Point two) {
        double xDiff = Math.abs(one.getX() - two.getX());
        double yDiff = Math.abs(one.getY() - two.getY());
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }


    public Type typeOfTriangle() {
        if(isEquilateral()) return Type.EQUILATERAL;
        if(isIsosceles()) return Type.ISOSCELES;
        if(isScalene()) return Type.SCALENE;
        return Type.NONE;
    }

    private boolean isIsosceles(){
        return AB_LENGTH==BC_LENGTH || BC_LENGTH==CA_LENGTH || CA_LENGTH == AB_LENGTH;
    }

    private boolean isEquilateral(){
        return AB_LENGTH==BC_LENGTH && BC_LENGTH == CA_LENGTH;
    }

    private boolean isScalene(){
        return AB_LENGTH!=BC_LENGTH && BC_LENGTH!=CA_LENGTH && CA_LENGTH!=AB_LENGTH;
    }

}
