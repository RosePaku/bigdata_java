package j0518;

import java.util.Scanner;

public class C0518_10 {

	int iv;
	static int cv;

	public static void main(String[] args) {
		C0518_10.cv = 50; // 클래스
		System.out.println(cv);

		C0518_10 c = new C0518_10();
		c.iv = 100;
		System.out.println(c.iv);

	}

	void i_Method() {
		System.out.println(iv);
		System.out.println(cv);
	}

	static void c_Method() {
		C0518_10 c2 = new C0518_10();
		System.out.println(c2.iv); // int iv에 static을 붙여야 함
		System.out.println(cv);
	}
}
