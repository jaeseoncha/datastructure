package com.jaeseon.datastructure.chapter2;

import java.util.Random;
import java.util.Scanner;

public class ex2_5 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("최대갑승ㄹ 구합니다");
        System.out.printf("사람수:");

        Random random = new Random();
        int num = scanner.nextInt();

        int [] height = new int [num];

        for( int i =0; i< num; i++){
            System.out.print(i);
            height[i] = 100+ random.nextInt(90);
            System.out.println(height[i]);

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
