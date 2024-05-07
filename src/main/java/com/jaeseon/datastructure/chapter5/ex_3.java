package com.jaeseon.datastructure.chapter5;

import java.util.Scanner;

/**
 * 재귀 상향식,햐향식 분석
 */
public class ex_3 {

    public static void recur( int n ){

        if( n > 0){

            recur (n-1);

            System.out.println(n);

            recur(n-2);
        }


    }

    // 1 ,(), 2, () 3, 1, 4,2,1

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x =scanner.nextInt();

        recur(x);
    }
}
