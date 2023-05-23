package j0522;

// 삼각형 - 점이 3개가 필요
public class Triangle extends Shape {
	Point[] p; // 인스턴스 변수 - 삼각형을 이루는 점들을 저장하는 배열

	Triangle(Point[] p) { // 점 배열을 입력받는 생성자
		this.p = p; // 인스턴스 변수에 점 배열 할당
	}

	Triangle() {
	} // 기본 생성자

	Triangle(Point p1, Point p2, Point p3) { // 점 3개를 입력받는 생성자
		p = new Point[] { p1, p2, p3 }; // 점 배열에 주어진 점들을 할당
	}
}
