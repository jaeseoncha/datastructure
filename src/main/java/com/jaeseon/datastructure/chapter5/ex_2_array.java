package com.jaeseon.datastructure.chapter5;

import java.util.Scanner;

/**
 * 유클리드 호재법
 *
 * 큰값을 작은값으로 나누었을때 나누어떨어지면 작은값이 최대공약수.
 * 나누어 떨어지지않으면, 작읍값과 나머지로 나누어 떨어질때까지 나눔;
 */
public class ex_2_array {

    // 20 / 15
    public static int gcd(int x, int y) {

        if (y == 0) {

            return x;
        }
        else {
                    // 1 .  15 , 5
                    // 2 .  5, 0
                    // 3.  리턴7

            return (gcd(y, x % y));
        }


    }

    /**
     * gcd 에 나온수랑, 그다음 배열의 수랑 계속 gcd 매서드 타게 비교.
     * @param a
     * @return
     */
    public static int make ( int [] a ){

        int x= a[0];
        for( int i =1; i< a.length ; i++){

            x = gcd(x , a[i]);
            // 1이나오는순간 나머지까지 계산해도 1이므로 break 하고 1 리턴
            if( x== 1){ break;}
        }

        return x;
    }

    /**
     * ex ) 10 100,150 , 250 , 4  => 2
     * 모든 배열안에있는 수의 최대공약수를 구하는것
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("배열의 수 : ");
        int arrayLength =scanner.nextInt();

        int [] a = new int[arrayLength];
        System.out.println( "지금부터" + arrayLength +"개 입력합니다.") ;
        for ( int i = 0 ; i< a.length; i++ ){

            a[i] = scanner.nextInt();;

        }



        int i = make( a );


        System.out.println("i = " + i);

    }

}
