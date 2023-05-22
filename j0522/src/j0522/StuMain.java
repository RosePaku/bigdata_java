package j0522;

import java.util.Scanner;

public class StuMain {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0;
		int count = 0;
		String name = "";
		int kor = 0, eng = 0, math = 0;
		Student1[] s = new Student1[10]; // 배열선언

		// s[0] = new Student1(); // 객체선언

		while (true) {
			System.out.println("[성적처리프로그램]");
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 종료");

			System.out.println("원하는번호를 입력하세요");
			choice = scan.nextInt();

			if (choice == 0) {
				System.out.println("[프로그램 종료]");
			}

			switch (choice) {
				case 1:
					count = stuInput(count, s);
					break;
			}
			break;

		} // switch
	} // while

	// 다른메소드 선언
	static int stuInput(int count, Student1[] s) {
		// 학생입력
		String name = "";
		int kor = 0, eng = 0, math = 0;

		for (int i = count; i < s.length; i++) {
			System.out.println((i + 1) + "이름을 입력하세요(0.이전페이지 이동)");
			name = scan.next();
			if (name.equals("0")) {
				System.out.println("[이전 페이지로 이동합니다.]");
				System.out.println();
				break;
			}

			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();

			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();

			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();

			s[i] = new Student1(name, kor, eng, math);
			count++;
		} // for

		return count;
	}
}// main class
