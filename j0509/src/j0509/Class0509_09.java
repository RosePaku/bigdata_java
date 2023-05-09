package j0509;

import java.util.Scanner;

public class Class0509_09 {

	public static void main(String[] args) {
		//1)		
		//1개의 글자를 입력받아 숫자로 변환하시오.
		//"15784" 첫번째 문자를 숫자로 변환
		// 문자 -> 숫자 -> 첫번째 문자가 짝수 홀수인지 확인
		char ch = ' ';
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		char input = scan.next().charAt(3); //charAt() 문자열에서 1개의 문자를 가져옴.
//		int result = input-0; //49
		int result = 49-'0'; //char타입의 숫자는 '0'문자 0을 빼야 숫자값으로 변환됨.
		String content = (result%2==0)?"짝수":"홀수";
		System.out.println("추출한 숫자: "+result);
		System.out.println(content);
		
		
	}

}
