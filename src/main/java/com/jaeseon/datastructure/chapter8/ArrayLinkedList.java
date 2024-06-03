package com.jaeseon.datastructure.chapter8;

public class ArrayLinkedList <E>{

    class Node<E> {

        private E data; // ㄷㅔ이터
        private int next; // 리스트의 뒤쪽 포인터
        private int dnext; // 프리 리스트의 뒤쪽포인터
        void set (E data , int next) {

            this.data = data;
            this.next = next;
        }

    }

    private Node<E> [] n; // 리스트 본체
    private int size; // 리스트의 용량
    private int max; // 사용중인 꼬리

    private int head ; // 머리 노드
    private int crnt ; // 선택 노드
    private int deleted; // 프리 리스트의 머리노드
    private static final int NULL = -1;

    // 생성자
    public ArrayLinkedList(int capacity) {

        head = crnt = max = deleted = NULL;

        n = new Node[capacity];
        for( int i = 0 ; i < capacity; i++){

            n[i] = new Node<E>();

        }

        size = capacity;

    }

//    private int getInsertIndex(){
//
//        if( deleted == NULL) {
//
//        }
//    }
}
