package com.jaeseon.datastructure.chapter3;


public class ex3_6 {

    private static int counter = 0;
    private int id;

    // 생성자

    public ex3_6() {
        id = counter++;
    }

    public int getInstanceCounter(){

        return counter;

    }
    public static int getCounter(){


        return counter;
    }

    public int getId() {
        return id;
    }

    public class idTester{

        public static void main( String[] args ) {
            ex3_6 a =new ex3_6();
            ex3_6 b =new ex3_6();

            System.out.println( a.getId());
            System.out.println( b.getId());

            System.out.println( "ex3_6.getCounter() = " + ex3_6.getCounter() );
        }
    }
}
