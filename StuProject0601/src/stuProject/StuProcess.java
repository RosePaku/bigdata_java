package stuProject;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class StuProcess {
	// String[] title1 = { "학번", "국어", "영어", "수학" };
	// String title2 = "이름";
	Scanner scan = new Scanner(System.in);
	int stuNo;
	String name;
	int kor, eng, math;
	String createDate;

	ArrayList<Student> stuInput() {
		ArrayList<Student> list = new ArrayList<Student>();
		// 학번,이름,성적
		System.out.println("[학생 성적 입력]");
		System.out.println("학번을 입력하세요");
		stuNo = scan.nextInt();
		System.out.println("이름을 입력하세요");
		name = scan.next();
		// System.out.println("국어 성적을 입력하세요");
		// kor = scan.nextInt();
		// System.out.println("영어 성적을 입력하세요");
		// eng = scan.nextInt();
		// System.out.println("수학 성적을 입력하세요");
		// math = scan.nextInt();

		// Student s = new Student(stuNo, name, kor, eng, math, math, kor, eng,
		// createDate);
		list.add(new Student(stuNo, name, kor, eng, math, math, kor, eng, createDate));
		return list;
	}
}