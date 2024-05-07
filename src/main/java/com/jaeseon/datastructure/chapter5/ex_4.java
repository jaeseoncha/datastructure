package com.jaeseon.datastructure.chapter5;

import java.util.Scanner;

/**
 * 재귀 상향식,햐향식 분석
 */
public class ex_4 {

    /**
     * no 개의 원반을 x 번 기둥에서 y번 기둥으로 옮김
     * @param no
     * @param x
     * @param y
     */
    public static void move( int no, int x , int y ){

        if( no > 1 ){

            move( no-1 , x ,6-x-y);
        }
        System.out.printf( "원반 [%d] 를 [%d] 에서 [%d] 로 이동하였습니다.\n", no,x,y );

        if( no > 1 ){

            move( no -1 , 6-x-y,y);
        }


    }

    // 1 ,(), 2, () 3, 1, 4,2,1

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("원반몇개?");
        int x =scanner.nextInt();


        // 원반을 1에서 3으로 이동
        move( x , 1, 3 );
    }
}
