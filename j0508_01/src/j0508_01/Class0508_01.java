package j0508_01;

public class Class0508_01 {
	public static void main(String[] args) {
		boolean temp = true;
		boolean temp2 = false;
		boolean temp3;
		temp3 = true;

		char ch1 = ' ';
		char ch2 = 'a'; // ''만 사용가능
		char ch3 = 'A';
		char ch4 = 't';
		// char ch5 = " "; "" 사용 불가

		byte num1 = 1;
		//byte num3 = 256; // 127까지 숫자표현 가능		
		short num2 = 10;
		//byte num4 = 32768; // 32767까지 숫자표현 가능
		
		int num5 = 21;
		//byte num6 = 2147483648; //2147483647까지 숫자표현 가능
		long num7 = 21;
		//long num8 = 2147483648; // 오류
		//숫자 뒤에 L을 안 붙이면 작동 안함
		float num9 = 9.87654321111111f; //실수형 8자리까지 정밀도 표현 가능
		float num10 = 987.65432100000f; //접미사 F,f를 붙여야 함.
		double num11 = 1.123456789012345; //실수형 16자리까지 정밀도 표현 가능 
		
		
		//문자열 - class일 때 대문자 표현
		String str1 = new String("abc");
		
		String str = "aaa"; // 기본형 타입으로 선언 (예외)
		
		
		char str3= ' ';
		String str4= "";
		
		//변수
		int score = 100;
		score = score + 200; //score 300이라는 값이 들어감.
		
		//상수
		final int SCO = 100;
		//SCO = 200; //상수는 값을 변경할 수 없음.
		
		
		
		
		
	}
}
