package com.meddew.algo.parameter;

public class ConcatIncorrecte {
    public static void main(String[] args)
    {
        String s = "China Blue";
        System.out.println(s);
        s = concat(s, " Express");
        System.out.println(s);
        for(String v : args){
            System.out.println(v);
        }

    }


    public static String concat(String s, String s2)
    {
        s +=s2;
        //System.out.println(s);
        return s;
    }
}
