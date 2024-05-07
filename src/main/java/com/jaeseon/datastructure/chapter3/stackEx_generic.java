package com.jaeseon.datastructure.chapter3;

public class stackEx_generic {

    public static void main(String[] args) {

       Instack instack= new Instack(64);
    }
    public static class Instack<T>{
        private T [] stk;
        private int capacity;
        private int ptr;

        public class EmptyInstackExeception {
            public EmptyInstackExeception(){}

        }
        public class overInstackException{
            public overInstackException(){};
        }


        public Instack(int maxlen){
            this.ptr = 0;
            this.capacity = maxlen;
            try{
                this.stk = (T[]) new Object[capacity];


            }
            catch(OutOfMemoryError e ){
                this.capacity = 0;
            }

        }

        public T push( T x ){
            if( this.ptr >= this.capacity){
                throw new RuntimeException();
            }
            return stk[ptr++] =x;
        }

        public T pop ( ){
            if( this.ptr <=0 ){
                throw new RuntimeException();
            }
            // ptr 도 감소
            return this.stk[--this.ptr];

        }

        public T peek(){

            if( this.ptr <=0 ){
                throw new  RuntimeException();
            }

            // ptr 원본값은 그대로
            return this.stk[this.ptr-1];
        }

        public boolean isFullStack(){

            return ptr == capacity;
        }


        public boolean isEmptyStack(){

            return ptr == 0;
        }

        public void clear(){

            ptr = 0;
        }

        public int indexOf(T x ){

            for ( int i = ptr -1; i>=0; i-- ){

                if( stk[i] == x ){
                    return i;
                }
            }

            return -1;

        }

        public int getCapacity(){
            return capacity;
        }
        public int size(){
            return ptr;
        }

        public void dump(){
            if( ptr <=0){
                System.out.println("스택이 비어있음");
            }
            else {
                for (int i = 0; i < stk.length; i++) {
                    System.out.println( i + " : " +stk[i] +"입니다." );
                }
            }
        }
    }
}
