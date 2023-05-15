// 5,5배열을 만드는데 1-25까지랜덤으로 섞어서 출력하시오
// 출력값
// 0 1 2 3 4
//----------------
// 0| random 숫자 (05개)
// 1| random 숫자 (5개)
// 2| random 숫자 (5개)
// 3| random 숫자 (5개)
// 4| random 숫자 (5개)
//----------------
// 1~25까지 번호를 입력하세요
// 좌표를 입력하면 X표시로 뜸
// 예) 01 입력시 box[0][1]에 숫자가 X로 표시
// X좌표를 입력하세요
// Y좌표를 입력하세요

//*좌표입력값
//			//좌표입력
//			System.out.println("좌표를 입력하세요.>>");
//			input = scan.next();   //42
//			
//			// x표시 넣기 - char를 int형 변환
//			int no1 = input.charAt(0)-'0'; //첫째자리 4 - a:97 A:65 0:48 '3'-'0'=3
//			int no2 = input.charAt(1)-'0'; //둘째자리 2
//			box[no1][no2] = "x";
// 출력값 04와 동일

package j0515_task;

import java.util.Scanner;

public class C05105_task_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] box = new String[5][5];
		int[] num = new int[25];
		int random = 0, temp = 0, input = 0;

		// 1~25 입력
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}

		// 섞기
		for (int i = 0; i < num.length; i++) {
			temp = num[0];
			random = (int) (Math.random() * 25);
			num[0] = num[random];
			num[random] = temp;
		}

		// 2차원 배열에 1차원 배열 넣기
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box.length; j++) {
				box[i][j] = "" + num[5 * i + j];
			}
		}

		while (true) {
			// 상단 출력
			System.out.print(" " + "\t");
			for (int i = 0; i < box.length; i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
			System.out.println("---------------------------------------------");

			// 화면출력
			for (int i = 0; i < box.length; i++) {
				System.out.print(i + "|\t");
				for (int j = 0; j < box.length; j++) {
					System.out.print(box[i][j] + "\t");
				}
				System.out.println();
			}

			// 1-25까지 번호 입력
			System.out.println("1~25까지 입력하세요");
			input = scan.nextInt();

			loop: for (int i = 0; i < box.length; i++) { // loop
				for (int j = 0; j < box.length; j++) {
					if (box[i][j].equals(input + "")) {
						box[i][j] = "X";
						break loop; // 전부 x일 경우 종료
					}
				}
			}

			// 좌표
			System.out.println("X좌표 입력 0~4까지");
			int no1 = scan.nextInt();
			System.out.println("y좌표 입력 0~4까지");
			int no2 = scan.nextInt();

			box[no1][no2] = "X";

		} // while
	}// main
}// class