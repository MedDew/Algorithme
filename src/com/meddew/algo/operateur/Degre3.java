package com.meddew.algo.operateur;

import java.util.Scanner;

public class Degre3 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez a(int) :");
        int a = sc.nextInt();
        System.out.println("Entrez b(int) :");
        int b = sc.nextInt();
        System.out.println("Entrez c(int) :");
        int c = sc.nextInt();
        System.out.println("Entrez x(double) :");
        double x = sc.nextDouble();

        //double result = ((a+b)/2)*x + (a+b)*2*2 + a + b + c;
        double xx =  x *  x;
        double aux = a + b;
        //double result = ((double)(a+b))/2 * x * xx + (a+b) * (a+b) * xx + a+b +c;
        double result = aux/2 * x * xx + aux * aux * xx + aux +c;
        System.out.println("La valeur du polynome est : "+result);

    }
}
