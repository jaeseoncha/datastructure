package com.jaeseon.datastructure.chapter7;

import java.util.Scanner;

public class indexOfTester {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 텍스트용
        String s1 = scanner.next();

        // 패턴용
        String s2 = scanner.next();

        int idx1 = s1.indexOf(s2);
        int idx2 = s1.lastIndexOf(s2);

        if ( idx1 == -1){

            System.out.println("패턴이 없습니다.");
        }
        else {

            int len1 = 0;
            for ( int i =0; i < idx1; i++ ){

                len1 += s1.substring( i, i+1).getBytes().length;
            }

            len1 += s2.length();

            int len2 = 0;
            for ( int i = 0; i < idx2; i++ ){

                len2 += s1.substring( i, i+1).getBytes().length;
            }

            len2 += s2.length();

            System.out.println("텍스트" + s1);



        }

    }


}
