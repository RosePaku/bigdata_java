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

package j0515;

import java.util.Scanner;

public class C0515_07 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 1차원 배열에 숫자넣기 (1~25)
		// int[] num =
		// {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		// int[] num =
		// {13,24,9,21,5,19,7,23,4,10,25,16,7,14,15,12,3,18,2,20,17,22,8,11,1};

		// 5,5배열
		String[][] box = new String[5][5];
		int input = 0;

		// 1~25번 순차적으로 번호넣기
		int[] num = new int[25];
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}

		// 배열섞기
		int temp = 0, random = 0;
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * num.length);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}

		// 2차원 배열에 숫자 넣기
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box[i].length; j++) {
				box[i][j] = "" + num[5 * i + j]; // String타입 = ""+int;
			}
		}

		while (true) {
			// 상단번호 출력
			System.out.print(" " + "\t");
			for (int i = 0; i < 5; i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
			System.out.println("-----------------------------------------");

			// 화면출력
			for (int i = 0; i < box.length; i++) {
				System.out.print(i + "\t");
				for (int j = 0; j < box[i].length; j++) {
					System.out.print(box[i][j] + "\t");
				}
				System.out.println();
			}
			

			// 1~25까지 번호입력
			System.out.println("1~25까지 번호를 입력하세요");
			input = scan.nextInt();
			// 해당값을 찾기
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (box[i][j].equals(input + "")) {
						box[i][j] = "X";
						continue;
					}
				}
			}
			
			//두번 지워짐
			//좌표입력
			System.out.println("X좌표를 입력하세요. >>(0-4까지 번호)");
			int no1 = scan.nextInt();
			System.out.println("Y좌표를 입력하세요. >>(0-4까지 번호)");
			int no2 = scan.nextInt();
			
			box[no1][no2] = "X";
			
		} // while문

	}// main
}// class



// 왜 02를하면  1.2도 사라지는지
