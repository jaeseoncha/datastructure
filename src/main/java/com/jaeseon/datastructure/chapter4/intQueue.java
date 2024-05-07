package com.jaeseon.datastructure.chapter4;

public class intQueue {
        private int[] que;
        // 큐의 용량
        private int capacity;
        // 맨 앞의 데이터 빠지는곳
        private int front;
        // 맨뒤의 데이터 들어오는곳
        private int rear;

        // 현재 데이터의 개수
        private int num;


        public class EmptyInstackExeception extends RuntimeException{
            public EmptyInstackExeception(){}

        }
        public class overInstackException extends RuntimeException{
            public overInstackException(){};
        }

        public intQueue(int maxlen){

            num = front = rear =0;
            this.capacity = maxlen;
            try{
                this.que = new int[capacity];

            }
            catch(OutOfMemoryError e ){
                this.capacity = 0;
            }

        }

        public int enque( int x ){
            if( num >= capacity){
                throw new overInstackException();
            }

            que[rear++]=x;
            num++;
            if( rear == capacity){

                rear =0;
            }
            return x;
        }

        public int deque ( ){
            if( num<=0 ){
                throw new  EmptyInstackExeception();
            }
            int x =que[front++];
            num --;
            if( front == capacity){

                front = 0;
            }

            return x ;

        }

    /**
     * front 데이터를 보기
     * @return
     */
    public int peek(){

            if( num <=0 ){
                throw new  EmptyInstackExeception();
            }

            return que[front];
        }


        public void clear(){

            num = front = rear =0;
        }

        public int indexOf(int x ){

            for ( int i =0; i<num; i++ ){

                int idx = (i + front) % capacity;

                if( que[idx] == x ){
                    return idx;
                }
            }

            return -1;

        }
    public void dump(){
        if( num <=0){
            System.out.println("q 비어있음");
        }
        else {
            for (int i = 0; i < num; i++) {

                System.out.println( que[ (i + front) % capacity] +     "입니다." );
            }
        }
    }
        public int searchRealIndex(){

            // 1.   num 만큼의 새로운 배열을 만든다.
            // 2. front 부터 차례대로 넣는다. rear까지 차례대로넣는다.
            // 3.  새로운 배열에서 검색을 한후, 해당 배열의 인덱스를 내보낸다.
            // 4. 리턴값에 1 을 더해준다 .


            return 0;

        }
    }

