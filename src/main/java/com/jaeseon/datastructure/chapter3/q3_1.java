package com.jaeseon.datastructure.chapter3;

import java.util.Scanner;

public class q3_1 {

    // 선형 검색
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("배열의 수 : ");
        int arrayLength =scanner.nextInt();

        int [] a = new int[arrayLength];
        System.out.println( "지금부터" + arrayLength +"개 입력합니다.") ;
        for ( int i = 0 ; i< a.length; i++ ){

            a[i] = scanner.nextInt();;

        }

        System.out.println("검색할 숫자 : ");
        int searchNum =scanner.nextInt();

       int result= make( a , searchNum);

        System.out.println("result = " + result);

    }

    public static int  make( int [] a, int searchNum){

        int x =0;
        while( true ){

            if( x == a.length){

                return -1;
            }
            else if( a[x] == searchNum  ){

                return x;
            }

            x++;

        }


    }
}
