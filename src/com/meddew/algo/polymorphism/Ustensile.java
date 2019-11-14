package com.meddew.algo.polymorphism;

import java.util.Calendar;

public abstract class Ustensile {
    private int year;
    public abstract double getDimension();

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double calculerValeur(int year){
        double somme = 0;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int yearDifference = currentYear - year;
        double yearDifferenceForCalcualtion = 0;
        if(yearDifference > 50){
            yearDifferenceForCalcualtion = yearDifference - 50;
        }

        return yearDifferenceForCalcualtion;
    }
}
