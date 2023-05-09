package j0509;

import java.util.Scanner;

public class Class0509_11 {

	public static void main(String[] args) {

// 		4번
//		실수를 입력받아 소수점 4자리에서 올림해서 출력하시오
		double pi = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("실수 입력 ㄱ");
		pi = scan.nextDouble();
		double result = Math.round(pi * 1000) / 1000.0;
		System.out.println(result);

//		3번
//		소수점 5자리를 입력받아 3자리에서 반올림해서 출력하시오.
//		double num = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소수점 5자리 입력 예)1.23456");
//		num = scan.nextDouble();
//		double result = Math.round(num*100)/100.0;
//		System.out.println(result);
//		

//		2번
//		double pi = 3.7894; 소수점 2자리에서 반올림해서 출력하시오.
//		37.894

//		double pi = 3.7894;
//		double result = Math.round(pi*10)/10.0;
//		System.out.println(result);
//		
//		1번
//		 소수점 4자리에서 반올림 출력하시오.
//		 1.변수선언 2.출력
//		double pi = 3.141592;
//		double result = (int)(pi*1000)/1000.0;
//		System.out.println(result);

	}

}
