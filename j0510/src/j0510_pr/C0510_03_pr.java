package j0510_pr;

import java.util.Iterator;
import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class C0510_03_pr {
//	1) 사용자로부터 입력받은 숫자가 3의 배수인지 판별하는 코드를 작성해보세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		input = scan.nextInt();
		if (input % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else if (input % 3 != 0) {
			System.out.println("3의 배수가 아닙니다.");
		} else {
			System.out.println("다시 입력하세요");
		}

	}
}