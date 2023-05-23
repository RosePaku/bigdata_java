package stuProject;
import java.util.Scanner;

public class StuMain {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice = 0;
		int count = 0; //학생수
		String name="";
		int kor=0,eng=0,math=0;
		Student[] s = new Student[10]; //배열선언
		//s[0] = new Student(); //객체선언
		
		//무한반복
		while(true) {
			System.out.println("[ 학생성적처리 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			//프로그램 종료확인
			if(choice==0) {
				System.out.println("[ 프로그램을 종료합니다. ]");
				System.out.println();
				break;
			}
			
			switch(choice) {
			case 1: //성적입력
				// 성적입력 프로그램부분 호출
				count = stuInput(count,s); //메소드 분리
				break; //switch
			
			}//switch
			
		}//while
	}//main
	
	//다른메소드 선언 - 리턴타입 메소드명(매개변수){      }
	static int stuInput(int count,Student[] s) {
		//학생입력
		String name="";
		int kor=0,eng=0,math=0;
		
		for(int i=count;i<s.length;i++) {
			System.out.println((i+1)+"번째 이름을 입력하세요.(0.이전페이지 이동)");
			name = scan.next();
			//이전페이지 이동확인
			if(name.equals("0")) {
				System.out.println("[ 이전페이지로 이동합니다. ]");
				System.out.println();
				break;
			}
			System.out.println("국어점수를 입력하세요.");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math = scan.nextInt();
			s[i] = new Student(name,kor,eng,math);
			count++;
		}//for
		
		return count;
	}//stuInput
	
	
	

}//class