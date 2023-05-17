// 국어,영어,수학 합계 평균 출력
// 1. 성적 입력
// 2. 성적 출력
// 3. 성적 수정
// 4. 등수처리
// 5. 학생검색
// 0. 프로그램종료

package j0516;

import java.util.Scanner;

public class C0516_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = 0, count = 0;
//		double temp = 0;
		int A = 2; // 열
		int B = 4; // 행
		int chk = 0; // 찾을 학생 유무

		String modifyName = "";
		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		String[] name = new String[A];
		int[][] score = new int[A][B];
		double[] avg = new double[A];

		while (true) {
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수 출력");
			System.out.println("5. 학생 검색");
			System.out.println("0. 프로그램 종료");

			System.out.println("번호를 입력하세요");
			input = scan.nextInt();
			if (input == 0) {
				System.out.println("종료합니다.");
				break;
			}

			switch (input) {

			// 입력
			case 1:
				for (int i = count; i < name.length; i++) {
					System.out.println("이름을 입력하세요 0)이전 페이지로 돌아갑니다 ");
					name[i] = scan.next();

					// 이전페이지
					if (name[i].equals("0")) {
						System.out.println("이전 페이지로 돌아갑니다.");
						System.out.println();
						break;
					}
					// 국,영,수,합계
					for (int j = 0; j < B - 1; j++) {
						System.out.println(title[j + 1] + "점수를 입력하세요");
						score[i][j] = scan.nextInt();
						score[i][3] = score[i][3] + score[i][j];
					}
					avg[i] = score[i][3] / 3.0;
					count++;
				} // for 이름

				break;

			// 입력
			case 2:

				// 제목
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i] + "\t");
				}
				System.out.println();
				System.out.println("-------------------");

				// 점수
				for (int i = 0; i < score.length; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i], score[i][0], score[i][1], score[i][2],
							score[i][3], avg[i]);
				}
				System.out.println();
				break;

			case 3:
				System.out.println("수정할 학생 이름을 입력하세요.");
				modifyName = scan.next();

				for (int i = 0; i < count; i++) {
					if (name[i].equals(modifyName)) {
						System.out.println("[수정과목 선택]");
						System.out.println("-----------------------");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("수정할 과목을 선택해 주세요.");
						input = scan.nextInt();
						chk = 1; // 찾는 학생이 1일 경우 1로 변경하기

						switch (input) {
						// 국,영,수
						case 1:
							System.out.println("현재 " + title[i + 1] + " 점수 : " + score[i][0]);
							System.out.println("--------------------------");
							System.out.println("수정할 " + title[i + 1] + " 점수를 입력하세요");
							score[i][0] = scan.nextInt(); // 수정할 점수 입력
							// 변경된 점수를 더해 합계,평균 다시 수정
							score[i][3] = score[i][0] + score[i][1] + score[i][2];
							avg[i] = score[i][3] / 3.0;
							System.out.println("수정완료");
							System.out.println();

							break;

						case 2:
							System.out.println("현재 " + title[i + 2] + " 점수 : " + score[i][0]);
							System.out.println("--------------------------");
							System.out.println("수정할 " + title[i + 2] + " 점수를 입력하세요");
							score[i][0] = scan.nextInt(); // 수정할 점수 입력
							// 변경된 점수를 더해 합계,평균 다시 수정
							score[i][3] = score[i][0] + score[i][1] + score[i][2];
							avg[i] = score[i][3] / 3.0;
							System.out.println("수정완료");
							System.out.println();

							break;

						case 3:
							System.out.println("현재 " + title[i + 3] + " 점수 : " + score[i][0]);
							System.out.println("--------------------------");
							System.out.println("수정할 " + title[i + 3] + " 점수를 입력하세요");
							score[i][0] = scan.nextInt(); // 수정할 점수 입력
							// 변경된 점수를 더해 합계,평균 다시 수정
							score[i][3] = score[i][0] + score[i][1] + score[i][2];
							avg[i] = score[i][3] / 3.0;
							System.out.println("수정완료");
							System.out.println();

							break;

						}// 국영수 switch

					} // 수정과목 if

				} // 수정과목 for

				// chk
				if (chk == 0) {
					System.out.println("찾는 학생이 없습니다. 다시 입력해주세요.");
					System.out.println();
				}

				break;

			case 4:
				// 등수처리

				for (int i = 0; i < score.length - 1; i++) {
					for (int j = i + 1; j < score.length; j++) {
						if (score[i][3] < score[j][3]) {
							// swap avg[i] and avg[j]
							
							if (!(score[i]==score[3])) {
								int[] temp1 = score[i];
								score[i] = score[j];
								score[j] = temp1;
								
							}

							// swap score[i][3] and score[j][3]
							int temp = score[i][3];
							score[i][3] = score[j][3];
							score[j][3] = temp;

							// swap avg[i] and avg[j]
							double tempAvg = avg[i];
							avg[i] = avg[j];
							avg[j] = tempAvg;

							// swap name[i] and name[j]
							String tempName = name[i];
							name[i] = name[j];
							name[j] = tempName;
						}
					}
				}
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i] + "\t");
				}
				System.out.println();
				// 점수
				for (int i = 0; i < score.length; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", name[i], score[i][0], score[i][1], score[i][2],
							score[i][3], avg[i], i + 1);
				}
				break;

			case 5:
				System.out.println("검색할 학생 이름을 입력하세요");
				modifyName = scan.next();
				chk = 0;
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i] + "\t");
				}

				for (int i = 0; i < count; i++) {
					System.out.println();
					if (name[i].equals(modifyName)) {
						chk = 1;

						System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", name[i], score[i][0], score[i][1],
								score[i][2], score[i][3], avg[i], i + 1);

					}

				}
				if (chk == 0) {
					System.out.println("검색하는 학생이 없습니다.");
				}
				break;

			}// switch (while문)

		} // while

	}// main

}// class

// chk 체크 부분이 있어야 함 학생이 있는지 없는지
// break 위치 확인해야 함 (너무 무작정으로 break 됐음)
