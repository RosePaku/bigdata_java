package j0517;

import java.util.Scanner;

public class C0517_07_01 {
    public static void main(String[] args) {

        // static 객체선언없이 사용
        int[] num = new int[2];

        int a = 10;
        int b = 5;

        calculate(num, a, b);

        System.out.println("합계 : " + num[0]);
        System.out.println("합계 : " + num[1]);

    }

    static void calculate(int[] num, int a, int b) { // static num[] 대신 void로(주소값)
        // 두수의 합, 평균

        num[0] = a + b;
        num[1] = (a + b) / 2;

        // return num;
        // 파이썬은 값을 2개 못 넣음
    }
}