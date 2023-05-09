package j0509;

import java.util.Scanner;



public class Class0509_12 {

	public static void main(String[] args) {
		
		// 영문 대문인지 소문자인지 비교
		char ch = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 입력하쇼");
		ch = scan.next().charAt(0);
		String result = (ch>='a'&&ch<='z')?"영문 소문자입니다.":"영문 대문자입니다.";
		System.out.println(result);

	

	}

}
