package com.jaeseon.datastructure.chapter6;

public class mergeSort_ex {

    public static void main(String[] args) {

        int[] a = {1, 3, 5, 9};
        int[] b = {2, 4, 6, 7,8};
        int[] c = new int[a.length + b.length];

        merge(a, b, c);

        // 정렬된 배열 c를 출력
        System.out.println("정렬된 배열 c:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        // 배열 a와 b를 병합하여 c에 저장
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // 배열 a에 남은 요소들을 c에 추가
        while (i < a.length) {
            c[k++] = a[i++];
        }

        // 배열 b에 남은 요소들을 c에 추가
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}
