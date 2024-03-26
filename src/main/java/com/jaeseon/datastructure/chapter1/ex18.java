package com.jaeseon.datastructure.chapter1;

public class ex18 {

    public static void main(String[] args) {

        makeTriangleV2(5);
    }

    /**
     * 오른쪽 위가 직각인 이등변삼각형.
     * @param n
     */
    public static void makeTriangleV2(int n ){

        for ( int i = 0; i< n;  i++){

            if( i != 0 ){
                System.out.println("\n");
            }

            String line = "";

            for ( int j =0 ; j+i < n  ;j++ ){
                line = line + "*";
        
            }

            System.out.println( line);

        }
    }
}
