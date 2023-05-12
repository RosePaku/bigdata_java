
import java.util.Iterator;
import java.util.Scanner;

public class C0512_01 {
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
//변수 선언		
		int count = 0, sum = 0, input = 0;
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] math = new int[2];
		int[] total = new int[2];
		double[] avg = new double[2];

// 로비 화면 구성		
		while (true) {
			System.out.println("1.값 입력 ");
			System.out.println("2.값 출력 ");
			System.out.println("0. 종료 ");
			input = scan.nextInt();

// 종료합니다.
			if (input == 0) {
				System.out.println("종료합니다.");
				break;
			}

// 스위치			
			switch (input) {
// 입력			
			case 1:
//				for (int i = 0; i < name.length; i++) {
//
//				}

				for (int j = 0; j < name.length; j++) {

					System.out.println((j + 1) + "번째만큼 이름 입력하세요. \n0을 누르면 이전페이지로 돌아갑니다.");
					name[j] = scan.next();
					
// 돌아가기					
					if (name[j].equals("0")) {
						break;
					}

					System.out.println("국어 점수 입력하세요");
					kor[j] = scan.nextInt();
					System.out.println("영어 점수 입력하세요");
					eng[j] = scan.nextInt();
					System.out.println("수학 점수 입력하세요");
		
					math[j] = scan.nextInt();

					// 자동계산
					total[j] = kor[j] + eng[j] + math[j];
					avg[j] = total[j] / 3.0;
					count++;
				} // for문 1번 입력
				break;

// 출력 (점수만 반복 출력)
			case 2:
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("--------------------------------------");

				// 학생 수만큼 반복 출력
				for (int i = 0; i < count; i++) {

					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name[i], kor[i], eng[i], math[i], total[i],
							avg[i]);

				}
				break;
			}

// 학생 수 3명만큼 입력		
// 		
		} // while문

	}
}
