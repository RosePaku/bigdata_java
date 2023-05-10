package j0510;

import java.util.Scanner;

public class C0510_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// m,f문자로 입력받아 m이면 남자, f면 여자
		
		String str = ""; //객체, 기본형타입만 ==
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 입력 m 또는 f");
		str = scan.next();
						
		
		if (str.equals("m")) { //문자 비교할 때는 .equals를 사용한다는 것
			System.out.println("m이므로 남자");
		}
		else if (str.equals("f")) {
			System.out.println("f이므로 남자 ");
		}
		else {
			System.out.println("딴거다");
		}
		

	}//class

}//main



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


//		// 문제풀이 2
//		// 점수를 입력받아 60점 이상이면 합격, 60점 이하면 탈락
//		
//		int num = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수 입력해라 ");
//		num = scan.nextInt();
//		
//		if (num>=60) {
//			System.out.println("합격빠이야");
//		}
//		else if (num<60) {
//			System.out.println("탈락");
//		}
//		
//		else {
//			System.out.println("숫자가 아님");
//		}

//		문제풀이 3
////		입력한 숫자가 1,6,9만 입력 받아 1,6,9 출력
//		int num = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("입력해라");
//		num = scan.nextInt();
//		
//		if (num==1) {
//			System.out.println("1입니다");
//		}
//		else if (num==6) {
//			System.out.println("6입니다");
//		}
//		else if (num==9){
//			System.out.println("9입니다");
//		}
//		else {
//			System.out.println("1,6,9에 해당하지 않습니다.");
//		}





