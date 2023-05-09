package j0509;

import java.util.Scanner;

public class Class0509_03 {

	public static void main(String[] args) {
		double kor = 0;
		int eng = 98;
		int math = 100;
		String name = "";
		
		//데이터 입력 - 화면에서 입력을 받겠다.
		Scanner scan = new Scanner(System.in); 
		System.out.println("이름을 입력하세요");
//		name = scan.next(); //너무 좋아요 (부분만 입력 받음)
		name = scan.nextLine(); // 너무 좋아요 함께 해요. (전체 다 입력 받음)
		System.out.println("국어점수를 입력하세요");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = scan.nextInt();
		
		
		
//		String str = new String("aaa");
//		String str2 = "aaa";
//		java.util.Scanner
		
		double total = kor+eng+math;
		double avg = total/3.0;
		System.out.println("--------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t합계짱짱\t\t평균");
		System.out.printf("%s\t%.1f\t%d\t%d\t%f\t%.2f \n",name,kor,eng,math,total,avg);
		System.out.println("--------------------------------------------");

		
	}

}
