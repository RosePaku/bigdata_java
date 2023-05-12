
import java.util.Iterator;
import java.util.Scanner;

public class C0512_02 {
	// 10개의 숫자를 입력받아 합계를 출력하시오.
	public static void main(String[] args) {
//		국어,영어,수학 합계 평균 출력
		// 1. 성적 입력
		// 2. 성적 출력
		// 3. 성적 수정
		// 4. 등수처리
		// 5. 학생검색
		// 0. 프로그램종료

		Scanner scan = new Scanner(System.in);
		// 이름,국영수,합계,평균 - 10명
		int input = 0, count = 0;
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] math = new int[2];
		int[] total = new int[2];
		double[] avg = new double[2];

		while (true) {

			// 화면출력
			System.out.println("[성적처리프로그램]");
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 종료");

			System.out.println("원하는번호를 입력하세요");
			input = scan.nextInt();
			if (input == 0)

			{
				System.out.println("종료합니다.");
				break;
			}

			// 3 조건문
			switch (input) {

			case 1:

				// 학생 수 만큼 반복
				for (int i = count; i < name.length; i++) {

					System.out.println((count + 1) + "번째 이름을 입력하세요 \n(0을 누르면 종료합니다.)");
					name[i] = scan.next();
					if (name[i].equals("0")) {
						System.out.println("종료합니다.");
						break;
					}
					System.out.println("국어 성적 입력하세요");
					kor[i] = scan.nextInt();
					System.out.println("영어 성적 입력하세요");
					eng[i] = scan.nextInt();
					System.out.println("수학 성적 입력하세요");
					math[i] = scan.nextInt();

					// 자동 성적
					total[i] = kor[i] + eng[i] + math[i];
					avg[i] = total[i] / 3.0;
					count++; // 1이라는 학생부터 입력함 // 나왔다 들어갔다가
				}
				break;

			case 2:
				System.out.println("이름\t 국어 \t 영어\t 수학 \t 합계 \t 평균");
				System.out.println("----------------------------------");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name[i], kor[i], eng[i], math[i], total[i],
							avg[i]);

				}
			case 3:
				while (true) {

				}

			}
		}
	}
}