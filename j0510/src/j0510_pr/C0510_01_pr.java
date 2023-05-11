// 1.사용자로부터 입력 받은 문자가 
//대문자인지 소문자인지 판별하는 프로그램을 작성하세요.
package j0510_pr;

import java.util.Scanner;

public class C0510_01_pr {
	public static void main(String[] args) {
		char input = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("알파벳 입력 예) a, A");
		input = scan.next().charAt(0);
		// input = Character.toUpperCase(input); // 입력받은 문자를 대문자로 변환
		if (input >= 'A' && input <= 'Z') {
			System.out.println("대문자입니다.");
		}

		else if (input >= 'a' && input <= 'z') {
			System.out.println("소문자입니다.");
		} else {
			System.out.println("다른 문자 또는 숫자입니다.");
		}

	}
}

//생각이 안난 부분
//1. if (input>='A' && input<='Z') : 범위 지정하는게 생각이 안났음