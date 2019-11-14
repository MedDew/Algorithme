//test
package com.meddew.algo.thread;


import static java.lang.Boolean.TRUE;

/*class Counter {
    public int count;

    public synchronized void increment(){
        count++;
    }

    public int methodX(int nbr) {
        if(nbr== 1) return 1;
        else return(methodX(nbr-1) + nbr);
    }
}

class Counter2 {
    public int count;

    public void increment(){
        count++;
    }
}

public  class Synchronization {
    static int i;
    static boolean check;

    static void doIt(int [] z){
        int temp = z[z.length-1];
        z[z.length-1] = z[0];
        z[0] = z[z.length-1];
    }
    public static void  main (String[] args) throws Exception{
        Counter c = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 1000; i++){
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i <= 1000; i++){
                    c.increment();
                }
            }
        });


        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter : "+c.count);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        ThreadRun1 threadRun1 = new ThreadRun1();
        Thread thread = new Thread(threadRun1);
        Thread thread2 = new Thread(threadRun1);
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();

        System.out.println("Counter 2: "+threadRun1.c.count);



            //int i = 3, j =0, r = 1;
            //r += i-- * --j;
            //System.out.println(r);
            short x = 3;
            switch(x){
                default:
                    System.out.println("Hey");
            }
//        int i;
//        do {
//            i++;
//        }
//        while(i < 0);
//        System.out.println(i);

        Synchronization synchronization = new Synchronization();
        System.out.println("Sum result with strictfp : "+synchronization.sum());
        System.out.println("Sum result without strictfp : "+synchronization.sum1());

        while (i < 0) {
            i--;
        }
        System.out.println("Synchronization.i : "+i);

        for(int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i < j){
                    System.out.println("i < j :  "+i+" < "+j);
                    assert i != j : i;
                }
            }
        }
        int v = 0;
        boolean t = true;
        boolean f = false, b;
        b = (t || ((v++) == 0));
        System.out.println(((v++) == 0)+" <=> "+b);
        System.out.println("v = "+v);
        b = (f || ((v+=2) > 0));
        System.out.println("b = "+b);
        System.out.println(v);

        int m,n,k,l=0;
        k = l++;
        System.out.println("k = "+k+" l = "+l);
        n = ++k;
        System.out.println("n = "+n);
        m = n++;
        System.out.println("m = "+m);
        System.out.println(m);

        int []arr[] = new int[5][5];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;
        arr[0][4] = 5;
        arr[1][0] = 6;
        arr[1][1] = 7;
        arr[1][2] = 8;
        arr[1][3] = 9;
        arr[1][4] = 10;
        arr[2][0] = 11;
        arr[2][1] = 12;
        arr[2][2] = 13;
        arr[2][3] = 14;
        arr[2][4] = 15;
        arr[3][0] = 16;
        arr[3][1] = 17;
        arr[3][2] = 18;
        arr[3][3] = 19;
        arr[3][4] = 20;
        arr[4][0] = 21;
        arr[4][1] = 22;
        arr[4][2] = 23;
        arr[4][3] = 24;
        arr[4][4] = 25;

        for(int i =0; i < arr.length; i++){
            System.out.println(" i "+i);
            for(int j =0; j < arr.length; j++){
                System.out.print("\t\t j "+j+" => "+arr[i][j]);
            }
            System.out.println();
        }

        int u,s,w;
        for (u = 0; u < 3; u++) {
            for(s=1; s < 4; s++) {
                for(w=2; w<5; w++) {
                    System.out.print(" u : "+u+" s : "+s+" w : "+w);
                    if((u == s) && (s==w))
                        System.out.println("u ===> "+u);
                }
                System.out.println();
            }
        }

        String hex = Integer.toHexString(3);
        System.out.println("La valeur en hexadécimal est = 0X" + hex);

//        int p;
//        if(check == true)
//            p=1;
//        else
//            p=2;
//        if(p=2) p=p+2;
//        else p = p + 4;
//        System.out.println(p);

        int e = 3;
        int g = ~e;
        System.out.println("e : "+e+" g : "+g);

        String varStr;
        int bname;
        varStr = "Boolean val.";
        bname = varStr.indexOf("Bool");
        System.out.println("bname : "+bname);

        int nbr = 0;
        int number2 = 12;
        while (nbr < number2)
        {
            nbr = nbr + 1;
            System.out.println("nbr : "+nbr);
        }
        System.out.println("nbr : "+nbr);

        Double test = 8.5;
        int o = 8;
        boolean bool = false;
        float q = 5.3F;
        double d = 5.3;
//        bool = (boolean) o;
//        q = d;
        d=o;
//        q = 3.8;

        System.out.println("Counter.methodx(100) : "+c.methodX(100));
        int alpha, beta;

        alpha = 10 >> 2;
        System.out.println("alpha : "+alpha);
        beta = alpha >>> 2;
        System.out.println("beta : "+beta);

        try
        {
            System.out.print ("A");
            int value = Integer.parseInt ("8A");
            System.out.print ("B");
        }
        catch (NumberFormatException exception)
        {
            System.out.print ("C");
            //return;
        }
        finally
        {
            System.out.print ("D");
        }
        System.out.print ("E");


        String ToTaL;

        String nom_prenom;

        //String 2emechoix;

        String valeur$;
        int aa = 7;
        int result = (int) (3 * aa / 2.0f);
        System.out.println ("\nResult : "+result);
        int a1 = 5;
        double a2 = (float) a1;

        int[] myArray = {1,2,3,4,5};

        doIt(myArray);
        Test6 test6 = new Test6();
        char car = 0x000A;
        System.out.println("CAR :"+car);
        for(int a : myArray){
            System.out.println("myArray[i] : "+a);
        }
        for(int i = 1; i < 3; i++) {
            for (int j = 3; j >= 1; j--) {
                System.out.println("i : "+i+" j : "+j);
                assert i != j : i;
            }
        }


    }

   public void methodX(int i)
    {
        System.out.println(i);

    }
    public int methodX(int i, int b)
    {
        System.out.println(i+1);
        return i+1;
    }


    public strictfp double sum()
    {
        double num1 = 10e+10;

        double num2 = 6e+08;

        return (num1+num2);

    }

    public final double sum1()
    {
        double num1 = 10e+10;

        double num2 = 6e+08;

        return (num1+num2);

    }

}

class ThreadRun1 implements Runnable{
    Counter2 c;

    public ThreadRun1() {
        c = new Counter2();
    }

    @Override
    public void run() {
        for(int i = 1; i <= 1000; i++){
            c.increment();
        }
    }
}

class Test6{
    public Test6(){
        //this( 4);
    }

    public Test6(byte b){
        System.out.println(b);
    }
}

interface DeclareStuff{
    public static final int EASY = 3;
    void doStuff(int t);
}

class TestDeclare implements DeclareStuff{
    @Override
    public void doStuff(int t) {
        t+=EASY + ++t;
        System.out.println("t "+t);
    }

    public static void main(String [] args){
        int x = 5;
        new TestDeclare().doStuff(++x);
    }
}*/

class Test1{
    private static String test;
    private String test2;
    static {
        System.out.println("Static");
        test = "YAWP";
    }

    {
        System.out.println("Instance");
        test2 = "BIEN";
    }
    static String[] ar = {"meow", "jgqd", "sdlj"};
    static String cat = "meow";



    public Test1() {
        System.out.println("Constructor");
    }
    public static void main(String [] args){
        System.out.println("main method 1");
        main("think");
        System.out.println(ar[0] == cat);
        String val1 = "abc";
        String val2 = "abc";
        System.out.println(val1.equals(val2));
        System.out.println(val1 == val2);
        System.out.println(val1.hashCode()+"=="+ val2.hashCode());
        System.out.println(System.identityHashCode(val1)+" <=> "+System.identityHashCode(val2));
        String wild = " Wild ";
        String irish = " Irish ";
        String rose = " Rose ";
        System.out.println(wild.trim()+" "+wild.length()+" "+wild.trim().length());
        try{
            return;
        }finally {
            System.out.println("Finally");
        }

    }

    public static void main(String args){
        System.out.println("Main method 2");
    }
}

interface A111{
    String s = "YAWP";
    void method1();
}
interface B{}
interface C extends A111, B{
    void method1();
    void method1(int x);
}