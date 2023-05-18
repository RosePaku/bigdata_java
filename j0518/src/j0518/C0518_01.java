package j0518;

import java.util.Scanner;

public class C0518_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		// 1부터 10까지의 합 for문을 활용해서
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		int sum1 = 0;
		// 1부터 100까지의 합 for문을 활용해서
		for (int i = 1; i <= 100; i++) {
			sum1 += i;
		}
		System.out.println(sum1);

		int sum2 = 0;
		// 1부터 1000까지의 합 for문을 활용해서
		for (int i = 1; i <= 1000; i++) {
			sum2 += i;
		}
		System.out.println(sum2);

		// 숫자를 입력받아 해당되는 팩토리얼 구현
		Scanner scan = new Scanner(System.in);
		int num = 1;
		System.out.println("값을 입력하세요");
		int fac = scan.nextInt();
		for (int i = fac; i > 0; i--) {
			num *= i;
			System.out.println("num :" + num);
		}
		System.out.println("결과값 : " + num);

	}

}
