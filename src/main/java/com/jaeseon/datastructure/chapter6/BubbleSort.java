package com.jaeseon.datastructure.chapter6;

import java.util.Scanner;

public class BubbleSort {


//    5개 기준으로  4번돌고 ,
//    안에서는 처음에는 4번, 두번째는 3번 세번째는 2번, 네번째는 1번
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열의 수 : ");
        int arrayLength =scanner.nextInt();

        int [] a = new int[arrayLength];
        System.out.println( "지금부터" + arrayLength +"개 입력합니다.") ;
        for ( int i = 0 ; i< a.length; i++ ){

            a[i] = scanner.nextInt();;

        }

        System.out.println("test;55");

        make( a , a.length);

        for( int i =0; i< a.length; i++){

            System.out.println(a[i]);
        }

    }


    /**
     * a-1 번 반복돌고
     * @param a
     */
    public static void make( int[] a  , int length){

        // 크게도는 횟수
        for( int i =0; i< length-1; i++){

            // 교환하는 횟수
            for( int j = length-1; j>i; j-- ){
//                for (int j = i; j < length - 1; j++) {


                // 왼쪽 수가 더크면 교환
                // 5    <  4
                if( a[j] < a[j-1] ){
                    swap(a,j, j-1);
                }

            }
        }


    }

    /**
     * 5,4
     * @param a
     * @param index1
     * @param index2
     */
    public static void swap(int[] a, int index1, int index2){

        int x = a[index2];          //x 5
        a[index2] = a[index1];      // a[4] = 5
        a[index1] = x;

    }

}
