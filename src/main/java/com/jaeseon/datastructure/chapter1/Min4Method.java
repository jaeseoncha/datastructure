package com.jaeseon.datastructure.chapter1;

public class Min4Method {

    public static void main(String[] args) {
    
      int result = min4(33,2,4444,55);
        System.out.println("result = " + result);
    }
    
    public static int min4(int a , int b , int c , int d){
        
        int min = a ;
        
        if( min > b){
         
            min = b;
        }
        else if ( min > c){
            min = c;
        }
        else if ( min > d ){
            min = d;
            
        }
        
        
        return min;
        
    }
    
}
