package j0518;

import java.util.Scanner;

public class C0518_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자를 입력받아 해당 소문자로 변환하시오.
		Scanner scan = new Scanner(System.in);

		// 대문자 : A-65,66,Z-96 소문자 : a-97,98..
		System.out.println("소문자를 입력하면 대문자로 변환됩니다.");
		char ch = scan.next().charAt(0);

		// 대문자,소문자인지 비교
		if (ch <= 96) {
			ch = (char) (ch + 32);
		} else {
			ch = (char) (ch - 32);
		}
		System.out.println(ch);

	}
}
// System.out.println("문자를 입력하세요");
// char ch = scan.next().charAt(0);
// ch = (char) (ch - 32);
// System.out.println(ch);