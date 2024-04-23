package com.jaeseon.datastructure.chapter4;

public class searchQue {


    public static void main(String[] args) {


        intQueue queue= new intQueue(10);
        queue.enque(3);

        queue.enque(5);
        queue.enque(6);
        queue.enque(7);
        queue.enque(8);
        queue.enque(9);
        queue.enque(10);
        queue.enque(11);
        queue.enque(12);

        System.out.println( "1번째 ");
        queue.dump();

        queue.deque();

        System.out.println( "2번째 ");
        queue.dump();






    }
}
