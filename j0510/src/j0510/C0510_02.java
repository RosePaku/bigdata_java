package j0510;

import java.util.Scanner;

public class C0510_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문제풀이 2
		// 점수를 입력받아 60점 이상이면 합격, 60점 이하면 탈락
		
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력해라 ");
		num = scan.nextInt();
		
		if (num>=60) {
			System.out.println("합격빠이야");
		}
		else if (num<60) {
			System.out.println("탈락");
		}
		
		else {
			System.out.println("숫자가 아님");
		}
		

	}
}




//		1번
//		int num = 8;
////		(num>=1)?"":""; // 삼항식
//		if (num>8) {
//			System.out.println("8입니다.");			
//		}
//		else {
//			System.out.println("8이 아닙니다.");
//		}
//				


//		2번
//		조건문 3개일 경우
//		
//		int num	= 0;
//		if (num>0) {
//			System.out.println("양수");
//		}else if(num==0) {
//			System.out.println("0입니다.");
//		}
//		else {
//			System.out.println("음수입니다.");
//		}

////		3번
//		//if문만 존재
//		int num =0;
//		if (num==0) {
//			System.out.println("0입니다.");
//		}

////		문제풀이1
//		//입력한 숫자가 2의 배수이면 2의 배수입니다. 2의 배수가 아닙니다. 출력
//		
//		int num = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("값을 입력해주세요");
//		num = scan.nextInt();
//		
//		if (num%2==0) {
//			System.out.println("2의 배수입니다.");
//		}
//		else {
//			System.out.println("2의 배수가 아닙니다.");
//		}







