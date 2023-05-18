package j0518;

import java.util.Scanner;

public class C0518_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국영수 입력받아 평균 60을 넘으면 합격, 불합격

		Scanner scan = new Scanner(System.in);
		String[] title = { "국어", "영어", "수학" };
		int[] num = new int[3];
		int total = 0;
		double avg = 0;

		for (int i = 0; i < title.length; i++) {
			System.out.println(title[i] + "성적을 입력하세요.");
			num[i] = scan.nextInt();
			total += num[i];
		}
		avg = total / 3.0;

		System.out.println();

		if (avg >= 60) {
			System.out.println("평균성적은" + avg + "입니다");
			System.out.println("합격");
		} else {
			System.out.println("평균성적은" + avg + "입니다");
			System.out.println("불합격");
		}

	}
}
// 1. 숫자를 입력 받아, 양수인지 음수인지 출력하시오. 0은 양수로 인정
// String num = scan.next();

// if (num <= 96) {
// num = (String) (num + 32);
// } else {
// num = (String) (num - 32);
// }
// System.out.println(num);