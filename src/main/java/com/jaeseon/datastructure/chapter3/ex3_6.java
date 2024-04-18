package com.jaeseon.datastructure.chapter3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ex3_6 {




    // Comparator 인터페이스를 구현하는 클래스
    static class MyNumberComparator implements Comparator<Integer> {
        /**
         * compare(T o1, T o2): 두 개의 객체를 비교하여 정렬 순서를 결정합니다. 이 메서드는 두 객체를 매개변수로 받아서 비교하고, 비교 결과에 따라서 음수, 양수, 또는 0을 반환합니다.
         * 음수를 반환하면 o1이 o2보다 앞에 위치합니다.
         * 양수를 반환하면 o1이 o2보다 뒤에 위치합니다.
         * 0을 반환하면 두 객체가 같은 것으로 간주되며, 순서를 바꾸지 않습니다.
         * @param num1 the first object to be compared.
         * @param num2 the second object to be compared.
         * @return
         */
        @Override
        public int compare(Integer num1, Integer num2) {
            // num1이 num2보다 작으면 음수 반환
            if (num1 < num2) {
                return -1;
            }
            // num1이 num2와 같으면 0 반환
            else if (num1.equals(num2)) {
                return 0;
            }
            // num1이 num2보다 크면 양수 반환
            else {
                return 1;
            }
        }
    }

    // 음수면 첫번째가 앞 , 양수면 두번째가 앞으로
    public static class Main {
        /**
         * 2 5 10 7 3
         * 2 5 10 7 3
         * 2 5 7 10 3 
         *
         * @param args
         */
        public static void main(String[] args) {
            // 무작위 숫자 배열 생성
            Integer[] numbers = {5, 2, 10, 7, 3};

            // Comparator 객체 생성
            Comparator<Integer> comparator = new MyNumberComparator();

            // Comparator를 사용하여 배열 정렬
            Arrays.sort(numbers, comparator);

            // 정렬된 배열 출력
            for (Integer number : numbers) {
                System.out.println(number);
            }
        }
    }

}
