package j0522;

import java.util.Scanner;

public class C0522_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 숫자를 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();

		int data1 = num1 + num2;
		int data2 = num1 - num2;
		int data3 = num1 * num2;
		int data4 = num1 / num2;
		System.out.println("더하기 : " + data1);
		System.out.println("빼기 : " + data2);
		System.out.println("곱하기 : " + data3);
		System.out.println("나누기 : " + data4);

		System.out.println("1번째 숫자를 입력하세요.");
		int num3 = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요.");
		int num4 = scan.nextInt();

		int data5 = num3 + num4;
		int data6 = num1 - num2;
		int data7 = num1 * num2;
		int data8 = num1 / num2;
		System.out.println("더하기 : " + data5);
		System.out.println("빼기 : " + data6);
		System.out.println("곱하기 : " + data7);
		System.out.println("나누기 : " + data8);

	}

}
