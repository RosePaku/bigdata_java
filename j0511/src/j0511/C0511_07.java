package j0511;

public class C0511_07 {

	public static void main(String[] args) {

//		1 실습
//		1. 배열 생성
		int sum = 0;
		int[] num;
		num = new int[5];
//		int[] score = new int[5];
		String[] name = new String[100];
		double[] avg = new double[50];

//		2. 값 넣기
		int[] score = new int[10];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;

		for (int i = 0; i < score.length; i++) {
			score[i] = i + 1;
			System.out.println((i) + ":" + (i + 1)); // 알고리즘 찾기

		}

//		score 1부터~10까지 출력
		System.out.println(num);
		System.out.println(score[1]);

	}
}