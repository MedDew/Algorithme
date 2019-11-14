package com.meddew.algo.surfacerectangle;

import java.util.Scanner;

public class Rectangle {
    private static char choix;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double l = 0;
        double L = 0;
        do{
            l = lireDonnee("longueur", scanner);
            L = lireDonnee("largeur",scanner);

            if(isValueGreaterThan0(l, L)){
                double result = calculer(l,L,scanner);
                if(choix == 's' || choix == 'S'){
                    System.out.println("La surface est : "+result);
                } else if(choix == 'p' || choix == 'P'){
                    System.out.println("Le perimetre est : "+result);
                }
            }else{
                System.out.println("Erreur: vous avez introduit une largeur ou une hauteur négative!");
                System.out.println("Pour continuer tapez n'importe quelle touche");
                scanner.next();
            }
        }while(l <= 0 && L <= 0);
    }

    static double lireDonnee(String message, Scanner sc){
        System.out.println("Indiquez une "+message+" : ");
        return sc.nextDouble();
    }

    static double calculer(double l,double L, Scanner sc){
        System.out.println("Surface ('s/S') ou perimètre ('p/P')?:");
        Character c = sc.next().charAt(0);
        choix = c;
        double result = 0;
        switch(c){
            case 's':
            case 'S':
                result = l * L;
            break;

            case 'p':
            case 'P':
                result = 2*(l + L);
            break;
        }
        return result;
    }

    static boolean isValueGreaterThan0(double l, double L){
        return l > 0 && L > 0;
    }
}
