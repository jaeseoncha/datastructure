package com.jaeseon.datastructure.chapter1;

public class MedianMethod {
    public static void main(String[] args) {

    }

    public static int med3( int a, int b , int c ){

        int result = 0;

        if( a >= b ){

            if( a > b ){

                if( b>=c){

                    if( b>c){

                        return b;
                    }
                    else {
                        return b;
                    }

                }
                else if( a>=c ){

                    if( a>c){
                        return c;
                    }
                    else{
                        return c;
                    }
                }
                else {
                    return a;
                }

            }
            else {

                if(b>=c){

                    if( b>c){
                        return b;
                    }
                    else{
                        return b;
                    }
                }
                else {
                    return a;
                }

            }
        }
        else {
            // a 가 b 보다 작음  a < b      a < c
             if (a >= c) {

                    //
                    if (a > c) {
                        return a;
                    }
                    else {
                        return a;
                    }

            }
             else{

                 if (b >= c) {

                     if (b > c) {
                         return c;
                     }
                     else  {
                         return c;
                     }

                 }
                 else {
                     return b;
                 }
             }
         }


    }
}
