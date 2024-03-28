package com.jaeseon.datastructure.chapter2;

public class ex2_2 {

    public static void main(String[] args) {

        int result =maxArray();
        System.out.println("result = " + result);
    }

    public static int maxArray(){
        int[] a = {1,2,4,33,15,12,3,4};

        int max = 0;
        for( int i = 0; i < a.length; i++ ){

            if( a[i] >max){

                max = a[i];
            }

        }

        return max;

    }
}
