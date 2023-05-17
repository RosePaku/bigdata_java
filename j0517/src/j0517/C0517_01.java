package j0517;

public class C0517_01 {

	public static void main(String[] args) {
		// Card 클래스의 객체를 선언하고 생성합니다.
		Card c1 = new Card();
		
		// c1 객체의 kind, number, width 멤버 변수에 값을 할당합니다.
		c1.kind = "Heart";
		c1.number = 7;
		c1.width=500;
		c1.number = 25; // 이미 할당된 number 변수에 값을 덮어씁니다.
		
		// Card 클래스의 객체를 또 다른 참조 변수로 선언하고 생성합니다.
		Card c2 = new Card();
		
		// c2 객체의 kind, number 멤버 변수에 값을 할당합니다.
		c2.kind = "Spade";
		c2.number = 4;
		
		// Card 클래스의 객체를 또 다른 참조 변수로 선언하고 생성합니다.
		Card c3 = new Card();
		
		// c1 객체의 kind, number, width, height 멤버 변수의 값을 출력합니다.
		System.out.println("c1 카드종류 : "+c1.kind);
		System.out.println("c1 카드숫자 : "+c1.number);
		System.out.println("c1 가로길이 : "+Card.width);
		System.out.println("c1 세로길이 : "+Card.height);
		System.out.println("-----------------------");
		
		// c2 객체의 kind, number, width, height 멤버 변수의 값을 출력합니다.
		System.out.println("c2 카드종류 : "+c2.kind);
		System.out.println("c2 카드숫자 : "+c2.number);
		System.out.println("c2 가로길이 : "+Card.width);
		System.out.println("c2 세로길이 : "+Card.height);
		System.out.println("-----------------------");
		
		// c3 객체의 width 멤버 변수의 값을 출력합니다.
		System.out.println("c3 가로길이 : "+Card.width);

	}

}
