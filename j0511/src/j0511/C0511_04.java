package j0511;

import java.util.Iterator;

public class C0511_04 {

	public static void main(String[] args) {

//		문제 1. 5단만 빼고 출력

//		for (int i = 1; i < 10; i++) {
		for (int i = 2; i < 10; i++) {
			if (i % 2 != 0)
				continue;
			for (int j = 1; j < 10; j++) {
//				if (j != 5)  // 문제1 5단만 빼고 출력
				if (j % 2 == 0) // 문제2 짝수단만 출력
					continue;
//					System.out.println(i + "*" + j + "=" + (i*j)+"\t");
				System.out.printf("%d*%d=%d\t", i, j, (i * j));
			}
			System.out.println();
		}

	}
}

////실습 2
//int i=0, sum=0;
//
//for (i = 0;;) {
//if (sum>10) {
//	break;
//}
//i++;
//sum+=i;
//}
//System.out.println("i의 결과값 :"+(i));
//System.out.println("sum의 결과값 :"+sum);

//// 실습3
//for (int i = 0; i <= 10; i++) {
////	if (i%2==1) { //1
//	if (i==5) { //2
//		continue;
//	}
//	System.out.println(i);
//}