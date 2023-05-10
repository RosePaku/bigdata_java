package j0510;

import java.util.Scanner;

public class C0510_06 {

	public static void main(String[] args) {

//		계산기 1번 문제
//		1. 변수선언 num1, num2, op 2. scan입력 3번 입력
//		3. 비교(switch) 4.결과값 출력 - 더하기 결과값 : 4

		int num1 = 0, num2 = 0, result = 0;
		char op = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 값 입력");
		num1 = scan.nextInt();
		System.out.println("부등호 입력");
		op = scan.next().charAt(0);
		System.out.println("두번째 값 입력");
		num2 = scan.nextInt();

		switch (op) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
//			System.out.println((num1 + "" + op + "" + num2 + "=") + (num1 / num2));
			break;
		default:
			System.out.println("다시 입력하세요");
			break;

		}
		System.out.println((num1 + "" + op + "" + num2 + "=") + result);
		
	}

}