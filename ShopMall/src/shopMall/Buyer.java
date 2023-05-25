package shopMall;

import java.util.ArrayList;

public class Buyer {

	Buyer(){}
	Buyer(String id,String name,String nickName){
		this.id = id;
		this.name = name;
		this.nickName = nickName;
	}
	
	//배열
	//Product[] cart = new Product[10];
	//cart[0]=p;
	//Collection
	ArrayList<Product> list = new ArrayList();
	//cart[i] = p , list.add(p) : 객체추가   Object o = new Product();
	//cart[0]  ,  list.get(0) : 데이터 읽어오기
	// cart.length , list.size() : 총개수
	
	String id;
	String pw;
	String name;
	String nickName;
	
	int money=10000;
	int bonusPoint=0;
	
	void buyList() {
		System.out.print("구매목록 : ");
		for(int i=0;i<list.size();i++) {
			Product p = list.get(i); //Object
			if(i==0) 
				System.out.print(p.productName);
			else 
				System.out.print(","+p.productName);
		}
		System.out.println();
	}
	
	//Product p = new Tv();
	void buy(Product p) {
		
		if(money<p.price) {
			System.out.println("보유금액이 부족해서 상품을 구매할 수 없습니다.");
			return;
		}
		money =  money - p.price; // tv의 가격을 빼고 다시 money에 넣음.
		bonusPoint = bonusPoint + p.bonusPoint; //현재 보너스에 추가해서 다시 보너스에 넣음.
		System.out.println("구매 : "+p.productName);
		list.add(p); //list에 데이터 추가
	}
	
}

    // void buy(Product p) { // 다형성 굉장히 중요
    // 이 한줄로 아래의 줄을 표현 가능

    // // Product c = new Computer();
    // void buy(Computer c) {
    // money = money - c.price; // tv의 가격을 빼고 다시 money에 넣음
    // bonusPoints = bonusPoints + c.bonusPoint; // 현재 보너스에 보너스 더하기
    // }

    // void buy(Speaker s) {
    // money = money - s.price; // tv의 가격을 빼고 다시 money에 넣음
    // bonusPoints = bonusPoints + s.bonusPoint; // 현재 보너스에 보너스 더하기
    // }

    // void buy(Washer w) {
    // money = money - w.price; // tv의 가격을 빼고 다시 money에 넣음
    // bonusPoints = bonusPoints + w.bonusPoint; // 현재 보너스에 보너스 더하기
    // }

