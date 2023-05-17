package j0517;

import java.util.Scanner;

public class C0517_06 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : " + d.x);

		System.out.println("------------");
		change(d.x);
		System.out.println("change d.x : " + d.x);

	}

	static void change(int x) { //void라고 적으면 안돌려준다는 이야기 
		x = 1000;
		System.out.println("x : " + x);
	}

}
