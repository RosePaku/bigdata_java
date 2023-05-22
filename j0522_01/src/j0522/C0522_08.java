package j0522;

import java.util.Scanner;

public class C0522_08 {
	static int cv = 1; // 클래스 변수 - 객체선언 없이 클래스명.변수명
	int iv = 1; // 인스턴스 변수 - 객체선언 후 참조변수명.변수명

	static {
		cv = 2; // 클래스 초기화블럭
	}
	{
		iv = 2; // 인스턴스 초기화 블럭
	}

	public static void main(String[] args) {
		C0522_08 c = new C0522_08();
		c.iv = 4;
		System.out.println(c.iv);
		System.out.println(c.cv);
	}

}
