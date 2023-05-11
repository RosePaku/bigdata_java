package j0511;

import java.util.Iterator;
import java.util.Scanner;

public class C0511_09_ex {

	public static void main(String[] args) {
		// 랜덤숫자맞추기 (값 입력 받아)
		// 10번 기회를 주어지고 정답 확인 시 입력한 번호를 출력

		int input = 0; // 입력받은 변수
		int random = 0; // 랜덤 변수
		int count = 0; // 도전 횟수
		int[] num = new int[10];
		Scanner scan = new Scanner(System.in);

		random = (int) (Math.random() * 100) + 1;
		System.out.println("랜덤 숫자 : " + random);

//		int i = 0;

		while (true) {
			// 10번 도전시
			if (count >= 10) {
				System.out.println("10번 도전했습니다. 프로그램 종료합니다.");
				break;
			}
			// 도전번호 입력
			System.out.println((count + 1) + "번째 숫자를 입력하세요");
			num[count] = scan.nextInt();
			if (num[count] == random) {
				System.out.println("정답입니다");
				break;
			} else {
				System.out.println("오답입니다. 다시 도전하세요");
			}
			count++;
		}//while문 마지막
		
		
		// 입력한 숫자 출력
		System.out.println("정답 : " + random);
		System.out.print("입력한 숫자 : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
			if (i != num.length - 1) {
				System.out.print(",");
			}
			
//			if(i==0) {
//				System.out.println(num[i]);
//			}else {
//				System.out.println(","+num[i]);
//			}
			
			

		}//for문 마지막

	}
}
