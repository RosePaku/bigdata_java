package j0511;

import java.util.Iterator;
import java.util.Scanner;

public class C0511_10 {

	public static void main(String[] args) {

		// 성적처리 프로그램
		// 1.이름 2.국어. 3.영어. 4.수학 합계, 평균 자동으로 들어갈 수 있도록 함
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];

		int[] range1 = new int[3];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < name.length; i++) {
			System.out.println("이름 입력하세요");
			name[i] = scan.next();
			System.out.println("국어점수 입력하세요");
			kor[i] = scan.nextInt();
			System.out.println("영어점수 입력하세요");
			eng[i] = scan.nextInt();
			System.out.println("수학점수 입력하세요");
			math[i] = scan.nextInt();

			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / 3.0;
		}

		for (int i = 0; i < name.length; i++) {

			// 출력
			System.out.println("이름 \t 국어 \t영어 \t수학 \t합계 \t평균");
			System.out.println("------------------------------------------------------------------");
			System.out.printf("%s \t %d \t %d \t %d \t %d \t %.2f \n", name[0], kor[0], eng[0], math[0], total[0],
					avg[0]);
//			,total[0],avg[0]
		}

	}
}

//		while (true) {
//
//			System.out.println("이름을 입력하세요");
//			name = scan.nextLine();
//
//			System.out.println("국어 성적을 입력하세요");
//			kor = scan.nextInt();
//
//			System.out.println("영어 성적을 입력하세요");
//			eng = scan.nextInt();
//
//			System.out.println("수학 성적을 입력하세요");
//			math = scan.nextInt();
//
//			// 자동계산
//			total = kor + eng + math;
//			avg = total / 3.0;

// 출력

//			System.out.printf("이름\t국어\t영어\t수학\t합계\t평균 \n");
//			System.out.println("---------------------------");
//			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name, kor, eng, math, total, avg);
//		