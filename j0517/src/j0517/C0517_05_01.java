package j0517;

import java.util.Scanner;

public class C0517_05_01 {
    // 3개의 숫자를 입력받아, 평균을 출력하세요
    // average() 함수
    public static void main(String[] args) {
        C0517_05_01 c1 = new C0517_05_01();
        int[] num = new int[3];
        int num1 = 0, num2 = 0, num3 = 0;

        Scanner scan = new Scanner(System.in);

        // 값 여러번 출력
        for (int i = 0; i < num.length; i++) {
            System.out.println((i + 1) + "번째 값을 입력하세요");
            num[i] = scan.nextInt();
        }

        double result = c1.average(num[0], num[1], num[2]);
        System.out.println(result + "입니다.");
    }

    double average(int num1, int num2, int num3) {
        double result = (num1 + num2 + num3) / 3.0;
        return result;
    }

}
