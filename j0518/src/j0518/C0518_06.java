package j0518;

import java.util.Scanner;

public class C0518_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국영수 입력받아 평균 90점 이상 A, 80 B, ... CDF
		// 97점 이상 A+, 93 A-, 87점이상 B+, 83 B-

		Scanner scan = new Scanner(System.in);
		String[] title = { "국어", "영어", "수학" };
		int[] score = new int[3];
		int total = 0;
		double avg = 0;

		for (int i = 0; i < title.length; i++) {
			System.out.println(title[i] + "성적 입력하세요");
			score[i] = scan.nextInt();
			total += score[i];
		}
		avg = total / 3.0;

		if (avg >= 90) {
			System.out.println("평균 성적 : " + avg);
			System.out.print("A");
			if (avg >= 97) {
				System.out.print("+");
			} else if (avg >= 93) {
				System.out.println("-");
			}
		} else if (avg >= 80) {
			System.out.println("평균 성적 : " + avg);
			System.out.print("B");
			if (avg >= 87) {
				System.out.print("+");
			} else if (avg >= 83) {
				System.out.println("-");
			}
		} else if (avg >= 70) {
			System.out.println("평균 성적 : " + avg);
			System.out.print("C");
			if (avg >= 77) {
				System.out.print("+");
			} else if (avg >= 73) {
				System.out.println("-");
			}
		} else {
			System.out.println("점수가 낮습니다." + avg);
		}

	}
}