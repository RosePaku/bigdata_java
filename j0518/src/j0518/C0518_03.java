package j0518;

import java.util.Scanner;

public class C0518_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		System.out.println("1번째 숫자 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("2번째 숫자 입력하세요");
		int num2 = scan.nextInt();

		// 1)
		// for (int i = num1; i <= num2; i++) {
		// sum += i;
		// }

		// 2)
		int temp = 0;
		if (num1 > num2) {
			temp = num2; // num2 =1, num1= 2일 경우 temp=1
			num1 = num2; // num1 = 1
			num2 = temp; // num2 = 1
		}
		System.out.printf("%d부터 %d까지의 합", num1, num2);
		// System.out.println(sum);

	}

}

// int sum = 0;
// // 1부터 10까지의 합 for문을 활용해서
// for (int i = 1; i <= 10; i++) {
// sum += i;
// }
// System.out.println(sum);

// int sum1 = 0;
// // 1부터 100까지의 합 for문을 활용해서
// for (int i = 1; i <= 100; i++) {
// sum1 += i;
// }
// System.out.println(sum1);

// int sum2 = 0;
// // 1부터 1000까지의 합 for문을 활용해서
// for (int i = 1; i <= 1000; i++) {
// sum2 += i;
// }
// System.out.println(sum2);