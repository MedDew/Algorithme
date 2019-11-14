package com.meddew.algo.modularisation;

import java.util.Arrays;
import java.util.Scanner;

class MulMatMod {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] mat1 = lireMatrice();
        double[][] mat2 = lireMatrice();
        if (mat1[0].length != mat2.length) {
            System.out.println("Multiplication de matrices impossible !");
        } else {
            double [][] prod = multiplierMatrice(mat1, mat2);
            System.out.println("Résultat :");
            afficherMatrice(prod);
        }
    }

    public static int lireEntier(String message){
        int n;
        do {
            System.out.println(message);
            n = scanner.nextInt();
        }while(n < 1);
        return n;
    }

    public static double [][] lireMatrice(){
        int colonne = lireEntier(" Nombre de colonnes : ");
        int ligne = lireEntier(" Nombre de lignes : ");

        double [][] matrice = new double[ligne][colonne];
        for(int row  = 0; row < ligne; row++ ){
            for(int col  = 0; col < colonne; col++){
                System.out.print("  mat[" + (row + 1) + "," + (col + 1) + "]=");
                matrice[row][col] = scanner.nextDouble();
            }
        }

        return matrice;
    }

    public static double[][] multiplierMatrice(double [][] mat1,double [][] mat2){
        double[][] multiplication = new double[mat1.length][mat1[0].length];
        for(int row = 0; row < mat1.length; row++){
            System.out.println(Arrays.toString(mat1[row]));
            for(int col = 0; col  < mat1[row].length; col++){
                System.out.println(mat1[row][col]+" x "+mat2[row][col]+" = "+mat1[row][col] * mat2[row][col]);
                multiplication[row][col] = mat1[row][col] * mat2[row][col];
            }
        }

        return multiplication;
    }

    public static void afficherMatrice(double[][] multiplication){
        for(int i = 0; i < multiplication.length; i++){
            for(int j = 0; j < multiplication[i].length; j++) {
                System.out.println(multiplication[i][j]);
            }
        }
    }
}