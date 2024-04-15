package com.jaeseon.datastructure.chapter3;

import java.util.Scanner;

public class ex3_3 {

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

        make( a , searchNum);


    }
    static String space = "_";

    public static void make( int [] a, int searchNum){


        int answerCnt = 0;
        for( int i = 0; i< a.length; i++){

            if(a[i] == searchNum){
                answerCnt++;
            }
        }
        
        int[] newArray = new int[answerCnt];


        int newArrayIndex = 0;
        for( int i = 0; i< a.length; i++){
            if(a[i] == searchNum){

                newArray[newArrayIndex] = i;
                newArrayIndex++;
            }
        }


        for (int i = 0; i < newArray.length ; i++) {

            System.out.println("i = " + newArray[i]);
            
        }
        System.out.println("newArray.length = " + newArray.length);
    }
}
