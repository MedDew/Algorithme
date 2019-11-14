package com.meddew.algo.polymorphism;

public class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int year, double cote) {
        this.cote = cote;
        super.setYear(year);
    }

    @Override
    public double getDimension() {
        return this.getCote();
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public double calculerSurface() {
        return Math.pow(this.getDimension(), 2);
    }

    @Override
    public double calculerValeur(int year) {
        return 5 * super.calculerValeur(year);
    }
}
