package Stu;

import java.util.Scanner;

public class Stumain {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램종료

		// 이름,국어,영어,수학, 합계,평균 - 10명
		// int[][] score = new int[10][4]; //
		// double[] avg = new double[5];

		Student[] s = new Student[10];
		int choice = 0; // 선택 번호
		int count = 0; // 학생 수
		String searchName = ""; // 검색이름
		int[] rank = new int[10]; // 등수
		int chk = 0;// 존재유무(학생 존재의 유무)

		while (true) {
			choice = stuScreen();
			// System.out.println("[ 학생성적처리 프로그램 ]");
			// System.out.println("1. 성적입력");
			// System.out.println("2. 성적출력");
			// System.out.println("3. 성적수정");
			// System.out.println("4. 등수처리");
			// System.out.println("5. 학생검색");
			// System.out.println("0. 프로그램종료");
			// System.out.println("-----------------------");
			// System.out.println("원하는 번호를 입력하세요.");
			// choice = scan.nextInt();

			switch (choice) {
				case 1: // 성적입력 // s = 타이틀
					// 성적입력 메소드 호출 - 클래스명.메소드명() / 메소드명()
					count = stuInput(count, s); // 입력된 학생수

					// 기능
					// for (int i = count; i < s.length; i++) {
					// s[i] = new Student();
					// System.out.println((i+1)+"번째 학생 이름을 입력하세요.(0.이전페이지 이동)");
					// s[i].name = scan.next();

					// if (s[i].name.equals("0")) {
					// System.out.println("이전페이지로 이동합니다.");
					// System.out.println();
					// break;
					// }
					// System.out.println("국어점수를 입력하세요.");
					// s[i].kor = scan.nextInt();
					// System.out.println("영어점수를 입력하세요.");
					// s[i].eng = scan.nextInt();
					// System.out.println("수학점수를 입력하세요.");
					// s[i].math = scan.nextInt();
					// s[i].sum(); //합계
					// s[i].average(); //평균

					// System.out.println((count+1)+"번째 학생성적이 등록이 완료됐습니다.");
					// System.out.println();
					// //학생수 1증가
					// count++;

					// }
					break;

				case 2: // 성적출력

					break;

				case 3: // 성적수정

					break;

				case 4: // 등수처리

					break;

				case 5: // 학생검색

					break;

				case 0: // 학생종료

					break;

			}

		} // while

	}// main

	// 0. 화면 입력
	static int stuScreen() {
		System.out.println("[ 학생성적처리 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 등수처리");
		System.out.println("5. 학생검색");
		System.out.println("0. 프로그램종료");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = scan.nextInt();

	}

	// 1. 성적입력 메소드
	static int stuInput(int count, Student[] s) {
					// 기능
					for (int i = count; i < s.length; i++) {
					s[i] = new Student();
					System.out.println((i+1)+"번째 학생 이름을 입력하세요.(0.이전페이지 이동)");
					s[i].name = scan.next();

					if (s[i].name.equals("0")) {
					System.out.println("이전페이지로 이동합니다.");
					System.out.println();
					break;
					}
					System.out.println("국어점수를 입력하세요.");
					s[i].kor = scan.nextInt();
					System.out.println("영어점수를 입력하세요.");
					s[i].eng = scan.nextInt();
					System.out.println("수학점수를 입력하세요.");
					s[i].math = scan.nextInt();
					s[i].sum(); //합계
					s[i].average(); //평균

					System.out.println((count+1)+"번째 학생성적이 등록이 완료됐습니다.");
					System.out.println();
					//학생수 1증가
					count++;
	}

}
}
// class
