//주졔 : 보물찾기 프로그램
//출력값
//보물은 n개입니다. (기본값 3개) // 0이 7개, 1이 3개
// 0  1  2   3  4
// -------------------
// ?  ?   ?  ?  (10개)
// 번호 입력하세요
// 번호 입력해서 맞추면 보물 또는 꽝이라고 뜸

package j0515_task;

import java.util.Scanner;

public class C05105_task_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int temp = 0, random = 0, input = 0;
		String[] arr = new String[10];
		int[] box = new int[10];

		// 값 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "?";
		}

		for (int j = 0; j < arr.length; j++) {
			if (j < 7) {
				box[j] = 0;
			} else {
				box[j] = 1;
			}

		} // for문 끝

		// 번호 섞기
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 10);
			temp = box[0];
			box[0] = box[random];
			box[random] = temp;
		}

		while (true) {
			// 화면 출력
			System.out.println("[보물찾기 프로그램]");

			// 번호
			for (int i = 0; i < box.length; i++) {
				System.out.print(i+"\t");
			}
			System.out.println();
			System.out.print("-----------------------------------------------------------------------");
			System.out.println();
			// 물음표
			for (int i = 0; i < box.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			System.out.println();

			System.out.println("번호를 입력하세요");
			input = scan.nextInt();
			// 보물 비교
			if (input == 1) {
				arr[input] = "보물";
			} else
				arr[input] = "꽝";

		} // while문

	}// main()

}// class
