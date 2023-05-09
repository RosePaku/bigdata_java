package j0509;

import java.util.Scanner;

public class Class0509_10 {

	public static void main(String[] args) {
		
		
//		3번
//		실수를 입력받아 7자리까지만 입력받아, 소수점 4자리까지만 출력하시오.
		double pi = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("7자리까지만 실수를 입력해주세요");
		pi = scan.nextDouble();
		double result = (int)(pi*10000)/10000.0;
		System.out.println("입력한 값 : "+pi);
		System.out.println("실수의 4자리 값 : "+result);
		
		
		
		
//		2번
//		//564.124586 소수점 3자리 절사 2자리까지 존재
//		double pi = 564.124586;
//		double result = (int)(pi*100)/100.0;
//		System.out.println(result);
		
		
		
//		1번
//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0;
//		System.out.println(result);
		
	}

}
