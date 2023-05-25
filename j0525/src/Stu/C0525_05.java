package Stu;

public interface C0525_05 {

	public static void main(String[] args) {
		// A 객체를 생성합니다.
		A a = new A();

		// A 객체의 methodA 메서드를 호출하고, SuperB 객체를 인자로 전달합니다.
		a.methodA(new PlusB());
	}
}