package com.meddew.algo.polymorphism;

public class UstensileCuisineCollection {
    public static void main(String[] args){
        Ustensile [] ustensiles = new Ustensile[5];
        ustensiles[0] = new AssietteRonde(1926, 8.4);
        ustensiles[1] = new Cuillere(1881, 7.3);
        ustensiles[2] = new AssietteCarree(1935, 5.6);
        ustensiles[3] = new Cuillere(1917, 8.8);
        ustensiles[4] = new AssietteRonde(1837, 5.4);

        afficherCuilleres(ustensiles);
        afficherSurfaceAssiettes(ustensiles);
        afficherValeurTotale(ustensiles);
    }

    static void afficherCuilleres(Ustensile[] us) {
        int nbCuilleres = 0;
        for (int i = 0; i < us.length; i++) {
            if(us[i] instanceof Cuillere){
                nbCuilleres += 1;
            }
        }
        System.out.println("Il y a " + nbCuilleres + " cuillères.");
    }

    static void afficherSurfaceAssiettes(Ustensile[] us) {
        double somme = 0;
        for (int i = 0; i < us.length; i++) {
//            if(us[i] instanceof AssietteRonde){
//                somme += 3.14 * Math.pow(us[i].getDimension(), 2);
//            }
//
//            if(us[i] instanceof AssietteCarree){
//                somme += Math.pow(us[i].getDimension(), 2);
//            }
            if(us[i] instanceof Assiette){
                somme += ((Assiette) us[i]).calculerSurface();
            }
        }
        System.out.println("Surface totale des assiettes : " + somme);
    }

    static void afficherValeurTotale(Ustensile[] us) {
        double somme = 0;

        for (int i = 0; i < us.length; i++) {
//            int yearDifference = currentYear - us[i].getYear();
//            int yearDifferenceForCalcualtion = yearDifference - 50;
//            if(us[i] instanceof Cuillere || us[i] instanceof AssietteRonde ){
//                if(yearDifference > 50){
//                    somme += yearDifferenceForCalcualtion;
//                }
//            } else if(us[i] instanceof AssietteCarree){
//                if(yearDifference > 50){
//                    somme += yearDifferenceForCalcualtion * 5;
//                }
//            }
            somme += us[i].calculerValeur(us[i].getYear());

        }
        System.out.println("Valeur totale de la collection : " + somme);
    }
}
