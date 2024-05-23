package com.jaeseon.datastructure.chapter6;

public class CountingSort {


    static void countingSort( int a[] , int n , int max){

        int[]f = new int [max+1]; // 누적도수 <- 0도 있으므로 1추가해야함
        // 나중에 제출할표
        int[] b = new int[n];


        // 도수 분포표 만들기;
        // [5,7,0,2,4,10,3,1,3]
        for (int i = 0; i <n ; i++) {

            f[a[i]]= f[a[i]] + 1;
            // f[5] = f[5]=> 0 +1;
            // f[7]  = f[7] =>0 +1;

         }
        // 누적
        for ( int i = 1; i<= max; i++){

            f[i] += f[ i-1];
        }





    }
}
