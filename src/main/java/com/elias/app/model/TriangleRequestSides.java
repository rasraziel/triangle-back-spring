package com.elias.app.model;

public class TriangleRequestSides {
    private final double ab;
    private final double bc;
    private final double ca;

    public TriangleRequestSides(double ab, double bc, double ca) {
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;
    }

    public double getAb() {
        return ab;
    }

    public double getBc() {
        return bc;
    }

    public double getCa() {
        return ca;
    }

}
