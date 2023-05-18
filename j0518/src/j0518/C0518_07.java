package j0518;

import java.util.Scanner;

public class C0518_07 {

	public static void main(String[] args) {
		// 1~100까지 랜덤숫자 생성 숫자 맞추기
		// 횟수 10번
		// int[] random = new int[100]; // 계속 무작위
		int random1 = 0; // 랜덤 번호 고정
		int[] result = new int[10];

		Scanner scan = new Scanner(System.in);
		// for (int i = 0; i < random.length; i++) {
		// random[i] = (int) (Math.random() * 101);
		// }

		random1 = (int) (Math.random() * 101);

		for (int i = 0; i < result.length; i++) {
			System.out.println("숫자를 맞춰보세요>>입력");
			result[i] = scan.nextInt();
			if (result[i] == random1) {
				System.out.println("정답입니다. 종료합니다.");
				// System.out.println(result[i]);
				break;
			} else {
				System.out.println("땡. 다시 입력하세요");
				// System.out.println(random1);
				continue;
			}

			// 계속 무작위
			// if (result[i] == random[i]) {
			// System.out.println("정답");
			// System.out.println(result[i]);
			// } else {
			// System.out.println("땡");
			// System.out.println(random[i]);
			// }
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");

		}

	}
}