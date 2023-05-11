package j0510_pr;

import java.util.Iterator;
import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class C0510_02_pr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. if-else 조건문을 사용해 입력 받은 점수에 따라 A,B,C,D,F 등급을 출력하는 코드 작성
		int input = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하시오.");
		input = scan.nextInt();

		if (input >= 90) {
			System.out.println("A입니다.");
		} else if (input >= 80) {
			System.out.println("B입니다.");
		} else if (input >= 70) {
			System.out.println("C입니다.");
		} else if (input >= 60) {
			System.out.println("D입니다.");
		} else if (input < 60) {
			System.out.println("F입니다.");
		} else {
			System.out.println("다른 값입니다.");
		}

	}
}