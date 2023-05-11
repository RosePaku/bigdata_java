package j0511;

import java.util.Iterator;
import java.util.Scanner;

public class C0511_09 {

	public static void main(String[] args) {
		// 랜덤숫자맞추기 (값 입력 받아)
		// 10번 기회를 주어지고 정답 확인 시 입력한 번호를 출력
		int input = 0; // 입력받은 변수
		int random = 0; // 랜덤 변수
		int count = 0; // 도전 횟수

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("1. 랜덤 숫자 생성");
			System.out.println("2. 시작하기");
			System.out.println("3. 종료");

			System.out.println("번호를 입력 하세요");
			input = scan.nextInt();

			if (input == 3) {
				System.out.println("종료합니다.");
				break;
			}
			
			switch (input) {

			case 1:
				System.out.println("랜덤 숫자 생성이 되었습니다.");
								
				break;
				
			case 2:
				System.out.println("랜덤 숫자를 맞추세요");
				input = scan.nextInt();
				if (input == 0) {
					
				}
				
				break;
				

			}

		}

	}
}
