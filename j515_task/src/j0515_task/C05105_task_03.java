//주졔 : 보물찾기 프로그램
//출력값
//1억 보물은 n개입니다. (기본값 1개)
//10억 보물은 n개입니다. (기본값 1개)
// 0  1  2   3  4
// -------------------
// ?  ?   ?  ?  (10개)
// 번호 입력하세요
// 번호 입력해서 맞추면 보물 또는 꽝이라고 뜸
// 1억보물, 10억보물 1개씩
// 입력창
// ~번째 번호를 입력하세요
// 결과창
// 로또번호,입력번호, 맞춘 번호, 맞춘 개수 출력

package j0515_task;

import java.util.Scanner;

public class C05105_task_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = 0, random = 0, temp = 0, count = 0;
		int[] box = { 0, 0, 0, 0, 0, 0, 0, 0, 1, 2 }; // 번호를 맞추기 위한 배열
		String[] arr = { "?", "?", "?", "?", "?", "?", "?", "?", "?", "?" }; // 출력을 위한 배열

		// box 번호 섞기
		for (int i = 0; i < arr.length; i++) {
			random = (int) (Math.random() * 10);
			temp = box[0];
			box[0] = box[random];
			box[random] = temp;

		}

		// 번호 입력창
		while (true) {
			System.out.println("[보물찾기 프로그램]");

			// 번호 출력
			for (int i = 0; i < arr.length; i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
			System.out.print("------------------------------------------------------------------");
			System.out.println();

			// box 출력
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}

			System.out.println();
			System.out.println("번호를 입력하세요");
			input = scan.nextInt();

			if (box[input] == 0) {
				arr[input]="꽝";
			} else if (box[input] == 1) {
				arr[input]="1억 보물";
			} else
				arr[input] ="10억 보물";

		} // while문

	}// main

}// class
