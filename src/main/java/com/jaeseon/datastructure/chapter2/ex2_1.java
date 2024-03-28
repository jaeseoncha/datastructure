package com.jaeseon.datastructure.chapter2;

public class ex2_1 {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[1] =5;
        a[2] = 51;
        a[4] = a[1]-2;

        for ( int i = 0 ; i< a.length ; i++){

            System.out.println( a[i]);
        }


        int[] b = {1,2,3,4,5,6,7};

        for ( int i = 0 ; i< b.length ; i++){

            System.out.println( b[i]);
        }

    }
}
