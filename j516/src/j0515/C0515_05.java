//1차원 배열, 2차원 배열 출력
//출력값
//	 0 1 2 3
//-------------
//0| 0 0 0 1  
//1| 0 0 0 0
//2| 0 0 0 1
//3| 1 0 0 0
//4| 0 0 1 0



package j0515;

import java.util.Scanner;

public class C0515_05 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		// 5,4배열 1~20까지 출력하시오.
		int temp = 0;
		int random = 0;
		int[][] box = new int[5][4];
		int[] num = new int[20];

		for (int i = 0; i < 20; i++) {
			if (i < 16) {
				num[i] = 0;
			} else {
				num[i] = 1;
			}
		}

		// 1차원배열을 섞기
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 20);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}

		// 1차원배열 값을 2차원 배열에 넣기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				box[i][j] = num[4 * i + j];
//				if (i != 4) {
//					box[i][j] = 0;
//				} else {
//					box[i][j] = 1;
//				}
			}
		}

		// 상단번호 출력
		System.out.print(" " + "\t");
		for (int i = 0; i < 4; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("---------------------");

		// box번호 출력
		for (int i = 0; i < 5; i++) {
			System.out.print(i+"|\t");
			for (int j = 0; j < 4; j++) {
				System.out.print(box[i][j] + "\t");
			}
			System.out.println();
		}

	}// main
}// class