package com.meddew.algo.factorielle;

public class Factorielle {
    public static void main(String args[]){
        System.out.println("Factorielle de "+args[0]+"! = "+getFactorielle(Integer.parseInt(args[0])));
    }

    public static int getFactorielle(int n){
        int result = 1;
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
