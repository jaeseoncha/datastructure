package com.jaeseon.datastructure.chapter3;

import java.util.Scanner;

public class q3_2 {

    // 이진트리
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

        // 실행횟수.
        int x =0;

        int start = 0;
        int last = a.length-1;

        while( start <= last ){
            // ex   1,3,7, 9 ,11,13,15   // 검색 4


                int center = (start + last) /2;

                //  같으면 성공
                if( a[center] == searchNum){

                    return center;
                }
                // 검색이 더작은경우.
                else if ( a[center] > searchNum ){

                    last = center-1;
                }
                // 검색이 더 큰 경우
                else if (  a[center] <  searchNum){
                    start = center+1;
                }

        }

        return -1;

    }
}
