package j0516;

import java.util.Scanner;

public class C0516_02_02 {

	public static void main(String[] args) {
		//금요일 시험
		Scanner scan = new Scanner(System.in);
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램종료

		// 이름,국어,영어,수학, 합계,평균 - 10명
		int choice = 0; // 선택 번호
		int count = 0; // 학생 수

		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		String[] name = new String[10];
		String searchName = "";
		int[][] score = new int[10][4]; //
		double[] avg = new double[5];
		int[] rank = new int[10]; // 등수

		int chk = 0;// 존재유무(학생 존재의 유무)

		loop: while (true) {

			// 입력
			System.out.println("[성적 처리 프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수 처리");
			System.out.println("5. 학생성적검색");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();

			switch (choice) {

			case 1:// 이름: i
				for (int i = 0; i < name.length; i++) {
					System.out.println((count + 1) + "번째 학생의 이름을 입력하세요(0.이전화면 이동)");
//	 				System.out.println;
					name[i] = scan.next();

					// 이전 페이지 이동확인
					if (name[i].equals("0")) { // equals("0" = name[i]=="0"이 같을 때 
						System.out.println("이전 페이지 이동됩니다..");
						System.out.println();
						break; // 추가해야만 페이지 이동!!!!
					}
					// 국영수 점수 입력 : j
					for (int j = 0; j < 3; j++) {
						System.out.println((title[j + 1]) + " 점수를 입력하세요");
						score[i][j] = scan.nextInt();
					} // for

					// 합계부분
					score[i][3] = score[i][0] + score[i][1] + score[i][2];
					/// 평균 부분
					avg[i] = score[i][3] / 3.0;
					// 과목
					System.out.println((count + 1) + "번째 학생 성적이 등록되었습니다.");
					System.out.println();

					// 학생수
					count++;

				} // for 이름

				break;

			case 2: // 성적 출력
				System.out.println("[학생성적]");
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i] + "\t");
				}
				System.out.println("");
				System.out.println("-----------------");
				for (int i = 0; i < count; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.printf("%.2f\t", avg[i]); // 평균
					System.out.printf("%d\n", rank[i]); // 등수
					System.out.println();
				}
				break;

			case 3: // 성적수정
				// 학생 이름으로 검색
				System.out.println("수정할 학생의 이름을 입력하세요");
				searchName = scan.next();

				// 수정할 학생 검색
				chk = 0; //
				for (int i = 0; i < count; i++) {
					if (name[i].equals(searchName)) { // 모든 학생을 검색
						// 수정할 과목 선택
						System.out.println("수정할 학생을 찾았습니다.");
						System.out.println("수정할 과목을 선택하세요.");
						System.out.println("1. kor");
						System.out.println("2. eng");
						System.out.println("3. math");
						System.out.println("-------------------");
						System.out.println("수정할 과목을 선택하세요.");
						choice = scan.nextInt();

						// 수정할 과목 이전 점수 표시
						// 국어 점수 : kor score[i][0], eng score[i]1], math score[i][2],
						// score[i][choice-1]; // 과목-1
						System.out.printf("[현재 %s 점수] : %d \n", title[choice], score[i][choice - 1]);
						System.out.println("----------------------");
						System.out.println("수정할 점수를 입력하세요");
						score[i][choice - 1] = scan.nextInt();
						// 합계 평균 수정
						score[i][3] = score[i][0] + score[i][1] + score[i][2];
						avg[i] = score[i][3] / 3.0;

						System.out.println("점수가 수정되었습니다.");
						System.out.println();
						chk = 1;
					} // if

				} // for

				// 찾는 학생이 없을시
				if (chk == 0) {
					System.out.println("입력한 학생이 없으면 다시 입력하세요.");
					System.out.println();

				}
				break;

			case 4: // 등수 처리 score[i][3]: 합계 // i의 3번에 : 합계
				for (int i = 0; i < count; i++) {
					int rankcount = 1; // rankcount=1 = 1등이라는 의미
					for (int j = 0; j < count; j++) {
						// 모든 학생 성적 합계 비교
						if (score[i][3] < score[j][3]) { // 3명의 학생 비교
							// 자기 점수보다 높으면 등수 1등
							rankcount++; // j와 비교했을 때 i가 작을 수록 1씩 증가
						} // if

					} // for j
						// 등수 부분에 등수 입력
					rank[i] = rankcount;
				} // for i
				System.out.println("등수 처리가 완료되었습니다.");
				System.out.println();
				break;

			case 5: // 학생 검색
				System.out.println("학생검색");
				System.out.println("검색할 학생의 이름을 입력하세요.");
				searchName = scan.next();
				chk = 0; // 체크를 0으로 셋팅
				for (int i = 0; i < count; i++) {
					// 홍->홍길동, 홍길순, 홍길자 다 검색 될 수 있게 만들기
					if (name[i].contains(searchName)) { // 검색: contains

						System.out.print(name[i] + "\t");
						for (int j = 0; j < score[i].length; j++) {
							System.out.print(score[i][j] + "\t");
						}
						System.out.printf("%.2f\t", avg[i]); // 평균
						System.out.printf("%d\n", rank[i]); // 등수
						chk = 1;
					} // if
				} // for

				if (chk == 0) {
					System.out.println("[찾고자 하는 학생이 없습니다. 다시 입력하세요.]");
				} // if
				System.out.println();

				break;

			case 0:
				System.out.println("프로그램 종료");
				break loop;

			} // switch(choice)

			// break loop;
		} // while

	} // main

} // class