package stuProject2;

import java.util.ArrayList;
import java.util.Scanner;

public class StuProcess {
	Scanner scan = new Scanner(System.in);
	String name = "";
	int kor = 0, eng = 0, math = 0;

	void stuInput(ArrayList<Student> list) {
		while (true) {
			System.out.println("학생이름을 입력하세요. (0.이전페이지 이동)");
			name = scan.next();

			if (name.equals("0")) {
				System.out.println("이전페이지로 이동합니다");
				break;
			}

			System.out.println("국어점수를 입력하세요");
			kor = scan.nextInt();

			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();

			System.out.println("수학점수를 입력하세요");
			math = scan.nextInt();

			// 학생성적입력 메소드
			list.add(new Student(name, kor, eng, math));

			// list.size() = 1-1 내가 저장한 위치
			System.out.printf("학번 : %d, 이름 : %s \n", list.get(list.size() - 1).getStuNo(), name);
			System.out.println("(이)가 입력되었습니다.");
			System.out.println();
			// list.get(list.size()-1).getStuNo();
		}

	}
}
