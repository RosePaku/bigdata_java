import java.util.Iterator;
import java.util.Scanner;

public class C0512_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 5명 이름 국영수합

		int A = 5; // 사람수
		int B = 5; // 카테고리수

//		자주 쓰는 변수 정리
//		score[i][j]

		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
		String[] name = new String[A];
		int[][] score = new int[A][B];
		int[][] total = new int[A][B]; // 왜 0은 적용이 안되는거지

//		입력
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번째");
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();

			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.println(title[j + 1] + "점수를 입력하세요");
				score[i][j] = scan.nextInt();

				score[i][3] = score[i][1] + score[i][2] + score[i][3];
				score[i][4] = (score[i][1] + score[i][2] + score[i][3]) / 3;
//				score[i][3]= score[i][3]/3.0; 
				
				// 4에서 멈추기
				if (score[i][j] == score[i][B - 1]) {
					break;
				}
			}
		} // 입력 끝

//		출력
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println("\n--------------------------------------");
		for (int i = 0; i < score.length; i++) {
			// 이름 출력
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		} // 입력 끝

	}
}