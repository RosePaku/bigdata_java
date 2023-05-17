// 1. 성적입력
// 2. 성적출력
// 3. 성적수정
// 4. 등수처리
// 5. 학생성적검색
// 0. 프로그램종료

//제시 변수
//		Scanner scan = new Scanner(System.in);
//		// 이름,국,영,수,합계,평균 - 10명
//		int choice = 0, count = 0, chk = 0;
//		int A = 2;
//		int B = 4;
//		String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
//		String[] name = new String[A];
//		String Sinput = "";
//		String modifyName = "";
//		int[][] score = new int[A][B]; // 국영수합계만
//		double[] avg = new double[A];

// 제시 스크린 (while)
// System.out.println("[ 학생성적처리 프로그램 ]");
// System.out.println("1. 성적입력");
// System.out.println("2. 성적출력");
// System.out.println("3. 성적수정");
// System.out.println("4. 등수처리");
// System.out.println("5. 학생검색");
// System.out.println("0. 프로그램종료");
// System.out.println("-----------------------");
// System.out.println("원하는 번호를 입력하세요.");

package j0516;

import java.util.Scanner;

public class C0516_task_01 {

	static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	static int choice = 0, count = 0, chk = 0;
	static int rankCount = 1;
	static int A = 2, B = 4;
	static String[] name = new String[A];
	static String Sinput = "";
	static String modifyName = "";
	static int[][] score = new int[A][B]; // 국영수합계만
	static double[] avg = new double[A];
	static int[] rank = new int[A];
	static String searchName = "";
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// 이름,국,영,수,합계,평균 - 10명

		loop: while (true) {
			// 화면출력부분
			// 사용하는 방법 클래스명.메소드명
			screen();
			choice = scan.nextInt();

			switch (choice) {
			// 입력
			case 1:
				scoreInput();
				break;

			// 출력
			case 2:
				System.out.println("학생성적");
				titleScreen();
				scoreOutput();

				break;

			// 수정
			case 3:
				scoreModify();

				break;

			// 등수처리
			case 4:
				ranking();
				break;
			// 학생검색
			case 5:
				System.out.println("[학생 검색]");
				System.out.println("검색할 학생의 이름을 입력하세요.");
				searchName = scan.next();
				chk = 0;

				titleScreen();
				search();
				break;
			// 종료
			case 0:
				System.out.println("종료합니다.");
				break;

			}

		} // while문

	}// main

	// while 초기 화면-------------------------------------------------------
	static void screen() {
		System.out.println("[ 학생성적처리 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 등수처리");
		System.out.println("5. 학생검색");
		System.out.println("0. 프로그램종료");
		System.out.println("-----------------------");
		System.out.println("원하는 번호를 입력하세요.");
	}

	// 타이틀 스크린---------------------------------------------------------
	static void titleScreen() {
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------");

	}

	// 점수입력---------------------------------------------------------
	static void scoreInput() {
		for (int i = 0; i < name.length; i++) {
			// 이름 입력
			System.out.println((count + 1) + "번째 학생의 이름을 입력하세요.");
			System.out.println("[0을 누르면 이전페이지로 돌아갑니다.]");			
			name[i] = scan.next();

			// 이전페이지 이동
			if (name[i].equals("0")) {
				System.out.println("이전 페이지로 이동합니다.");
				System.out.println();
				break;
			}

			// 국영수 점수 입력하세요 i0~i2, B = 국어~합계
			for (int j = 0; j < B - 1; j++) {
				System.out.println(title[j + 1] + "점수를 입력하세요.");
				score[i][j] = scan.nextInt();
			}

			// 합계i3, 평균i
			score[i][3] = score[i][0] + score[i][1] + score[i][2];
			avg[i] = score[i][3] / 3.0;

			System.out.println((count + 1) + "번째 학생성적이 등록되었습니다.");
			System.out.println();
			count++;
		}
	}

	// 점수출력---------------------------------------------------------
	static void scoreOutput() {
		// 점수
		for (int i = 0; i < count; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.printf("%.2f\t", avg[i]);
			System.out.printf("%d\t", rank[i]);
			System.out.println();
		}

	}

	// 성적수정---------------------------------------------------------
	static void scoreModify() {
		System.out.println("수정할 학생의 이름을 입력하세요");
		searchName = scan.next();

		// 수정할 학생
		chk = 0;
		for (int i = 0; i < count; i++) {
			// 수정하는 학생이 반복이 안되게
			if (name[i].equals(searchName)) {
				// 수정할 과목 선택
				System.out.println("[수정할 학생을 찾았습니다]");
				System.out.println("수정할 과목을 선택하세요");
				for (int j = 1; j < B ; j++) {
					System.out.print(j + ". " + title[j]);
					System.out.println();
				}
				System.out.println("-------------------------");
				System.out.println("수정할 과목 번호를 입력하세요");
				choice = scan.nextInt();

				// 수정할 과목 이전 점수 표시
				// title[i], i0~i2 (과목, 국영수), choice = 과목
				System.out.printf("[현재 %s 점수] :%d \n", title[choice], score[i][choice - 1]);
				System.out.println("--------------------------------------------------------");
				System.out.println("수정할 점수를 입력하세요");
				score[i][choice - 1] = scan.nextInt();

				// 합계, 평균 수정 i3, avg[i]
				score[i][3] = score[i][0] + score[i][1] + score[i][2];
				avg[i] = score[i][3] / 3.0;

				System.out.println("점수가 수정되었습니다.");
				System.out.println();
			}
		}

	}

	// 등수처리---------------------------------------------------------
	static void ranking() {
		for (int i = 0; i < count; i++) {
			rank[i] = i +1;
		}
		
		for (int i = 0; i < count; i++) {
			for (int j = i+1; j < count; j++) {
				if (score[i][3] < score[j][3]) {
					rank[i] = rank[j];
					rank[j] = i +1;
				}
			}
		}
		
		//등수를 기준으로 학생 목록을 정렬하기
		  for (int i = 0; i < count; i++) {
			    for (int j = i + 1; j < count; j++) {
			      if (rank[i] > rank[j]) {
			    	  
			    	//등수
			        int temp = rank[i];
			        rank[i] = rank[j];
			        rank[j] = temp;
			        
			        //이름
			        String tempName = name[i];
			        name[i] = name[j];
			        name[j] = tempName;
			        
			        //점수 국영수,합계
			        temp = score[i][0];
			        score[i][0] = score[j][0];
			        score[j][0] = temp;

			        temp = score[i][1];
			        score[i][1] = score[j][1];
			        score[j][1] = temp;

			        temp = score[i][2];
			        score[i][2] = score[j][2];
			        score[j][2] = temp;

			        temp = score[i][3];
			        score[i][3] = score[j][3];
			        score[j][3] = temp;

			        //평균
			        double tempAvg = avg[i];
			        avg[i] = avg[j];
			        avg[j] = tempAvg;
			      }
			    }
			  }

		
		System.out.println("[등수처리가 완료되었습니다]");
		System.out.println();
	}

	// 검색기능---------------------------------------------------------
	static void search() {
		for (int i = 0; i < count; i++) {
			if (name[i].contains(searchName)) { // 검색:contains
				// 이름이 출력
				System.out.print(name[i] + "\t");
				for (int j = 0; j < score[i].length; j++) {
					System.out.print(score[i][j] + "\t");
				}
				System.out.printf("%.2f\t", avg[i]);
				System.out.printf("%d\t", rank[i]);
				chk = 1;
			}
		}

		if (chk == 0) {
			System.out.println("[찾고자 하는 학생이 없습니다]");
		}
		System.out.println();

	}// class
}