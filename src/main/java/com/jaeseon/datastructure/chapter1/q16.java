package com.jaeseon.datastructure.chapter1;

public class q16 {

    public static void main(String[] args) {

        npira(5);
    }

//    숫자형 피라미드
    public static void npira( int n ){

        for( int i = 0; i<n; i++){

            if( i!=0){
                System.out.println(" ");
            }

            for( int j=0; j< n- i -1 ;j++){
                System.out.printf(" " );
            }

            for( int k=0; k<(i*2) +1 ; k++ ){
                System.out.printf(String.valueOf( i +1));
            }


        }

    }
}
