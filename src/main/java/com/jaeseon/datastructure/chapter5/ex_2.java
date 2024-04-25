package com.jaeseon.datastructure.chapter5;

import java.util.Scanner;

/**
 * 유클리드 호재법
 *
 * 큰값을 작은값으로 나누었을때 나누어떨어지면 작은값이 최대공약수.
 * 나누어 떨어지지않으면, 작읍값과 나머지로 나누어 떨어질때까지 나눔;
 */
public class ex_2 {

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

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째수 : ");
        int x =scanner.nextInt();

        System.out.println("2번째수 : ");
        int y =scanner.nextInt();

        System.out.println("결과는" + gcd(x,y));


    }

}
