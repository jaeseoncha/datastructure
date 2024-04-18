package com.jaeseon.datastructure.chapter3;

public class stackEx {

    public static void main(String[] args) {

       Instack instack= new Instack(64);
    }
    public static class Instack{
        private int[] stk;
        private int capacity;
        private int ptr;

        public class EmptyInstackExeception extends RuntimeException{
            public EmptyInstackExeception(){}

        }
        public class overInstackException extends RuntimeException{
            public overInstackException(){};
        }

        public Instack(int maxlen){
            this.ptr = 0;
            this.capacity = maxlen;
            try{
                this.stk = new int[capacity];

            }
            catch(OutOfMemoryError e ){
                this.capacity = 0;
            }

        }

        public int push( int x ){
            if( this.ptr >= this.capacity){
                throw new overInstackException();
            }
            return stk[ptr++] =x;
        }

        public int pop (int x ){
            if( this.ptr <=0 ){
                throw new  EmptyInstackExeception();
            }
            // ptr 도 감소
            return this.stk[--this.ptr];

        }

        public int peek(){

            if( this.ptr <=0 ){
                throw new  EmptyInstackExeception();
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

        public int indexOf(int x ){

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
