package com.jaeseon.datastructure.chapter6;

import java.util.Scanner;

public class mergeSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[]a ={2,4,6,8,11,13};

        int [] b ={1,2,3,4,9,16,21};

        int [] c = new int [13];

        merge(a,a.length, b, b.length,c);

        for( int i =0; i<c.length; i++){

            System.out.println( "c : "+ i + ":" + c[i] );
        }

    }

    static void merge(int []a , int na , int[] b, int nb,int []c ){

        int pa=0;
        int pb=0;
        int pc=0;

        // 예를들어 a 배열의 마지막까이랑 b배열의 중간값이랑 비교했는데, b배열의 중간값이 더 큰것은 b배열 중간값뒤로는 다 a배열보다 크므로 ,
        // 여기서 비교를 멈추고, c배열에 나머지 b배열을 다 넣으면 됨.
        while( pa < na && pb < nb ){

            c[pc++] = a[pa] < b[pb] ? a[pa++ ] : b[pb++];


        }

        while( pa<na ){
            c[pc++] = a[pa++];

        }

        while ( pb<nb){
            c[pc++] = b[pb++];
        }

    }

}
