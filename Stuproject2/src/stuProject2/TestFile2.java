package stuProject2;

import java.io.FileWriter;
import java.util.Iterator;

public class TestFile2 {
	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 100, eng = 99, math = 90;
		System.out.printf("%s,%d,%d,%d \n", name, kor, eng, math);
		String data = String.format("%s,%d,%d,%d \n", name, kor, eng, math);
		System.out.println("문자열로 변수 저장 : " + data);
	}
}