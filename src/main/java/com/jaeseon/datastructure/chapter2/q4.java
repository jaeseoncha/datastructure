package com.jaeseon.datastructure.chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] array = new int[num];

        for( int a=0; a < array.length; a++){

            array[a] = scanner.nextInt();
        }

        int [] result =copyArray( array);

        System.out.println("result = " + Arrays.toString(result));
    }

    public static int[] copyArray( int[] a){

        int[] b = new int[a.length];

        for( int c =0; c < a.length; c++){

            b[c] = a[c];
        }

        return b;
    }

}
