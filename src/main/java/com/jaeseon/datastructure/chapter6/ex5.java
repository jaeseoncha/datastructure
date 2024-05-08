package com.jaeseon.datastructure.chapter6;

import java.util.Scanner;

public class ex5 {


    /**
     * 단순 삽입 정렬
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [] a = new int[]{ 6,4,1,7,3,9,8};

        insertionSort( a );

        for( int i =0; i< a.length; i++){

            System.out.println(a[i]);
        }

    }

    /**
     * 이중포문
     * @param a
     */
    public static void insertionSortfor(int[] a) {
        for (int i = 1; i < a.length; i++) {

            int j;
            // 현재 수 1의 인덱스값
            int current = a[i];

            for (j = i - 1; j >= 0 && a[j] > current; j--) {
                // 0부터 1
                a[j + 1] = a[j];
            }

            a[j + 1] = current;
        }
    }

    /**
     * while 문
     * @param a
     */
    public static void insertionSort(int[] a) {

        for (int i = 1; i < a.length; i++) {
//            1일때
            int current = a[i];
        // 0일떄
            int j = i - 1;

            while (j >= 0 && a[j] > current) {
//                a[1] 에 a[0] 값들어감
                a[j + 1] = a[j];
                j--;
            }
            // a[0] 은 현재값.
            a[j + 1] = current;
        }
    }


}
