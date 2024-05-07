package com.jaeseon.datastructure.chapter6;

import java.util.Scanner;

public class BubbleSort_v3 {


//    5개 기준으로  4번돌고 ,
//    안에서는 처음에는 4번, 두번째는 3번 세번째는 2번, 네번째는 1번
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [] a = new int[]{ 1,3,9,4,7,8,6};


        make( a , a.length);

        for( int i =0; i< a.length; i++){

            System.out.println(a[i]);
        }

    }


    /**
     * @param a
     */
    public static void make( int[] a  , int n){

        int k = 0; // a[k] 안쪽의 수는 정렬을 끝마친상태

        // 최대 7번
        while ( k < n -1){
//             3 <  6
            int last = n-1; // 마지막 요소를 교환한 인덱스위치

            for ( int j = n-1; j > k; j--){

                if( a[j-1] > a[j] ){

                    swap(a,j-1,j);
                    last = j;
                }

                k = last;

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
