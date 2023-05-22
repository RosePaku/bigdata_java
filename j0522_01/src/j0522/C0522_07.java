package j0522;

import java.util.Scanner;

public class C0522_07 {
	int x; // 인스턴스 변수
	int y = x; // 인스턴스 변수
	char ch;
	String str;

	// 인스턴스 변수는 초기화 안해도 됨 (int x = 0;과 같이)

	public static void main(String[] args) {
		int a = 0; // a에 0을 넣으면 아래 문단 에러 해결
		int b = a;
		C0522_07 c = new C0522_07();

		// C0522_07 c = new C0522_07();

		// a,b,x,y를 출력하시오

		System.out.println(a);
		System.out.println(b);
		System.err.println(c.x);
		System.err.println(c.y);
		System.err.println("ch : " + c.ch);
		System.err.println("str : " + (c.str + 1));

	}
}