package com.jaeseon.datastructure.chapter6;

import java.util.Scanner;

public class cocktailSort_v4 {


    /**
     * 나중에 다시볼것
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [] a = new int[]{ 9,1,3,4,6,7,8};


        make( a , a.length);

        for( int i =0; i< a.length; i++){

            System.out.println(a[i]);
        }

    }


    /**
     * @param a
     */
    public static void make( int[] a  , int n){

        int left = 0;
        int right = n-1;
        int last = right;

        int totalComparatorCnt = 0;
        int totalExchangeCnt = 0;

        while ( left < right ){
            // 아래부터 정렬
            for( int j = right; j> left; j--){
                totalComparatorCnt++;

                if (a[j - 1] > a[j]){
                    totalExchangeCnt++;
                    swap(a, j - 1, j);
                    last = j;
                }
            }

            left = last;

            for( int j = left; j<right; j++){
                totalComparatorCnt++;

                if( a[j] > a[j+1]){
                    totalExchangeCnt++;

                    swap(a, j, j + 1);
                    last = j;

                }
            }
            right = last;

        }
        System.out.println( "totalComparatorCnt = " + totalComparatorCnt );
        System.out.println( "totalExchangeCnt = " + totalExchangeCnt );



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
