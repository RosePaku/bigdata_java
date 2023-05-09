package j0509;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Class0509_07 {

	public static void main(String[] args) {
		
		// 숫자를 입력 받아 짝수인지 홀수인지 출력하시오.
		// 짝수입니다. 홀수입니다.
		// 1. 변수선언 2. 입력 3. 출력.
		
		int num = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력하셈");
		num = scan.nextInt();
		
		String answer = (num%2==0)?"짝수입니다":"홀수입니다";
		System.out.println(answer);
				
//		System.out.println("짝수입니다.");
		
		
		
		
	}

}
