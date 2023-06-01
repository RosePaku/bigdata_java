package stuProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StuMain {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		// List<Student> list = new Student<>();

		int choice = 0;
		StuProcess s = new StuProcess(); // 정보에 담는거 선언 1
		while (true) {

			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적삭제");
			System.out.println("5. 학생검색");
			System.out.println("6. 등수처리");
			System.out.println("7. 오름차순 정렬");
			System.out.println("8. 파일 읽어오기");
			System.out.println("9. 파일 저장하기");
			System.out.println("0. 프로그램 종료");
			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요");
			choice = scan.nextInt();

			switch (choice) {
				case 1:
					// 처리할 코드
					list = s.stuInput();
					System.out.println("학번 : " + list.get(0).getStuNo());
					System.out.println("이름 : " + list.get(0).getName());
					// System.out.println("국어 : " + kor);
					// System.out.println("영어 : " + eng);
					// System.out.println("수학 : " + math);
					break;
				case 2:
					// 처리할 코드
					break;
				case 3:
					// 처리할 코드
					break;
				case 4:
					// 처리할 코드
					break;
				case 5:
					// 처리할 코드
					break;
				case 6:
					// 처리할 코드
					break;
				case 7:
					// 처리할 코드
					break;
				case 8:
					// 처리할 코드
					break;
				case 9:
					// 처리할 코드
					break;
				case 0:

					break;

			}
		} // while
	}
}
// class