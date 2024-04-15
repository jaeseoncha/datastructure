package com.jaeseon.datastructure.chapter3;

import java.util.Scanner;

public class ex3_4 {

    // 이진 검색심화버전
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

        int centerIndex = makeBinSearchX( a , searchNum);

        int realIndex = makeBinSearchX_check( a , searchNum, centerIndex);

        System.out.println(" 일치하는 가장빠른 인덱스는 " +realIndex);


    }

    public static int makeBinSearchX_check( int [] a, int searchNum, int centerIndex){
        int [] newArray = new int [centerIndex+1];

        int x = 0;

        for( int i =0; i< newArray.length; i++){

            newArray[i] = a[i];

        }

        int startIndexCheck = 0;
        int endIndexCheck =newArray.length-1;

        int resultIndex = 0;

        while( startIndexCheck<= endIndexCheck){

            int centerIndexCheck = (startIndexCheck +endIndexCheck) / 2;

            // 같을경우 <-왼쪽으로, 최종적으로 무조건 여기가 마지막에탐
            if( newArray[centerIndexCheck] == searchNum ){

                endIndexCheck = centerIndexCheck- 1;
                // 같으면 계쏙 마지막 결과값에 인덱스를 넣어줌.
                resultIndex = centerIndexCheck;

            }
            // 배열안의 값이더작을경우
            else if( newArray[centerIndexCheck]< searchNum ){
                startIndexCheck = centerIndexCheck+1;
            }
            // 배열안의 값이 더 큰경우는 없음
        }



        return resultIndex;
    }
    public static int makeBinSearchX( int [] a, int searchNum){

//        7

        int startIndex = 0;
        int endIndex = a.length-1;


        while( startIndex <= endIndex){

            int centerIndex = (startIndex+endIndex) / 2;

            if( a[ centerIndex] == searchNum){

                return centerIndex;

            }
            else if ( a[centerIndex] > searchNum){

                endIndex  = centerIndex - 1;

            }
            else if ( a[centerIndex] < searchNum){

                startIndex = centerIndex + 1;

            }
        }


        return -1;

    }
}
