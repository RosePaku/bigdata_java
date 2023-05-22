package j0522;

import java.util.Scanner;

public class C0522_10 {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.stuNo);

		Student s2 = new Student();
		System.out.println(s2.stuNo);
		// s2,s1은 기본생성자를 부르고 있음.

		Student s6 = new Student("홍길동", 100, 100, 100);
		System.out.println(s6.stuNo);
		// s6은 this를 부르고 있음

		// Student s3 = new Student();
		// System.out.println(s3.stuNo);

		// Student s4 = new Student();
		// System.out.println(s4.stuNo);

		// Student s5 = new Student();
		// System.out.println(s5.stuNo);

		// String str = String.format("%,04d", 1000); // (4자리수)
		// System.out.println(str);
	}
}
