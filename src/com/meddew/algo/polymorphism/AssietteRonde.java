package com.meddew.algo.polymorphism;

public class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int year, double rayon) {
        this.rayon = rayon;
        this.setYear(year);
    }

    @Override
    public double getDimension() {
        return getRayon();
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerSurface() {
        return 3.14 * Math.pow(this.getDimension(), 2);
    }
}
