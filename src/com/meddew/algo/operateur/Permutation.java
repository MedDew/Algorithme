package com.meddew.algo.operateur;

import java.util.Scanner;

public class Permutation {
    private static int x;
    private static int y;

    public static  void main(String args []){
        Scanner sc = new Scanner(System.in);
        x = lireDonnee(sc, "X");
        y = lireDonnee(sc, "Y");
        permute(x, y);
    }

    public static int lireDonnee(Scanner sc, String property){
        int value = 0;
        System.out.println("Entrez "+property+" : ");
        while(!sc.hasNextInt()){
            System.out.println("Veuillez entrez un chiffre!!!");
            System.out.println("Entrez "+property+" : ");
            sc.next();
        }
        value = sc.nextInt();
        return value;
    }

    public static void permute(int x, int y){
        System.out.println("Avant permutation :");
        System.out.println("X :"+Permutation.x);
        System.out.println("Y :"+Permutation.y);
        System.out.println("Aprés permutation :");
        Permutation.x=y;
        Permutation.y=x;
        System.out.println("X :"+Permutation.x);
        System.out.println("Y :"+Permutation.y);
    }
}
