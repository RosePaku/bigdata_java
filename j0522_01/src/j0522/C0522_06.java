package j0522;

import java.util.Scanner;

public class C0522_06 {

	public static void main(String[] args) {
		// Car-기본생성자 사용 : color,gearType,door 출력
		Car c = new Car();
		System.out.println(c.color);
		System.out.println(c.gearType);
		System.out.println(c.door);

		// 매개변수가 있는 생성자사용 red auto 5출력하시오.
		// 객체선언
		Car c2 = new Car("red", "auto", 5);
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);

		// 참조변수 선언
		Car c3 = null;

		// 복사기능
		c3 = c2;
		c3.color = "blue";

		System.out.println("c2 : " + c2.color);
		System.out.println("c3 : " + c3.color);

	}
}