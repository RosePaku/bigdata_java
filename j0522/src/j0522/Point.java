package j0522;

/**
 * Data
 */
public class Point {
	int x, y; // 인스턴스 변수 - 객체선언후 참조변수명.변수명

	Point() { // 생성자 - 클래스명과 일치, void 없음.
		this(0, 0); // 다른생성자 호출
	}

	Point(int x, int y) { // 생성자 - 클래스명과 일치, void 없음.
		this.x = x; // this:인스턴스변수 x:지역변수-메소드 내
		this.y = y;

	}

}
