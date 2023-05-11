package j0511;

import java.util.Iterator;
import java.util.Scanner;

public class C0511_02_01 {
	// 10개의 숫자를 입력받아 합계를 출력하시오.
	public static void main(String[] args) {
		int i = 0;
//		 while(i<10) {
//		System.out.println("i의 값 : "+i);
//
//		 }

		do {
			System.out.println("i의 값 : " + i);
			i++;
		} while (i < 10);

		System.out.println("프로그램을 종료합니다.");

	}
}

//무한반복
//for(;;) {
//	System.out.println("숫자를 입력하세요.");
//	int num = scan.nextInt();
//	if(num==0) {
//		System.out.println("프로그램을 종료합니다.");
//		break;
//	}
//}

//무한반복
//while(true) {
//	System.out.println("숫자를 입력하세요.");
//	int num = scan.nextInt();
//	if(num==0) {
//		//프로그램을 종료
//		break; //반복문을 종료는 break
//	}
//}

//int i=10;
////while(i<0) {
////System.out.println("i의 값 : "+i);
////}
//
//do {
//System.out.println("i의 값 : "+ i);
//}while(i<0);
//
//System.out.println("프로그램을 종료합니다.");