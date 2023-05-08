package j0508_01;

public class Class0508_03 {
	static int n;// 전역변수 - class영역에서도 변수선언 가능
	// 자동으로 0 처리

	public static void main(String[] args) {
		int n;// 지역변수 
		//n=10; !! 해당 값을 넣지 않으면 실행 안 됨. 
		//int num; 에러 처리
		System.out.println("main메소드 num 호출: "+n);
		sub();

	}// main

	static void sub() {

		System.out.println(n);
		System.out.println("sub메소드 num 호출: "+n);
	}

}// class
