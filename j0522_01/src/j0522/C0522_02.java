package j0522;

import java.util.Scanner;

public class C0522_02 {

	public static void main(String[] args) {
		// num 배열은 10개의 정수를 저장하는 배열
		int[] num = new int[10];
		// data 배열은 계산 결과를 저장하는 배열
		int[] data = new int[20];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			// 각각의 반복에서 2개의 숫자를 입력받아 num 배열에 저장
			for (int j = (2 * i) + 0; j < (2 * i) + 2; j++) {
				System.out.println((j + 1) + "번째 숫자를 입력하세요");
				num[j] = scan.nextInt();
			}
			// 입력받은 숫자들을 이용하여 계산하고 결과를 data 배열에 저장
			// data 배열에는 각각 4개의 계산 결과가 저장됨
			data[4 * i] = num[(2 * i)] + num[(2 * i) + 1];
			System.out.println(data[4 * i]);

			data[4 * i + 1] = num[(2 * i)] + num[(2 * i) + 1];
			System.out.println(data[4 * i + 1]);

			data[4 * i + 2] = num[(2 * i)] + num[(2 * i) + 1];
			System.out.println(data[4 * i + 2]);

			data[4 * i + 3] = num[(2 * i)] + num[(2 * i) + 1];
			System.out.println(data[4 * i + 3]);
		}
	}
}

// import java.util.Scanner;

// public class 주문계산프로그램 {

// public static void main(String[] args) {
// int[] 상품가격 = new int[5]; // 5개의 상품 가격을 저장하는 배열
// int[] 수량 = new int[5]; // 5개의 상품 수량을 저장하는 배열
// int[] 총가격 = new int[5]; // 5개의 상품에 대한 총 가격을 저장하는 배열

// Scanner scan = new Scanner(System.in);

// System.out.println("구매한 상품의 가격과 수량을 입력하세요.");

// for (int i = 0; i < 5; i++) {
// System.out.println((i + 1) + "번째 상품 가격을 입력하세요:");
// 상품가격[i] = scan.nextInt();

// System.out.println((i + 1) + "번째 상품 수량을 입력하세요:");
// 수량[i] = scan.nextInt();

// 총가격[i] = 상품가격[i] * 수량[i];
// System.out.println("상품 " + (i + 1) + "의 총 가격은 " + 총가격[i] + "원입니다.");
// }
// }
// }
