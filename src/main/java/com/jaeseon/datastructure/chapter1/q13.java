package com.jaeseon.datastructure.chapter1;

public class q13 {

    public static void main(String[] args) {

        createSquare( 5);
    }

    public static void createSquare( int n ){

        for( int i = 0; i < n; i++ ) {
            // 첫번째 행 빼고 줄바꿈처리
            if( i != 0 ){
                System.out.println("\n");
            }

            String line = "";

            for ( int j=0; j < n; j++) {

                line = line + "*";
                // n 만큼 라인을 생성하고 화면에 찍고 초기화;
                if( line.length() == n ){

                    System.out.println( line );
                    line = "";
                }

            }
        }

    }
}
