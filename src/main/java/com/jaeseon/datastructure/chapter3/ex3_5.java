package com.jaeseon.datastructure.chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class ex3_5 {

    // 바이너리 서치
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

        make( a , searchNum);


    }

    public static void make( int [] a, int searchNum){

        int idx = Arrays.binarySearch( a,searchNum);
        
        if( idx<0){
            System.out.println("실패 " +idx);

            int x = -idx -1;

            System.out.println("삽입포인트" + x );
        }
        else{
            System.out.println("성공 " +idx);

        }
        
        
    }
}
