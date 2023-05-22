package j0522;

import java.util.Scanner;

public class C0522_09 {
	// 객체선언후
	// serialNo=
	static Product p1 = new Product();

	// serialNo = 2
	static Product p2 = new Product();

	static Product p3 = new Product();

	// int count = 0;
	// int serialNo = 0;
	// 초기화블럭 : count = 1; serialNo = 1;
	// 생성자 :
	public static void main(String[] args) {
		System.out.println("p1.serialNo : " + p1.serialNo);
		System.out.println("p2.serialNo : " + p2.serialNo);
		System.out.println();
		System.out.println("p1.count : " + Product.count);
		System.out.println("p2.count : " + Product.count);
		System.out.println();
		System.out.println("p3.serialNo : " + p3.serialNo);
		System.out.println("p3.count : " + Product.count);

		// count에 대한 p1,p2,p3 주소값은 사실상 Product와 같다.
	}
}
