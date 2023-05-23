package j0522;

public class Circle extends Shape {

	// 다른 클래스를 사용하려면 객체선언후 참조변수명.변수명
	Point center; // 참조변수를 받을수 있는 주소변수만 존재
	int r; // 인스턴스변수 - 객체선언후 참조변수명.변수명

	Circle() { // 생성자 - 클래스명과일치,void없슴.
		this(new Point(0, 0), 100); // this():다른생성자 호출
	}

	Circle(Point center, int r) { // 생성자
		this.center = center; // this:인스턴스변수 호출
		this.r = r;
	}

	// void draw() {
	// System.out.println();
	// }

}// Circle