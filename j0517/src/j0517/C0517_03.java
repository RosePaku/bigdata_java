package j0517;

import java.util.Scanner;

public class C0517_03 {
    // 3개의 숫자를 입력받아 합계를 구하시오.
    // add 메소드를 사용하시오.
    public static void main(String[] args) {
        C0517_03 c = new C0517_03();
        Scanner scan = new Scanner(System.in);
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;

        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "번째 숫자를 입력하세요");
            num[i] = scan.nextInt();
        }

        // add, sub, multi, div
        int result1 = c.add(num[0], num[1], num[2]);
        int result2 = c.sub(num[0], num[1], num[2]);
        int result3 = c.multi(num[0], num[1], num[2]);
        int result4 = c.div(num[0], num[1], num[2]);
        System.out.println("두 수의 더하기 : " + result1);
        System.out.println("두 수의 빼기 : " + result2);
        System.out.println("두 수의 곱하기 : " + result3);
        System.out.println("두 수의 나누기 : " + result4);

    }

    // 기능 선언 // add, sub, multi, div
    int add(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }

    int sub(int num1, int num2, int num3) {
        int result = num1 - num2 - num3;
        return result;
    }

    int multi(int num1, int num2, int num3) {
        int result = num1 * num2 * num3;
        return result;
    }

    int div(int num1, int num2, int num3) {
        int result = num1 / num2 / num3;
        return result;
    }

}
