package j0511;

import java.util.Iterator;

public class C0511_01 {
	// 10개의 숫자를 입력받아 합계를 출력하시오.
	public static void main(String[] args) {
		
//		문제 1 구구단
		for (int i = 1; i < 10; i++) {
			System.out.printf("\n [%d단] \n",i);
			for (int j = 1; j < 10; j++) {		
				System.out.print(i+"*"+j+"="+(i*j)+" ");
			}
			System.out.println("\n");
		}
		
//		// 문제 2 구구단을 출력하시오. 가로 세로 정렬해서
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[%d단]\t",i);
//		}
//		System.out.println();
//		for(int i=1;i<=9;i++) {
//			for(int j=2;j<=9;j++) {
//				System.out.printf("%d*%d=%d\t",j,i,i*j);
//			}
//			System.out.println();
//		}		
		
		
		
	}
}

