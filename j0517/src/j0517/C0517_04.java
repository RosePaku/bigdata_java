package j0517;

import java.util.Scanner;

public class C0517_04 {
    // 3개의 숫자를 입력받아 가장 큰 수를 출력하시오.
    // 인스턴스 메소드 numMax() 활용
    public static void main(String[] args) {
        C0517_04 c1 = new C0517_04();
        int[] num = new int[3];
        int num1 = 0, num2 = 0, num3 = 0;
        Scanner scan = new Scanner(System.in);

        // 값 여러번 출력
        for (int i = 0; i < num.length; i++) {
            System.out.println((i + 1) + "번째 값을 입력하세요");
            num[i] = scan.nextInt();
        }

        int result = c1.numMax(num[0], num[1], num[2]);
        System.out.println("가장 큰 수 : " + result);
    }

    int numMax(int num1, int num2, int num3) {
        if (num1 > num2 || num2 > num3) {
            int result = num1;
            return result;
        } else if (num1 < num2 || num2 < num3) {
            int result = num3;
            return result;
        } else {
            int result = num2;
            return result;
        }
    }

}
