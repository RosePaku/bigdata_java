package j0510_pr;

import java.util.Iterator;
import java.util.Scanner;

public class C0510_01_pr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2.for문을 이용하여 1부터 10까지의 숫자 중에서 홀수만 출력하는 프로그램을 작성하세요.
		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

	}

}
//		
// 반복문
// 1. 0~10까지 반복
// 2. 홀수 조건을 걸기
