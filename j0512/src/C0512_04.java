
import java.util.Iterator;
import java.util.Scanner;

public class C0512_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//
//		1.로또번호생성
//		2.로또번호출력 ex)자동생성,입력번호,당첨번호,당첨개수

		// 임시저장,랜덤변수,당첨개수,스캔인풋변수
		int temp = 0, random = 0, count = 0, input = 0;
		int L = 45; // 로또 최대 개수
		int[] lotto = new int[L]; // 로또 번호
		int[] Mynum = new int[6]; // 입력한 로또 번호
		int[] lottonum = new int[6]; // 당첨번호
//		int[] lotto = new int[];
//		int[] lotto = new int[];

		while (true) {
			System.out.println("\n [로또 프로그램]");
			System.out.println("1.로또번호 생성");
			System.out.println("2.로또번호 입력");
			System.out.println("3.로또번호 출력");
			System.out.println("0.종료");
			System.out.println("-번호를 입력하세요-");
			input = scan.nextInt();

			if (input == 0) {
				System.out.println("종료합니다.");
				break;
			}
			// case1은 한번만 생성하게!
//			if (input == 1) {
//				if (count == 1) {
//					System.out.println("로또번호는 한번만 생성합니다.");
//					break;
//				}
//			}
			switch (input) {

			// 로또번호 생성
			case 1:
//				1~45번 대입
				for (int i = 0; i < lotto.length; i++) {
//					input = scan.nextInt();
					lotto[i] = i + 1; // 1,2,3,....45
				}
				System.out.println("로또번호가 생성되었습니다 \n");

				for (int i = 0; i < 10; i++) {
					random = (int) (Math.random() * L); // 0-44 랜덤번호 (배열이니깐)
					temp = lotto[0];
					lotto[0] = lotto[random];
					lotto[random] = temp;
				}

//				count++;
//				
//				for (int i = 0; i < 100; i++) {
//					random = (int)(Math.random()*45)+1;
//					temp = lotto[0]; //temp를 lotto[0]처럼
//					lotto[0] = lotto[random]; // random값을 lotto[0] 배열에 넣기
//					lotto[random] = temp; // 로또랜덤에 lotto[0]이 저장된 값을 집어 넣기
//					
//				}
//				

				break;

			// 로또번호 입력
			case 2:
				for (int i = 0; i < Mynum.length; i++) {
					System.out.println("\n" + (i + 1) + "번째 번호를 입력하세요 1~45까지");
					Mynum[i] = scan.nextInt();

					// 범위 포함 번호가 아닐 경우 다시 돌아가게 // 반복
					if (Mynum[i]<1||Mynum[i]>45) { // 1>Mynum[i]>45
						System.out.println("1~45 범위에 해당하지 않습니다. 다시 입력하세요");
						i--;
						
					}
					
					// 다른 번호일 경우 다시 돌아가게 // 반복
					for (int j = 0; j >= L; j++) {
						System.out.println("다른 번호입니다. 1~45에서 입력해주세요");
						i--;
						break;

					} // 다른 번호 입력시 리턴 for문

					// 같은 번호 입력시 리턴 for문
					for (int j = 0; j < i; j++) {
						if (Mynum[i] == Mynum[j]) {
							System.out.println("같은 번호입니다. 1~45에서 입력해주세요");
							i--;
							break;
						}

					} // 같은 번호 입력시 리턴 for문
					System.out.print("현재까지 입력한 번호 : ");
					for (int j = 0; j <= i; j++) {
						if (j == i) {
							System.out.print(Mynum[j]);
						} else {
							System.out.print(Mynum[j] + ", ");
						}
					}

				} // for문 1

				// 5. 로또번호 개수 확인 같은지 아닌지 당첨번호랑 내번호가 같은지
				// 같다면 count 증가
				for (int i = 0; i < lottonum.length; i++) {
					for (int j = 0; j < lottonum.length; j++) {
						if (lotto[i] == Mynum[j]) {
							lottonum[count] = Mynum[i];
							count++; // 당첨개수을 위해 변수
							continue;
						}
					}
				}
				break;

			// 로또번호 출력
			case 3:
				System.out.print("로또 자동 생성 번호 : ");
				for (int i = 0; i < lottonum.length; i++) {
					System.out.print(lotto[i] + " ");
				}
				System.out.println();

				System.out.print("입력한 번호 : ");
				for (int i = 0; i < Mynum.length; i++) {
					System.out.print(Mynum[i] + " ");
				}
				System.out.println();

				System.out.print("당첨된 번호 : ");
				for (int i = 0; i < count; i++) {
					System.out.print(lottonum[i] + " ");
				}
				System.out.println();

				// 당첨개수 출력
				System.out.print("당첨개수 :" + count);

				System.out.println();
				break;

			}// switch문 마지막

		} // while문 마지막
	}
}