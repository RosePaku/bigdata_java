package j0518;

import java.util.Scanner;

public class C0518_09 {

	static Scanner scan = new Scanner(System.in);
	static int myMoney = 1000;
	static int choice = 0, temp = 0;

	public static void main(String[] args) {
		// 자판기 프로그램
		// 1. 밀크커피 2.헤이즐럿커피 3. 블랙커피 4. 코코아 5. 우유
		// 300,500,350,300,400
		// 6. 잔액충전

		while (true) {
			System.out.println("[학교다방 자판기]");
			System.out.println("1. 밀크커피 300");
			System.out.println("2. 헤이즐럿커피 500");
			System.out.println("3. 블랙커피 350");
			System.out.println("4. 코코아커피 300");
			System.out.println("5. 우유 400");
			System.out.println("6. 잔액충전");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------");
			System.out.printf("현재 잔액 : %,d \n", myMoney);
			System.out.println("원하는 번호 입력하세요");
			choice = scan.nextInt();

			switch (choice) {
				case 1:
					myMoney = order(myMoney, 300, "밀크커피");
					break;
				case 2:
					myMoney = order(myMoney, 500, "헤이즐럿커피");
					break;

				case 3:
					myMoney = order(myMoney, 350, "블랙커피");
					break;

				case 4:
					myMoney = order(myMoney, 300, "코코아커피");
					break;

				case 5:
					myMoney = order(myMoney, 400, "우유");
					break;

				case 6:
					cash();

				case 0:
					System.out.println("종료합니다.");
					break;

			}// switch

		} // while

	}

	static int order(int myMoney, int price, String title) {
		if (myMoney >= price) {
			System.out.println(title + "가 나옵니다.");
			myMoney -= price;
		} else {
			System.out.println("잔액이 부족합니다.");

		}
		return myMoney;
	}// static

	static void cash() {

		System.out.println("충전하시려면 1을 눌러주세요");
		choice = scan.nextInt();

		if (choice == 1) {
			System.out.println("충전할 금액을 입력하세요");
			temp = scan.nextInt();
			myMoney += temp;
			System.out.println("[충전이 되었습니다] ");
			System.out.println();
			System.out.println("현재잔액 : " + myMoney);
			System.out.println("충전금액 : " + temp);
		} else
			System.out.println("시스템에 오류가 있습니다. 다시 실행해주세요.");
		System.out.println();

	}
}
