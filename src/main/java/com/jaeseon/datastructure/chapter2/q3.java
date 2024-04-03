package com.jaeseon.datastructure.chapter2;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        int[] array = new int[num];
        
        for( int a=0; a< array.length; a++){
            array[a] = scanner.nextInt();
        }
        
        int result = sumOfArray( array);

        System.out.println("result = " + result);
        
    }
    
    public static int sumOfArray( int[] a){
        int result =0;
        
        for( int i=0; i<a.length; i++){
            
            result += a[i];
        }
        

        return result;
    }    
}
