package com.jaeseon.datastructure.chapter1;

public class sumEX8 {

    public static void main(String[] args) {

        sumof(3,7);
    }

    /**
     * 대소 상관없이 그사이에 있는 수 모두 합한값 구하기
     * @param a
     * @param b
     * @return
     */
    public static int sumof( int a , int b ){

        int big = 0;
        int small =0;

        if ( a- b > 0 ){
            big = a;
            small = b;
        }
        else {
            big = b;
            small =a;
        }


        int sum = 0;

        while( small <= big ){
            sum = sum + small;
            small++;
        }

        System.out.println("sum = " + sum);

        return sum;
    }
}
