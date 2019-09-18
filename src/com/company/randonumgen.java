package com.company;

public class randonumgen {

    public static void main(String[] args) {
        //System.out.println("Goodbye");
        //double x = Math.random();   //random number [0,1]
        double x = Math.random() * 10; //random int [0.10]
        int a = (int) (Math.random() * 10 + 10);  //random int [10,20]
        int b = (int) (Math.random() * 8 + 1);
        int c = (int) (Math.random() * 6);
        int d = (int) (Math.random() * 2);
        int e = (int) (Math.random() * 6 + 1) + (int) (Math.random() * 6 + 1);
        int f = (int) (Math.random() * 36 + 65);
        double g = (Math.random() * 9 + 1);
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
