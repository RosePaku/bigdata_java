
import java.util.Iterator;
import java.util.Scanner;

public class C0512_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 로또 프로그램
		// 1. 배열 생성
		int L = 6; // 로또 번호 개수
		int random = 0, // 랜덤번호
				count = 0, // 당첨번호
				temp = 0; // 임시 저장 변수
		int[] lotto = new int[45]; // 입력번호
		int[] lottoNum = new int[L]; // 당첨번호
		int[] Mynum = new int[L]; // 로또번호
		String inputString = "";

		// 2. 로또 번호 생성
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1; // 1,2,3...45
//			lotto[i] = (int) (Math.random() * 45) + 1;

		}

		// 3. 번호 섞기 10번
		for (int i = 0; i < 10; i++) {
			random = (int) (Math.random() * 45); // 0-44 랜덤번호
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}

		// 4. 로또번호 입력
		for (int i = 0; i < 6; i++) {
			System.out.println("\n" + (i + 1) + "번째 로또번호를 입력하세요. 1~45까지");
			Mynum[i] = scan.nextInt();

			// 범위 포함 번호가 아닐 경우 다시 돌아가게 // 반복
			if (Mynum[i]<1||Mynum[i]>45) { // 1>Mynum[i]>45
				System.out.println("1~45 범위에 해당하지 않습니다. 다시 입력하세요");
				i--;
				
			}
			
			// 같은 번호일 경우 다시 돌아가게 // 반복
			for (int j = 0; j < i; j++) {
				if (Mynum[i] == Mynum[j]) { // 배열은 1==0 구조라 이건 같다라는걸 의미함.
					System.out.println("같은 번호입니다. 다시 입력하세요\n");
					i--; // 다시 입력받기 위해 i 값을 감소시킵니다.
					break;
				}
			} // for문

			System.out.print("현재까지 입력한 번호: ");
			for (int j = 0; j <= i; j++) {
				if (j == i) { // 마지막 (같아지는 부분)
					System.out.print(Mynum[j]);
				} else { // 처음 부분
					System.out.print(Mynum[j] + ", ");

				}

			}

//2트
//			System.out.println("현재까지 입력한 번호: ");
//			if (Mynum[i]==Mynum[i]) {
//				System.out.println(inputString += Mynum[i] + ",");
//				
//			}
//			else if (Mynum[i]==Mynum[i]) {
//				System.out.println("");
//				
//			}

//	        for (int j = 0; j < Mynum.length; j++) {
//            System.out.print((j + 1) + "번째 번호를 입력하세요: ");
//            Mynum[j] = scan.nextInt(); // 정수형으로 입력받아 배열에 저장
//            inputString += Mynum[j]; // 입력한 값을 문자열에 추가
//            if (j != Mynum.length - 1) {
//                inputString += ","; // 마지막 입력값은 쉼표를 추가하지 않음
//            }
//            System.out.println("현재까지 입력한 번호: " + inputString); // 입력한 값을 출력
//        }

		} // 입력 for문

//		System.out.println(lotto[5]);

		// 5. 로또번호 출력
		System.out.print("\n\n로또번호 자동생성 : ");
		for (int i = 0; i < L; i++) {
			System.out.print(lotto[i]);
			if (i != 5) {
				System.out.print(",");
			}

		}

//		6.로또번호 확인
		for (int i = 0; i < L; i++) { // lotto배열
			for (int j = 0; j < L; j++) {
				if (lotto[i] == Mynum[j]) {
					lottoNum[count] = lotto[i]; // 당첨번호 넣기
					count++; // 당첨개수 증가
					continue; // 계속 이어가라

				}
			}
		}

		// 7. 입력 번호 출력
		System.out.print("\n\n입력번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(Mynum[i] + " ");
		}

		// 8. 당첨 번호 출력
		System.out.print("\n\n당첨번호 : ");
		for (int i = 0; i < count; i++) {

//			// 같은번호는 1개만 나오게
//			if (lottoNum[i] == i]) {
			System.out.print(lottoNum[i] + " ");
//			}

		}

//		for (int i = 0; i < lotto.length; i++) {
//			System.out.println(lotto[i]);
//		}

//당첨개수
		System.out.println("\n\n당첨 개수 : " + count);
	}
}
