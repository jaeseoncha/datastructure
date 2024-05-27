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

        // 목표배열 ( n 숫자만큼)
        for ( int i = n-1; i>=0; i--){

            // 왼쪽은 칸 ( 이고 누적표의 숫자를 1감소시킴 ) , 오른쪽은 값
            b[f[ a[i] ]-1]= a[i];
            f[a[i]] = f[a[i]] - 1; // 사용된 인덱스를 감소

        }

        // 정렬된 결과를 원본 배열 a로 복사
        for (int i = 0; i < n; i++) {
            a[i] = b[i];
        }


    }
    public static void main(String[] args) {
        int[] a = {5, 7, 0, 2, 4, 10, 3, 1, 3};
        int n = a.length;
        int max = 10; // 배열 a에서의 최대값

        countingSort(a, n, max);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
