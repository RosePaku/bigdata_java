package j0510_pr;

import java.util.Scanner;

public class C0510_04_pr {
//	1) 사용자로부터 입력받은 숫자가 3의 배수인지 판별하는 코드를 작성해보세요.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		year = scan.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else if (!((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
			System.out.println("윤년이 아닙니다.");
		}

		else {
			System.out.println("다시 입력하세요");
		}

	}
}