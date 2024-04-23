package com.jaeseon.datastructure.chapter5;

import java.util.Scanner;

/**
 * 팩토리얼
 */
public class ex_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자입력하세요");
        int x =scanner.nextInt();

        int result =factorial(x);
        System.out.println("최종값은 :" + result );
    }

    public static int factorial( int x ){

        if( x > 0 ){
            return x * factorial(x-1);
        }
        else{
            return 1;
        }

    }


}
