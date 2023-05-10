package j0510;

import java.util.Scanner;

public class C0510_07 {

	public static void main(String[] args) {

//		문제 2번
//		숫자를 입력 받아 같은 값일 경우 정답 그렇지 않으면 오답 출력하시오.
		int random = (int) (Math.random() * 3) + 1; // 1,2,3
		int input = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("값 입력하시오");
		input = scan.nextInt();

		if (random == input) {
			System.out.println("당첨");
			System.out.println("입력 번호 : " + input);
			System.out.println("당첨 번호 : " + random);
		} else if (random != input) {
			System.out.println("꽝");
			System.out.println("입력 번호 : " + input);
			System.out.println("당첨 번호 : " + random);
		}

		else {
			System.out.println("숫자를 입력하세요");
		}

	}
}

////	실습1
//		// 랜덤숫자
//		double random = 0;
////	random = Math.random(); // 0.0~0.9999999..까지 출력
////	random = (int)(Math.random()*10); // 0~9까지 출력 (int 정수형이기 때문에)
//		random = (int) (Math.random() * 3) + 1; // 1~3까지 출력 (int 정수형이기 때문에)
//		System.out.println(random);

//		문제 1. 1~10까지 출력
//double random = 0;
//random = (int)(Math.random()*10+1);
//System.out.println(random);
//		System.out.println((int)(Math.random()*10+1));