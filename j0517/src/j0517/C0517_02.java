package j0517; // 이 코드는 j0517 패키지에 속합니다.

import java.util.Scanner; // Scanner 클래스를 사용합니다.

public class C0517_02 { // C0517_02 클래스입니다.

	public static void main(String[] args) { // 프로그램의 시작점입니다.
		// C0517_02 클래스의 인스턴스를 생성합니다.
		C0517_02 c = new C0517_02();
		// Scanner 클래스의 인스턴스를 생성합니다.
		Scanner scan = new Scanner(System.in);
		// int형 변수 num1을 선언하고 10으로 초기화합니다.
		int num1 = 10;
		// int형 변수 num2를 선언하고 5로 초기화합니다.
		int num2 = 5;

		// 객체선언
		// 클래스명 참조변수명 = new 클래스명();
		// Card c1 = new Card();
		// 두 수를 입력받아 더하기 결과값을 출력하시오.
		//System.out.println("1번째 숫자를 입력하세요.");
		//num1 = scan.nextInt();
		//System.out.println("2번째 숫자를 입력하세요.");
		//num2 = scan.nextInt();

		// int형 배열 num을 선언하고 크기를 2로 설정합니다.
		int[] num = new int[2];
		// for 반복문을 사용하여 num 배열의 요소를 입력받습니다.
		for (int i = 0; i < 2; i++) {
			// 사용자로부터 입력받을 숫자의 위치를 출력합니다.
			System.out.println((i + 1) + "번째 숫자를 입력하세요.");
			// Scanner 클래스의 nextInt 메소드를 사용하여 사용자로부터 정수를 입력받아 num 배열에 저장합니다.
			num[i] = scan.nextInt();
		}
		// 더하기, 빼기, 곱하기, 나누기 메소드 호출
		// add 메소드를 호출하여 두 수의 합을 구하고, 그 결과를 result1 변수에 저장합니다.
		int result1 = c.add(num[0], num[1]);
		// sub 메소드를 호출하여 두 수의 차를 구하고, 그 결과를 result2 변수에 저장합니다.
		int result2 = c.sub(num[0], num[1]);
		// multi 메소드를 호출하여 두 수의 곱을 구하고, 그 결과를 result3 변수에 저장합니다.
		int result3 = c.multi(num[0], num[1]);
		// div 메소드를 호출하여 두 수를 나눈 몫을 구하고, 그 결과를 result4 변수에 저장합니다.
		int result4 = c.div(num[0], num[1]);
		// 두 수의 합을 출력합니다.
		System.out.println("두 수의 더하기 : " + result1);
		// 두 수의 차를 출력합니다.
		System.out.println("두 수의 빼기 : " + result2);
		// 두 수의 곱을 출력합니다.
		System.out.println("두 수의 곱하기 : " + result3);
		// 두 수의 나누기를 출력합니다.
		System.out.println("두 수의 곱하기 : " + result4 );

	}

	// 더하기 메소드
	int add(int num1, int num2) {
		// 두 수를 더한 결과를 구합니다.
		int result = num1 + num2;
		// 결과를 반환합니다.
		return result;
	}

	// 빼기 메소드 sub
	int sub(int num1, int num2) {
		// 두 수의 차를 구한 결과를 구합니다.
		int result = num1 - num2;
		// 결과를 반환합니다.
		return result;
	}

	//
	//곱하기 메소드 multi
	int multi(int num1,int num2) {
		int result = num1 * num2;
		return result;
	}
	//나누기 메소드 div
	int div(int num1,int num2) {
		int result = num1 / num2;
		return result;
	}

}