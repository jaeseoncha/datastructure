package com.jaeseon.datastructure.chapter1;

public class q15 {
    public static void main(String[] args) {

        makeSpira(5);
    }


//    ( i -1 ) * 2 +1
    public static void makeSpira( int n){

        for ( int i = 0 ; i <n; i ++ ){

            if (i != 0){

                System.out.println("\n");

            }

            for( int j =0; j < n -1 ; j ++ ){
                System.out.println( " ");
            }

            for ( int k =0; k < (i *2) + 1 ; k++) {
                System.out.println( "*");

            }
        }


    }
}
