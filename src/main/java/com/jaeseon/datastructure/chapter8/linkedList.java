package com.jaeseon.datastructure.chapter8;

import java.util.Comparator;
import java.util.LinkedList;

public class linkedList<E> {

    public linkedList(){
        this.head = this.crnt = null;
    }
    class Node<E>{

        // 데이터
        private E data;

        // 다음 노드를 참조
        private Node<E> next;

        // 생성자
        Node(E _data, Node<E> _next){
            this.data = _data;
            this.next = _next;
        }

    }

    private Node<E> head; // 머리 포인터
    private Node<E> crnt; // 선택 포인터

    public E search(E obj, Comparator<? super E > c){

        Node<E> ptr = this.head;

        while( ptr != null){

            if( c.compare( obj, ptr.data ) == 0){

                this.crnt = ptr;
                return ptr.data;
            }

            ptr = ptr.next;
        }
        return null;
    }

    // 맨앞에 삽입
    public void addFirst(E obj){

        // 당시의 헤드를 ptr 에 삽입
        Node<E> ptr = this.head;
        // obj 는 데이터에 넣고, 헤드값을 node 에 넣어서 다음값이 이전의 헤드를 바라볼수있도록 처리
        this.head = this.crnt = new Node( obj , ptr);

    }

    public void addLast( E obj){

        // 헤드가 null 이면 값이 하나도 없기에 addFirst처리
        if( this.head == null){
            this.addFirst(obj);
        }
        else {

            Node<E> ptr = this.head;
            while( ptr != null){

                ptr = ptr.next;

            }
            // 과거 맨마지막 노드는 비어있었으나, 뒤에 새로운값이 생기기에 맨마지막노드에 뒤에값을 넣어줌
            ptr.next = this.crnt = new Node<E>( obj , null);

        }

    }

    public void removeFirst(){

        // 헤드가 비었다면 값이없는것이기에 방어적처리
        if ( this.head != null){
            // 현재 헤드랑, 현재 위치값을 , 현재헤드의 다음값으로 덮어씌우기
            this.head = this.crnt = this.head.next;
        }
    }

    public void removeLast () {

        // 헤드가 비었으면 값이 없기에 방어적처리
        if( this.head !=null){

            // 헤드가 있는데 다음값이 null 이라면 , 헤드와 꼬리 가 같은값인 즉 리스트안에 값이 하나기에
            if( this.head.next == null ){
                this.removeFirst();
            }
            // 두개이상일때
            else{

                Node<E> currentPointer = this.head;
                Node<E> prevCurrentPointer = null;

                while ( currentPointer.next != null){
                    // 하나 앞의 값은 현재의 포인터값
                    prevCurrentPointer = currentPointer;
                    // 현재포인터값은 현재포인터의 다음값
                    currentPointer = currentPointer.next;
                }

                prevCurrentPointer.next = null;

                crnt = prevCurrentPointer;

            }
        }
    }
    public void remove(Node p ){

        if( this.head != null ){
            // 선택한 노드가 head 일시 ( 리스트 내부에 노드 하나밖에없다는 뜻)
            if ( p == head ){

                this.removeFirst();
            }
        }
        // 리스트 내부에 노드가 하나 이상일 경우
        else {

            // ptr 은 p 노드 앞의 값.
            Node<E> ptr = head;

            while(ptr.next != p){


                ptr = ptr.next;
                // p가
                if( ptr == null ){

                    return;
                }

            }
            // ptr 의 다음값을   p 가 가지고있는 다음값으로  삽입 / p 와 연결된 연결값을 모두 끊어버리기에 p는 아무도 참조하지않는 노드가됨..
            ptr.next = p.next;
            crnt = ptr;

        }

    }

    public void removeCurrentNode(){

        remove(crnt);
    }

    public void clear(){

        // 헤드가 null 일때까지 헤드값을 삭제
        while( head != null ){

            this.removeFirst();
        }
        crnt = null;


    }

    public boolean next(){

        if(crnt == null || crnt.next == null){
            return false;
        }

        crnt = crnt.next;
        return true;
    }

    public void printCurrentNode (){

        if( crnt == null ){
            System.out.println(" 선택한 노드가 없다");

        }
        else{
            System.out.println(crnt.data);
        }

    }

    public void dump(){

        Node<E> ptr = head;

        while( ptr != null ){

            System.out.println(ptr.data);
            ptr = ptr.next;

        }
    }


}
