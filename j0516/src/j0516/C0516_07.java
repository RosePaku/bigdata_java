package j0516;

import java.util.Scanner;

public class C0516_07 {
	static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
	
	public static void main(String[] args) {
//		Student s = new Student;
//		C0516_07 c = new C0516_07();
		
        Scanner scan = new Scanner(System.in);
        int choice = 0, count = 0, input = 0; //선택번호, 성적입력 학생수
        int chk = 0; //성적입력 학생수
        String searchName =""; //검색이름
        

		Student[] s = new Student[10]; // Student 참조변수배열 10개 생성
		s[0] = new Student(); // 객체 선언


        while (true) {

			
			input = scan.nextInt();

            switch (choice) {
// 입력
case 1:
for (int i = count; i < s.length; i++) {
    s[i] = new Student(); // 객체선언
    System.out.println("이름을 입력하세요 0)이전 페이지로 돌아갑니다 ");
    s[i].name = scan.next();

    // 이전페이지
    if (s[i].name.equals("0")) {
        System.out.println("이전 페이지로 돌아갑니다.");
        System.out.println();
        break;
    }
    // 국,영,수
    System.out.println("국어점수 입력");
    s[i].kor = scan.nextInt();
    System.out.println("영어점수 입력");
    s[i].eng = scan.nextInt();
    System.out.println("수학점수 입력");
    s[i].math = scan.nextInt();
    
    // 합계 // 평균
    s[i].sum(); s[i].average();
    
    


    // for (int j = 0; j < B - 1; j++) {
    //     System.out.println(title[j + 1] + "점수를 입력하세요");
    //     score[i][j] = scan.nextInt();
    //     score[i][3] = score[i][3] + score[i][j];
    // }
    // avg[i] = score[i][3] / 3.0;
    // count++;
} // for 이름

break;
            }

        }

	}//main
	static void screen() {
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 등수 출력");
		System.out.println("5. 학생 검색");
		System.out.println("0. 프로그램 종료");
		System.out.println("번호를 입력하세요");
	}
	
    
}// class