package j0510;

import java.util.Iterator;
import java.util.Scanner;

public class C0510_08 {

	public static void main(String[] args) {

//			문제 5번
//			10개의 숫자를 입력 받아 합계 출력 (while문)

		int num = 0;
		int sum = 0;
		int i = 1;
		Scanner scan = new Scanner(System.in);

		while (i <= 10) {
			System.out.println(i + "번째 숫자를 입력");
			num = scan.nextInt();
			sum += num;
			i++;

		}
		System.out.println(sum);

	}
}

////		실습 1   놓침
//		//반복문 - for,while
//		int sum = 0;
//		int i = 0;
//		for (i=1;i<=100;i++) { // int는 밖에서 정의 했기 때문에 필요 없음
////		for (int i=1;i<=100;i++) { // i가 for문 안에서만 정의된 것
//			sum = sum +i; // 이전 값(sum)+2
////			sum += i;
//			System.out.println(i+":"+sum);
//		}// 조건식이 안 맞아야지만 나옴
//		System.out.println((i-1)+":"+sum); 

////문제1
////숫자 3개를 입력 받아, 합을 출력하시오
////1. 변수선언 num,sum
////2. scan 1번 선언
////3. 반복문
////4. 숫자 입력 넣어줌
////num = scan.nextInt();
////5. sum 변수에 더하기 해줌
////sum = sum+sum;
////6. sum을 출력
//
//int sum = 0;
//int i = 0;
//Scanner scan = new Scanner(System.in);
//System.out.println("1번 값 입력");
//int num = scan.nextInt();
//
//for (i = num; i <= 3; i++) {
//sum += i;
////System.out.println("입력한 값 : "+i+", 합산 값 : "+sum);
//System.out.println("입력한 값 : " + i + ", " + num + "부터 " + i + "까지의 합: " + sum);
//
//}

////실습 2
//for(int i=1;i<=9;i++) {
////System.out.println("["+i+"번째] \n");
//System.out.printf("[%d번째] \n",i);
//for (int j = 1; j <= 9; j++) {
//	System.out.printf("%d * %d = %d \n",i,j,i*j);
//	System.out.println("안녕"+j);
//}
////System.out.println(i+"*"+i+"="+(i*i));

////문제3
//// 00 01 02 03 04....09 10 11....99
//// 중첩(이중) for문을 사용해서 출력
//for (int i = 0; i < 10; i++) {
//for (int j = 0; j < 10; j++) {
//	System.out.print(i+""+j+" ");
//	if (j==0) {
//		System.out.println(" ");
//	}
//}
//}
////System.out.printf("%d * %d = %d \n",i,i,i*i);
//System.out.println("마지막"+i+"\n");
//}

////문제 2
//// 0-9까지 출력해라.
//for (int i = 0; i < 10; i++) {
//	System.out.println(i);
//}

//문제3
//// 숫자를 3번 반복해서 입력받아, 합을 출력하시오.
//// 1. 변수선언 num,sum
//// 2. scan 1번선언
//// 3. 반복문
//// 4. 숫자 입력 넣어줌
////    num = scan.nextInt();
//// 5. sum 변수에 더하기 해줌.
////    sum = sum + num;
//// 6. sum을 출력
//Scanner scan = new Scanner(System.in);
//int num=0,sum=0;
//
//for(int i=0;i<3;i++) {
//	System.out.println((i+1)+"번째 숫자를 입력하세요.");
//	num = scan.nextInt();
//	sum = sum + num;
//}
//
//System.out.println("합계 : "+sum);

//실습 3
//// i--, i-=1, i=i-1
//// i++, i+=1, i=i+1
//for (int i = 10; i >0; i=i-2) {
//	System.out.println(i);
//}

//// 문제 4번
//// 랜덤숫자 1-100까지의 랜덤숫자 1개를 출력하시오.
//int random = 0;
//int random1 = (int) (Math.random() * 10) + 1;
////System.out.println(random1);
//
//// 숫자 맞추기 프로그램 - 문제 4번 연장선으로 실습
//int i = 1;
//while (i <= 10) {
//	System.out.println(i + "번째 숫자 입력");
//	int input = scan.nextInt();
//	if (input == random1) {
//		System.out.println("정답입니다");
//		break;
//	} else if (input> random) {
//		System.out.println("[ 오답 ] 입력한 숫자보다 작은 수입니다");
//	} else {
//		System.out.println("[ 오답 ] 입력한 숫자보다 큰 수입니다");
//	}
////	System.out.println("정답 : " + random1); // 정답 확인
//}

//// 문제 5번
//// 10개의 숫자를 입력 받아 합계를 출력하시오. (for문)
//
//int num = 0;
//int sum = 0;
//Scanner scan = new Scanner(System.in);
//
//for (int i = 1; i <= 10; i++) {
//	System.out.println(i + "번째 숫자를 입력하세요");
//	for (int j = 0; j <= 10; j++) {
////		System.out.println("10");
//		num = scan.nextInt();
//		sum = sum + num;
//		break;
//	}
//}
//System.out.println(sum);
