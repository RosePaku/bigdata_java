package j0510;

import java.util.Scanner;

public class C0510_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1번 문제
//		m,f 입력 받아 m,f 남자 여자 출력 - switch 문 사용
		
		String input = " ";
//		char input = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 입력");
		input = scan.next();
//		input = scan.next().charAt(0); // char를 사용할 때 (대, 소문자)
		// charAt(0)을 쓰는 이유는 
		// char의 특정 자리만 출력해달라는 뜻 예를 들어 (1)을 쓰면 2번째 자리가 출력
		
		switch (input) {
		case "m": {
			System.out.println("m입니다.");
			break;

		}
		case "f": {
			System.out.println("f입니다.");
			break;
		}
		default:
			System.out.println("다른거입니다.");
			break;
		}
		
//		더 짧게 하는 법 char 사용 시
//	switch (input) {
//		case 'm' : case 'M':
//			System.out.println("남자입니다.");
//			break;
//		case 'f' : case 'F':
//			System.out.println("여자입니다");
//			break;
//		
//	}
		
	}// class

}// main


//		int input = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자 입력");
//		input = scan.nextInt();

//1번 설명
//switch와 같음
//if (input==1) {
//	System.out.println("1입니다");
//}
//else if (input==6) {
//	System.out.println("6입니다");
//}
//else if (input==9) {
//	System.out.println("9입니다");
//}
//else {
//	System.out.println("다른겁니다");
//}
//


//2번 설명
//switch (input) { // 크다,작다 비교가 안됨
//case 1: {
//	System.out.println("1입니다.");
//	break;
//}
//case 6: {
//	System.out.println("6입니다.");
//	break;
//}
//
//case 9: {
//	System.out.println("9입니다.");
//	break;
//}
//
//default:
//	System.out.println("원하는 숫자가 아닙니다.");
//	break;
//	
//}//switch