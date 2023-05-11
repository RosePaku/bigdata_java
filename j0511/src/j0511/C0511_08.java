package j0511;

import java.util.Iterator;

public class C0511_08 {

	public static void main(String[] args) {
//		문제 1
//		10개 배열 생성 후 랜덤숫자 1-10까지 숫자 입력해서 출력
		int[] num = new int[10]; // 저장할 수 있는 공간
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10) + 1;
			System.out.println(num[i]);
		}

	}
}

////		1.실습
////		int 배열
//		int[] num = new int[100];
//		
//		for (int i = 0; i < num.length; i++) {
//			num[i] = i + 1;
//			System.out.println(i + ":" + (i + 1));
//		}
//
//		for (int i = 0; i < num.length; i++) { // num의 배열의 크기 만큼
//			System.out.println(num[i]);
//
//		}