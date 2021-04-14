package com.elias.app.model;

public class Point {

    // x,y coordinates for the triangle points
    private final int X;
    private final int Y;


    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
}
