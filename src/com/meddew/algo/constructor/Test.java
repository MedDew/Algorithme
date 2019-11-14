package com.meddew.algo.constructor;

public class Test {
    public static void main(String args[]){
        TestConstructorPrivate testConstructorPrivate = TestConstructorPrivate.getInstance();
        TestConstructorPrivate testConstructorPrivate1 = TestConstructorPrivate.getInstance();
        System.out.println("HASH :"+testConstructorPrivate);
        System.out.println("HASH :"+testConstructorPrivate1);

        int n = 17;
        int r = n/2;
        System.out.println(r);
        System.out.println(1%2);
        System.out.println(1/2);

        int reste;
        boolean flag = true;
        int nbr = 4;

        for(int i=2; i <= nbr/2; i++)
        {
            //nombre est divisible par lui-meme
            reste = nbr%i;
            System.out.println("reste : "+reste);

            //si le reste est 0, alors arrete la boucle. Sinon continuer la boucle
            if(reste == 0)
            {
                flag = false;
                break;
            }
        }
        //si flag est true, alors nombre est premier, sinon non premier
        if(flag)
            System.out.println(nbr + " est un nombre premier");
        else
            System.out.println(nbr + " n'est pas un nombre premier");
    }
}
