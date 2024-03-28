package com.jaeseon.datastructure.chapter2;

import java.util.Scanner;

public class ex2_4 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("최대갑승ㄹ 구합니다");
        System.out.printf("사람수:");

        int num = scanner.nextInt();

        int [] height = new int [num];

        for( int i =0; i< num; i++){
            System.out.print(i);
            height[i] = scanner.nextInt();

        }
        System.out.println("maxof" );
        System.out.println(" = " + maxArray(height));
    }
    public static int maxArray( int []a){

        int max = 0;
        for( int i = 0; i < a.length; i++ ){

            if( a[i] >max){

                max = a[i];
            }

        }

        return max;

    }
}
