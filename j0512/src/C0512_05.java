import java.util.Scanner;

public class C0512_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 10진수를 2진수로 변경하는 프로그램

		// 2진수를 저장할 배열
		String[] binary = { 
			"0000", "0001", "0010", "0011", 
			"0100", "0110", "0101", "0111", 
			"1000", "1001" 
		};

		// 10진수를 저장할 배열
		int[] num = new int[4];

		
//		1번 for문
		// 10진수 입력 받기
		// num[0] = 1, num[1] = 0, num[2] = 2, num[3] = 5
		for (int i = 0; i < num.length; i++) {
			System.out.println("번호를 입력하세요.");
			num[i] = scan.nextInt();
		}

		
//		2번 for문
		// 2진수로 변환하여 출력
		System.out.println("이진코드 : ");
		// num[0]부터 num[3]까지 순서대로 접근
		for (int i = 0; i < num.length; i++) {
			// num[i]에 해당하는 2진수 값을 배열 binary에서 찾아 출력
			System.out.print(binary[num[i]] + " ");
		}
		System.out.println();

		
//		3번 for문
		// 10진수로 출력
		System.out.println("10진코드 : ");
		// num[0]부터 num[3]까지 순서대로 접근
		for (int i = 0; i < num.length; i++) {
			// num[i]를 그대로 출력
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
