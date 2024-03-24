package com.jaeseon.datastructure.chapter1;

public class Max4Method {
    public static void main(String[] args) {

        int result =max4(4,51,2,3);
        System.out.println("result = " + result);
    }

    public static int max4(int a,int b , int c , int d){

        int max = a;
        if( max < b ){
            max = b;
        }
        else if ( max < c){
            max =c;

        }
        else if ( max < d){
            max =d;
        }

        return max;

    }
}
