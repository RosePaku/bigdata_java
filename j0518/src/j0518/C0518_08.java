package j0518;

import java.util.Scanner;

public class C0518_08 {
	static int input = 0;
	static int[] lotto = new int[45];
	static int[] myNum = new int[6];
	static int[] myLotto = new int[6];
	static int temp = 0, random = 0, count = 0;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 로또 맞추기
		// 1~45까지 숫자입력

		// 1~45까지 숫자를 lotto 넣기

		while (true) {
			System.out.println();
			System.out.println("[로또프로그램 생성]");
			System.out.println("1.로또번호 생성");
			System.out.println("2.로또번호 입력");
			System.out.println("3.로또번호 당첨 확인");
			System.out.println("0. 종료");
			System.out.println();
			System.out.println("번호를 입력하세요");
			input = scan.nextInt();

			switch (input) {

				case 1:
					creationlotto();
					System.out.println("로또번호가 생성되었습니다.");
					break;

				case 2:
					inputlotto();
					break;

				case 3:
					outputlotto();
					break;

				case 0:
					if (input == 0) {
						System.out.println("종료합니다.");
						break;
					}
					break;

			}// switch input

		} // while

	}// main

	// 1. 생성
	static void creationlotto() {

		// 1~45번까지 숫자 lotto 넣기
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}

		// 섞기
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}

	}

	// ２. 입력
	static void inputlotto() {
		// 입력
		for (int i = 0; i < myNum.length; i++) {
			System.out.println();
			System.out.println((i + 1) + "번째 값을 입력하세요");
			myNum[i] = scan.nextInt();
			System.out.print("현재까지 입력한 값 : ");
			for (int j = 0; j < myNum.length; j++) {
				System.out.print(myNum[j] + " ");
				// count++;
			}
		}
		// for (int i = 0; i < myNum.length; i++) {
		// }

		// 확인
		for (int i = 0; i < myNum.length; i++) {
			for (int j = 0; j < myNum.length; j++) {
				if (lotto[i] == myNum[j]) {
					myLotto[count] = lotto[i];
					count++;
					break;
				}
			}
		}
	}

	// 3. 당첨 확인
	static void outputlotto() {
		System.out.print("추첨번호 확인 : ");
		for (int i = 0; i < myNum.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();

		System.out.print("입력번호 확인 : ");
		for (int i = 0; i < myNum.length; i++) {
			System.out.print(myNum[i] + " ");
		}
		System.out.println();

		System.out.print("당첨번호 확인 : ");
		for (int i = 0; i < count; i++) {
			System.out.print(myLotto[i] + " ");
		}
		System.out.println();
		System.out.print("당첨횟수 확인 : " + count);

	}

}// class