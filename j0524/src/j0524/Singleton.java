package j0524;

public class Singleton {

	private static int num;

	// 같은 클래스 내에서만 s를 사용할수 있음
	private static Singleton s = new Singleton();

	private Singleton() {
		num = 10;
	}

	// getInstance 메소드 - 리턴타입:Singleton클래스
	static Singleton getInstance() {
		if (s == null) {
			s = new Singleton(); // 객체선언을 다시 함.
		}
		return s;
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Singleton.num = num;
	}

}
