package com.jaeseon.datastructure.chapter6;

public class HeapSort {

    static void swap( int[]a , int idx1, int idx2){

        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void downHeap( int [] a, int left , int right){

        int temp =a[left]; // 루트
        int child; // 큰값을 갖는 자식
        int parent; // 부모

        for( parent = left; parent < (right +1 ) /2; parent = child ){

            // 왼쪽자식
            int childLeft = parent * 2 +1;
            // 오른쪽자식
            int childRight = childLeft+1;
            // 둘중에 큰자식
            child  = (a[childRight] > a[childLeft]) ? childRight : childLeft;

            // 루트가 가장큰 자식보다 크면  반복문 종료
            if( temp > a[child]){
                break;
            }
            // 부모에 큰자식값을 대입.
            a[parent] = a[child];

        };
        a[parent] = temp;


    }

    static void heapSort(int [] a , int n){
        // 제일처음에 가장큰값을 루트로 올리기위하여 정렬되지않은 배열을 힙상태로 만듦
        for ( int i = (n-1)/2; i>=0; i--) {
            downHeap( a , i , n-1);
        }

        // 힙상태이기때문에, 현재 루트값은 가장큰값이므로, 가장큰값과 맨끝값을 스왑 후 , 다시 힙정렬상태로 만들고, 다시 스왑 을 반복
        for ( int i = n-1; i> 0; i--){

            swap( a, 0,i);
            downHeap(a , 0 , n-1);
        }
    }

    public static void main(String[] args) {

        int [] a = new int[]{ 1,3,9,4,7,8,6};


        heapSort( a , a.length);

    }


}
