package com.jaeseon.datastructure.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 소수 구하기 (1이나 자기자신 제외하고 나누어떨어지지않는수)
public class ex2_8_v2 {

    public static void main(String[] args) {
        int [] a =  {1,2,3,4,};
        Arrays.toString(a);
        sosu();
    }
    public static void sosu(){

        List<Integer> sosulist = new ArrayList<Integer>();

        for( int i =2; i<= 10; i++){

            int j;
            for ( j =2; j<i; j++ ){


                // 한번이라도 나눠지면 저장하지않고 반복문에서 나옴
                 if( i % j ==0 ){
                     break;
                 }

            }

            // break를 안탔다는것은 한번도 나눠떨어지지않았기때문에 여기까지도달 그러므로 소수
            if(i == j ){
                sosulist.add(i);
            }

        }

        sosulist.forEach(System.out::println);
    }
}
