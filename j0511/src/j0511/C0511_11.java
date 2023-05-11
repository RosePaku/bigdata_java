package j0511;


import java.util.Scanner;

public class C0511_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		int[] num = new int[0];
		int n1 = 0, count = 0, input = 0; // 번호 선택, 입력된 학생 수

		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];

//		1.성적입력
//		2.성적출력
//		3.성적수정
//		4.등수처리
//		0.프로그램 종료

		while (true) {
			System.out.println("성적처리 프로그램");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적수정");
			System.out.println("4.등수처리");
			System.out.println("0.프로그램 종료");

			System.out.println("\n 번호를 입력하세요");
			input = scan.nextInt();

// 종료 버튼			
			if (input == 0) {
				System.out.println("종료합니다.");
				break;
			}

			switch (input) {

// 1. 성적 입력
			case 1:
				for (int i = count; i < name.length; i++) { // count 왜 들어가지?
					System.out.println((count+1)+"번째 이름을 입력하세요. (0.이전페이지이동)");
					name[i] = scan.next();

// 0번 입력시 이전 페이지로
					if (name[i].equals("0")) {
						System.out.println("돌아갑니다.");
						System.out.println();
						break;
					}
// 그 외 바로 성적 입력					
					System.out.println("국어 성적 입력");
					kor[i] = scan.nextInt();

					System.out.println("영어 성적 입력");
					eng[i] = scan.nextInt();

					System.out.println("수학 성적 입력");
					math[i] = scan.nextInt();

					// 자동계산
					total[i] = kor[i] + eng[i] + math[i];
					avg[i] = total[i] / 3.0;
					count++; // 이것도 왜 있지?
				} // for
				
				break; // switch

// 2. 성적 출력				

			case 2:
				System.out.println("성적을 출력합니다.");
				System.out.println("이름 \t 국어 \t영어 \t수학 \t합계 \t평균");
				System.out.println("------------------------------------------------------------------");

				for (int i = 0; i < count; i++) {
					System.out.printf("%s \t %d \t %d \t %d \t %d \t %.2f \n", name[i], kor[i], eng[i], math[i], total[i],avg[i]);

				}
				break;

// 3. 성적 수정			

			case 3:
				System.out.println("뭐냐");

// 4. 등수 처리				

			case 4:
				System.out.println("뭐냐");

			} // switch

		} // while
	}
}