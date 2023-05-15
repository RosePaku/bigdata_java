// 5,5배열을 만드는데 1-25까지 랜덤으로 섞어서 출력하시오
// 출력값
// 0 1 2 3 4
//----------------
// 0| random 숫자 (5개)
// 1| random 숫자 (5개)
// 2| random 숫자 (5개)
// 3| random 숫자 (5개)
// 4| random 숫자 (5개)
//----------------
// 좌표를 입력하면 X표시로 뜸
// 예 01 입력시 box[0][1]에 숫자가 X로 표시

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

public class C05105_task_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = ""; // 좌표입력
		int temp = 0, random = 0;
		String[][] box = new String[5][5];
		int[] num = new int[25];

		// 입력

		// 1~25까지 기본 입력
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}

		// 섞기 (1차원 배열)
		for (int i = 0; i < num.length; i++) {
			temp = num[0];
			random = (int) (Math.random() * 25);
			num[0] = num[random];
			num[random] = temp;
		}

		// box에 넣기 (1차원 배열을 2차원 배열에)
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box.length; j++) {
				box[i][j] = "" + num[5 * i + j];
			}
		}

		// 출력
		while (true) {
			System.out.print(" " + "\t");
			for (int i = 0; i < box.length; i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
			System.out.println("-----------------------------------------------");
			// 0~4줄 랜덤숫자 출력
			for (int i = 0; i < box.length; i++) {
				System.out.print(i + "|\t");
				for (int j = 0; j < box.length; j++) {
					System.out.print(box[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();

			// 좌표입력
			System.out.println("좌표를 입력하세요. 예) 01");
			input = scan.next();

			int no1 = input.charAt(0) - '0'; // ����자리 4 - a:97
			int no2 = input.charAt(1) - '0'; // ����자리 4 - a:97
			box[no1][no2] = "x";
		} // while
	}// main

}// class
