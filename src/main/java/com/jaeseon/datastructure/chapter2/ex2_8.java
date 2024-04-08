package com.jaeseon.datastructure.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 소수 구하기 (1이나 자기자신 제외하고 나누어떨어지지않는수)
public class ex2_8 {

    public static void main(String[] args) {
        sosu();
    }
    public static void sosu(){

        List<Integer> sosulist = new ArrayList<Integer>();

        for( int i =2; i<= 10; i++){

            int j;
            for ( j =2; j<i; j++ ){


                // 한번이라도 나눠지면 저장하지않고 반복문에서 나옴
                 if( i %j ==0 ){
                     break;
                 }

            }

            if(i == j ){
                sosulist.add(i);
            }

        }

        sosulist.forEach(System.out::println);
    }
}
