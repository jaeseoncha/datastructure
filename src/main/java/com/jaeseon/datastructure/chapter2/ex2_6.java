package com.jaeseon.datastructure.chapter2;

import java.util.Scanner;

public class ex2_6 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("입력할 정수 :");
        // 정수
        int num1=scanner.nextInt();
        System.out.println("입력할 진수 :");
        // 진수
        int num2 = scanner.nextInt();
        make( num1,num2);


    }


    public static int make( int num1, int num2){

        int i =0;
        while( num1 == 0){
            i ++;
           num1  =num1 / num2;



        }
        int [] array= new int [i];


        return 0;
    }


}
