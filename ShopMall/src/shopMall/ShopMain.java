package shopMall;

import java.util.Scanner;

public class ShopMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        Buyer b = new Buyer("hong", "홍길동", "길동스");
        Tv t = new Tv();
        Speaker s = new Speaker();
        Computer c = new Computer();
        Washer w = new Washer();

        while (true) {
            System.out.println("[삼성 쇼핑몰]");
            System.out.println("1. QLED TV 70인치 : " + t.price + "원");
            System.out.println("2. 갤럭시 북 : " + c.price + "원");
            System.out.println("3. 홈 미니 스피커 : " + s.price + "원");
            System.out.println("4. 그랑데 세탁기 : " + w.price + "원");
            System.out.println("5. 현재까지 구매한 제품");
            System.out.println("0. 종료");
            System.out.println("-------------------------");
            System.out.println("구매하실 제품의 번호를 고르세요");
            choice = scan.nextInt();
            // id,pw

            switch (choice) {
                case 1:
                    // Tv t = new Tv();
                    b.buy(new Tv());

                    break;

                case 2:
                    // Computer c = new Computer();
                    b.buy(new Computer());

                    break;

                case 3:
                    // Computer c = new Computer();
                    b.buy(new Speaker());

                    break;

                case 4:
                    // Computer c = new Computer();
                    b.buy(new Washer());

                    break;

                case 5:
                    for (int i = 0; i < b.list.size(); i++) {
                        if (b.list.get(i) == null) {
                            continue; // 제품 할당 되지 않으면 건너뛰기
                        }

                        boolean isDuplicate = false;
                        for (int j = 0; j < i; j++) {
                            if (b.list.get(i).productName.equals(b.list.get(j).productName)) {
                                isDuplicate = true;
                                break;
                            }

                        }
                        if (!isDuplicate) {
                            System.out.print(b.list.get(i).productName);
                        }

                    } // for문 마지막

                    break;

            }
            System.out.println();
            System.out.println("현재 잔액 : " + b.money);
            System.out.println("구매개수 : " + b.list.size()); // b.count

        } // while
          // Class Washer 그랑데 세탁기 120, 12, 10

    }// main

}// class

// System.out.println("nickName: " + b.nickName);
// System.out.println("name : " + b.name);