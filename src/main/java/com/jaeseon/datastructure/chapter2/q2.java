package com.jaeseon.datastructure.chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class q2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("몇개 총");

        int num = scanner.nextInt();

        int[] tempArray = new int[num];
        for (int i =0 ; i< num ; i++ ){
            System.out.println(i + " : ");
            tempArray[i] = scanner.nextInt();
        }

//        for(int i =0;  i<tempArray.length; i++){
//
//            System.out.println("tempArray 변경전 = ");
//            System.out.println( i + " : " + tempArray[i] );
//        }

        test( tempArray);

//        for(int i =0;  i<tempArray.length; i++){
//
//            System.out.println("tempArray 변경후 = ");
//            System.out.println( i + " : " + tempArray[i] );
//        }

    }

    public static void swap ( int [] array , int startPlus , int endPlus ){

        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        System.out.println( "a[" + startPlus + "]과 "+"a[" + endPlus + "]를 교환합니다. ");
        int temp = array [startPlus];
        array[startPlus] = array[endPlus];
        array[endPlus] = temp;


    }

    public static  void test ( int[] array){

        for( int i =0;  i< array.length / 2; i ++ ){
            swap( array , i , array.length - i -1 );
        }
        System.out.println(Arrays.toString(array));
        System.out.println("역순정렬을 끝냅니다.");
    }

}
