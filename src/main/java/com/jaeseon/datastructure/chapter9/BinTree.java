package com.jaeseon.datastructure.chapter9;

import java.util.Comparator;

public class BinTree <K,V>{

    static class Node<K,V>{
        private K key; // 키
        private V data; // 데이터
        private Node<K,V> left;
        private Node<K,V> right;



        public Node( K key, V data, Node<K,V> left , Node<K,V> right ) {

            this.key = key;
            this.data =data;
            this.left = left;
            this.right = right;

        }

        K getKey(){
            return this.key;
        }

        V getValue(){
          return this.data;
        }

        void print(){
            System.out.println(data);
        }

    }

    private Node<K,V> root;  // 루트
    private Comparator<? super K> comparator = null; // 키값의 대소관계를 비교하는  비교자

    public BinTree() {
        this.root = null;
    }

    public BinTree(Comparator<? super K> c) {
        this();
        this.comparator = c;
    }

    private int comp(K key1, K key2){

        return (comparator == null) ? ((Comparable<K>)key1).compareTo(key2) : comparator.compare(key1,key2);
    }

    private V search(K key){

        Node<K,V> p = root;

        while( true){

            // 루트가 존재하지않으면 리턴
            if(p == null){
                return null;
            }

            // 검색키와 루트 비교
            int cond = comp(key,p.getKey());

            // 검색키와 루트가 같다 => 루트가 검색값이라는뜻 루트값 리턴
            if(cond == 0){
                return p.getValue();
            }
            // 음수면 키값이 더작다는뜻이므로 왼쪽으로
            else if ( cond <0){

                p = p.left;
            }
            // 양수면 키값이 더크다는뜻이므로 오른쪽
            else {

                p = p.right;
            }

        }

    }
}
