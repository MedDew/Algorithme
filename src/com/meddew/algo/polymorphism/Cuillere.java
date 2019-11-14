package com.meddew.algo.polymorphism;

public class Cuillere extends Ustensile {
    private double longueur;

    public Cuillere(int year, double longueur) {
        this.longueur = longueur;
        super.setYear(year);
    }

    @Override
    public double getDimension() {
        return getLongueur();
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
}
