package com.jaeseon.datastructure.chapter1;

public class sumWhile {

    public static void main(String[] args) {


        int iterNum = 1;
        int sum =0;

        while( iterNum <=5 ){
            sum  = sum + iterNum;
            iterNum = iterNum +1;
        }

        System.out.println("iterNum = " + iterNum);
        System.out.println("sum  = " + sum );
    }
}
