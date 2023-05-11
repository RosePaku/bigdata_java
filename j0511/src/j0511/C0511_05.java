package j0511;

import java.util.Iterator;
import java.util.Scanner;

public class C0511_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0, num1 = 0, num2 = 0, sum = 0;
		

		while (true) { // 무한반복
			System.out.println("1. 더하기");
			System.out.println("2. 곱하기");
			System.out.println("0. 종료");
			System.out.println("----------");
			System.out.println("원하는 번호를 입력하세요.");
			input = scan.nextInt();
			if (input == 0) {
				System.out.println();
				break;
			} // 프로그램 종료

			switch (input) {
			case 1:
				loop:while (true) {
					System.out.println("1번 숫자 입력하세요. (0.이전 페이지, 1:종료)");
					num1 = scan.nextInt();
					if(num1==0) break;  // 바로 이전 페이지
					if(num1==1) break loop; // 바로 종료
					System.out.println("2번 숫자 입력하세요");
					num2 = scan.nextInt();
//					System.out.println(num1+"+"+num2+"="+(num1+num2));
					System.out.printf("%d+%d=%d \n", num1, +num2, (num1 + num2));
					break;

				} // while문
				
			}// switch문
//			loop:break;

		} // while문 메뉴
	}
}

// 살짝 어려움
// loop:for 중첩 반복문에서 바깥쪽 반복문까지 한번에 빠져나오기
// 가장 바깥쪽 길을 지정하는 것과 같음
// j가 6일 때 바로 빠져나옴

//		//실습1
//		loop:for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				if(j==6) break loop;
//				System.out.printf("%d*%d=%d\n",i,j,(i*j));
//			} // for문 바로 빠져오기
//			System.out.println();
//		}