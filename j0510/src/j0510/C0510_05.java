package j0510;

import java.util.Scanner;

public class C0510_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		문제 2
//		점수 입력 받아, 90점 이상이면 A, 80점 이상이면 B, 70-C, 60-D, F ... 반복
//		++ 97점 이상 A+, 93이하 A-, 87점 이상 B+, 		
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력");
		num = scan.nextInt();

		if (num >= 90) { // 90,91,92....100
			System.out.print("A");
			if (num >= 97) {
				System.out.println("+");
			} else if (num <= 93) {
				System.out.println("-");
			}
		} // 조건1 
		
		
		else if (num >= 80) {
			System.out.print("B");
			if (num >= 87) {
				System.out.println("+");
			} else if (num >= 83) {
				System.out.println("-");
			}
		}// 조건 2 
		
		
		else if (num >= 70) {
			System.out.print("C");
			if (num >= 77) {
				System.out.println("+");
			} else if (num >= 73) {
				System.out.println("-");
			}
		}//조건 3
		
		
		else if (num >= 60) {
			System.out.print("D");
			if (num >= 67) {
				System.out.println("+");
			} else if (num >= 63) {
				System.out.println("-");
			}
		}//조건 4
		else if (num < 60) {
			System.out.print("F");

		}//조건 5
		
		else {
			System.out.println("다시 입력하세요");
		}//조건 6

	}
}

////		1번
//String str = "";
//Scanner scan = new Scanner(System.in);
//System.out.println("문자열 입력");
//str = scan.next();
//if (str.equals("c")) {
//	//equalsIgnoreCase : 대소문자 치환
//	//if (str=="c") { //기본형 8개 - boolean,char,bytep,short,int,long,float 외에는 비교가 불가능
//	System.out.println("c 입니다.");
//} else {
//	System.out.println("아닙니다");
//}

//2번
//String input="";
//char ch = ' ';
//Scanner scan = new Scanner(System.in);
//System.out.println("문자열 입력");
////input = scan.next(); // 문자열
//ch = scan.next().charAt(0); //문자열의 첫번째 문자
//if (ch=='c') {
////equalsIgnoreCase : 대소문자 치환
////if (str=="c") { //기본형 8개 - boolean,char,bytep,short,int,long,float 외에는 비교가 불가능
//	System.out.println("c 입니다.");
//} else {
//	System.out.println("아닙니다");
//}

//문제 1
//점수 입력 받아, 90점 이상이면 A, 80점 이상이면 B, 70-C, 60-D,F
//int num = 0;
//Scanner scan = new Scanner(System.in);
//System.out.println("점수 입력");
//num = scan.nextInt();
//
//if (num>=90) {
//	System.out.println("A");
//}
//else if (num>=80) {
//	System.out.println("B");
//}
//else if (num>=70) {
//	System.out.println("C");
//}
//else if (num>=60) {
//	System.out.println("D");
//}
//else if (num<60) {
//	System.out.println("F");
//}
//else {
//	System.out.println("다시 입력하세요");
//}