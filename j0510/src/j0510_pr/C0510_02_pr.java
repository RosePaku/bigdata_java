package j0510_pr;

import java.util.Iterator;
import java.util.Scanner;

public class C0510_02_pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.사용자로부터 입력받은 숫자가 2의 배수인지 판별하는 코드를 작성해보세요.
		int input = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하시오");
		input = scan.nextInt();
		if (input % 2 == 0) {
			System.out.println("2의 배수입니다.");
		} else if (input % 2 == 1) {
			System.out.println("2의 배수가 아닙니다.");
		} else {
			System.out.println("숫자를 다시 입력하세요. ");
		}

	}

}
