package com.jaeseon.datastructure.superTest;

public class PointTest {
    public static void main(String[] args) {

        Point3D point3D = new Point3D();
        System.out.println("point3D.x = " + point3D.x);
        System.out.println("point3D.y = " + point3D.y);
        System.out.println("point3D.z = " + point3D.z);

    }


}

class Point {
    int x = 10;
    int y = 20;

    Point(int x, int y) {
        System.out.println("매개변수 2개 생성자");
        this.x = x;
        this.y = y;
    }
    Point(int x) {
        System.out.println("매개변수 1개 생성자");

        this.x = x;
    }
    Point(){
        System.out.println("매개변수 0개 기본생성자");

    }
}

class Point3D extends Point{

    int z = 30;

    Point3D(){
        this( 100,200,300);
    }

    /**
     * 기본 생성자(매개변수가 없는 생성자):
     *
     * 만약 부모 클래스에 기본 생성자가 있다면, 자식 클래스에서 명시적으로 부모 생성자를 호출하지 않더라도 컴파일러가 자동으로 super()를 추가해 부모의 기본 생성자를 호출합니다.
     * 부모 클래스에 기본 생성자가 없을 경우, 자식 클래스에서 반드시 명시적으로 부모 생성자를 호출해야 합니다.
     * @param x
     * @param y
     * @param z
     */
    Point3D(int x, int y , int z ) {
        this.z = z;

    }

}