package j0511;

import java.util.Iterator;
import java.util.Scanner;

public class C0511_06 {

	public static void main(String[] args) {
//		숫자맞추기 프로그램
//		랜덤숫자를 만들어서 출력하세요
//		1부터 100까지의 있는 숫자 번호를 생성
		int input = 0, random = 0, count = 0;

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("[숫자맞추기 프로그램]");
			System.out.println("1. 랜덤숫자 생성");
			System.out.println("2. 숫자맞추기 게임");
			System.out.println("3. 종료");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력하세요");
			input = scan.nextInt();

			if (input == 3) {
				System.out.println("종료합니다.");
				break;
			}

			switch (input) {
			case 1:
				random = (int) (Math.random() * 100) + 1;
				System.out.println("랜덤숫자 : " + random);
				System.out.println("랜덤숫자가 생성 되었습니다!");
				break;

			case 2:
				while (true) {
					count++;
					if (count > 3) {
						System.out.println("3번 도전했습니다.");
						System.out.println("정답 : " + random);
						break;
					} // if문 마지막
					System.out.printf("숫자 1~100까지 입력하세요 (%d번째 도전) : ", count);
					input = scan.nextInt();

					if (input == random) {
						System.out.println("정답입니다.");
						break;
					} else if (input != random) {
						System.out.println("오답입니다.");

					} else {
						System.out.println("이상합니다.");

					} // else 마지막
					if (count == 3) {
						System.out.println("3번의 기회가 모두 소진되었습니다.");
						System.out.println("정답은 " + random + "입니다.");
						break;
						
					} // if문 마지막

				} // for문 마지막
				break;
			} // case while문
		} // while문 마지막
	}
}
