package j0522;

import java.util.Scanner;

public class C0522_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 생성자 활용
		// 배열 선언
		Data[] d = new Data[100];
		int num1 = 0, num2 = 0;

		for (int i = 0; i < 100; i++) {
			d[i] = new Data();
			System.out.println("1번째 숫자를 입력하세요");
			num1 = scan.nextInt();

			System.out.println("2번째 숫자를 입력하세요");
			num2 = scan.nextInt();

			d[i] = new Data(num1, num2);

//			// 기본생성자
//			d[i] = new Data();
//			d[i].num1 = n1;
//			d[i].num2 = n2;
//			d[i].data1 = d[i].num1 + d[i].num2;
//			d[i].data2 = d[i].num1 - d[i].num2;
//			d[i].data3 = d[i].num1 * d[i].num2;
//			d[i].data4 = d[i].num1 / d[i].num2;

		}

	}
}
