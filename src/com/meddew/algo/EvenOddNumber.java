package com.meddew.algo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        char response = ' ';
        do{
            Integer number = 0;
            System.out.print("Please enter a number :");
            while(!scanner.hasNextInt()){
                System.out.println("Please enter a number!!");
                System.out.print("Please enter a number :");
                scanner.next();
            }
            number = scanner.nextInt();


            System.out.println("You entered the number :"+number);
            EvenOddNumber evenOddNumber = new EvenOddNumber();
            System.out.println(evenOddNumber.getInformationAboutNumber(number));
            do{
                System.out.println("Do you want to continue Y/N ?");
                response = scanner.next().charAt(0);
            }while(!String.valueOf(response).equalsIgnoreCase("Y")  && !String.valueOf(response).equalsIgnoreCase("N"));

        }while(String.valueOf(response).equalsIgnoreCase("Y"));
    }

    public boolean isNumberPositiv(int n){
        if(n > 0){
            return true;
        }
        return false;
    }

    public boolean isNumber0(int n){
        if(n == 0){
            return true;
        }
        return false;
    }

    public boolean isNumberEven(int n){
        System.out.println("Result of n % 2 : "+n % 2);
        if(n % 2 == 0){
            return true;
        }
        return false;
    }

    public String getInformationAboutNumber(int n){
        String info = "";
        if(isNumberPositiv(n) && isNumberEven(n)){
            info = "The number is positiv and is even";
        }

        if(isNumberPositiv(n) && !isNumberEven(n)){
            info = "The number is positiv and is odd";
        }

        if((!isNumberPositiv(n) && !isNumber0(n)) && !isNumberEven(n) ){
            info = "The number is negativ and is odd";
        }

        if((!isNumberPositiv(n) && !isNumber0(n)) && isNumberEven(n) ){
            info = "The number is negativ and is even";
        }

        if(isNumber0(n)) {
            info = "The number is zero and is even";
        }
       return info;
    }

}
