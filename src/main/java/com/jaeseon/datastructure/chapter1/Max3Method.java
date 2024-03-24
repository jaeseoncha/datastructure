package com.jaeseon.datastructure.chapter1;

public class Max3Method {

    public static void main(String[] args) {

       int result = max3(1,2,3);

        System.out.println("result = " + result);
    }

    public static int max3(int a, int b, int c){
        int max = a;
        if( max < b ){
            max = b;
        }
        else if ( max < c)  {
            max = c;
        }
        return max;

    }

}
