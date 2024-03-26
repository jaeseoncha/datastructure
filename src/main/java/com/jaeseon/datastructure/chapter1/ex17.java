package com.jaeseon.datastructure.chapter1;

public class ex17 {

    public static void main(String[] args) {

        makeTriangle(5);
    }

    /**
     *  왼쪽각이 직각인 직각삼각형만들기
     */
    public static void makeTriangle( int n ){


        for( int i = 0 ; i < n; i++){
            String line = "";

            if( i != 0 ){
                System.out.println("\n");
            }


            for (int j =0; j <= i; j++){
                line = line + "*";
            }
            System.out.println(line);

        }


    }
    public static void makeTriangle2(int n) {
        StringBuilder lineBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                lineBuilder.append("*");
            }
            System.out.println(lineBuilder);
            lineBuilder.setLength(0);
        }
    }


}
