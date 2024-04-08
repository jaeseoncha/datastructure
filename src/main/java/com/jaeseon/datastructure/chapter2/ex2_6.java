package com.jaeseon.datastructure.chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class ex2_6 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("입력할 정수 :");
        // 정수
        int num1=scanner.nextInt();
        System.out.println("입력할 진수 :");
        // 진수
        int num2 = scanner.nextInt();
        make( num1,num2);


    }

    // 변환
    public static int make( int num1, int num2){

        int i =0;
        int [] array= new int [32];

        while( num1 != 0){

           int namuge  = num1 % num2;
           num1  =num1 / num2;

           array[i] = namuge;
            i ++;

        }

        // 정렬 거꾸로
        for ( int j = 0; j< i/2; j++){

            int temp =  array[j];
            array[j] = array[ i -j -1];
            array[i-j-1] = temp;
        }

        System.out.println(Arrays.toString(array));

        // 거꾸로하고 입력한값만큼만 나오게처리
        for( int k = 0; k< i; k++){

            System.out.printf(String.valueOf(array[k]));

        }



        return 0;
    }


}
