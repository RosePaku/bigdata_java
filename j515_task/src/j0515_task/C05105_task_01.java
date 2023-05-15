//로또 출력 프로그램
// 입력창
// ~번째 번호를 입력하세요
// 결과창
// 로또번호,입력번호, 맞춘 번호, 맞춘 개수 출력

package j0515_task;

import java.util.Scanner;

public class C05105_task_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int random = 0, temp = 0, count = 0, input = 0, count1 =0;

		int[] mynum = new int[6];
		int[] lottonum = new int[6];
		int[] lotto = new int[45];

		while (true) {
			System.out.println("로또 프로그램");
			System.out.println("1. 로또번호 생성");
			System.out.println("2. 로또번호 입력");
			System.out.println("3. 로또번호 출력");
			System.out.println("0. 종료");
			System.out.println("-------------------");
			System.out.println("번호를 입력하세요.");
			input = scan.nextInt();

			switch (input) {
			case 1:
				// 생성
				for (int i = 0; i < lotto.length; i++) {
					lotto[i] = i + 1;
				}
				// 섞기
				for (int i = 0; i < 100; i++) {
					random = (int) (Math.random() * 45);
					temp = lotto[0];
					lotto[0] = lotto[random];
					lotto[random] = temp;

				}

				break;

			case 2:
				// 입력
				for (int i = 0; i < mynum.length; i++) {
					
					System.out.println((i + 1) + "번째 번호를 입력하세요");
					input = scan.nextInt();
					mynum[i] = input;
					count1++;
					System.out.print("현재까지 입력한 번호 : ");
					for (int j = 0; j < count1; j++) {
						System.out.print(mynum[j]+" ");
					}
					System.out.println();
				}
				

				// 비교
				for (int i = 0; i < mynum.length; i++) {
					for (int j = 0; j < mynum.length; j++) {
						if (lotto[i] == mynum[j]) {
							lottonum[count] = mynum[i];
							count++;
							continue;
						}
					}

				}

				break;

			case 3:
				// 출력
				System.out.print("입력번호 : ");
				for (int i = 0; i < mynum.length; i++) {
					System.out.print(mynum[i]+" ");
				}
				System.out.println();

				System.out.print("추첨번호 : ");
				for (int i = 0; i < mynum.length; i++) {
					System.out.print(lotto[i]+" ");
				}
				System.out.println();

				System.out.print("당첨번호 : ");
				for (int i = 0; i < count; i++) {
					System.out.print(mynum[i]+" ");
				}
				System.out.println();
				System.out.print("당첨개수 : " + count);
				System.out.println();
				break;

			}// switch

		} // while

	}// main

}// class
