package j0522;

import java.util.Scanner;

public class C0522_11 {
	public static void main(String[] args) {
		// Circle 객체 선언
		Circle c1 = new Circle(); // 원 객체 c1 생성
		Point center = new Point(150, 150); // 중심점 좌표 (150, 150)
		Circle c2 = new Circle(center, 50); // 중심점 (150, 150), 반지름 50인 원 객체 c2 생성

		int[] x = { 1, 2, 3 }; // 정수 배열 x 선언과 초기화 [1, 2, 3]
		int y = 10; // 정수 변수 y 선언과 초기화 10

		Point[] p = { new Point(100, 100), new Point(140, 50), new Point(100, 100) };
		// 점 객체 배열 p 선언과 초기화
		// 점1: (100, 100), 점2: (140, 50), 점3: (100, 100)

		Triangle t1 = new Triangle(p); // p 배열을 사용하여 삼각형 객체 t1 생성

		Triangle t2 = new Triangle(p[0], p[1], p[2]); // p 배열의 첫 번째, 두 번째, 세 번째 요소를 사용하여 삼각형 객체 t2 생성
	}
}
