package com.jaeseon.datastructure.chapter1;

public class ex14 {

    public static void main(String[] args) {

        changeLine( 17,3);
    }

    /**
     *  n 개 출력하되 w개수마다 줄바굼
     *
     */
    public static void changeLine( int n , int w){



        for ( int i = 0; i < n; i++ ){

            if ( i % w == 0 && i!=0 ){

                System.out.println("한칸띄고");

            }

            System.out.println( "n" );

        }

    }

}
