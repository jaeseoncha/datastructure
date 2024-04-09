package com.jaeseon.datastructure.chapter3;

import java.util.Scanner;

public class q3_3 {

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


        // 맨위 컬럼
        for ( int i =0; i<a.length +1; i++ ){

            if( i==0 ){
                System.out.print(" |");

            }
            else  {
                System.out.print(i-1);

                if( i == a.length){
                    System.out.println("");
                }
            }

        }

        // 행
        for( int i = 0; i < a.length * 2 ; i++) {

            // 짝수행 * 표시
            if ( 0 == i % 2 ) {
                // 열 표시
                for ( int k = 0; k < a.length + 1; k++ ) {
                    // 맨앞에 열
                    if( k==0 ){
                        System.out.print(" |");
                    }
                    // 별찍기 <- k==1 부터시작, 처음에는 찍히고 다음칸부터는 두번재로
                    else if ( i / 2 == k-1 ) {
                        System.out.print("*");
                    }
                    else{

                        System.out.print(space);

                    }
                    if( k==a.length){
                        System.out.println("");
                    }

                }

            }

            // 홀수행 컬럼
            else {

                // 열 표시
                for ( int k = 0; k < a.length + 1; k++ ) {
                    // 맨앞에 열
                    if( k==0 ){

                    System.out.print(i/2+"|");
                    }
                    else{

                        System.out.print(a[k-1]);

                    }
                    if( k==a.length){
                        System.out.println("");
                    }

                }

            }


        }
    }
}
