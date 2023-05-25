package j0525;

import java.util.ArrayList;

public class C0525_01 {

    public static void main(String[] args) {

        Card[] c = new Card[4];

        Card c1 = new Card(Card.kinds[0], 1);
        Card c2 = new Card(Card.kinds[1], 1);
        Card c3 = new Card(Card.kinds[2], 1);
        Card c4 = new Card(Card.kinds[3], 1);

        c[0] = c1;
        c[1] = c2;
        c[2] = c3;
        c[3] = c4;

        ArrayList<Card> list = new ArrayList();
        // ArrayList 추가
        list.add(c1); // 0 // Object o = new Card(Card.kinds[1],1)
        list.add(c2);
        list.add(c3);
        list.add(c4);

        // ArrayList 읽기
        // Card card = (Card) list.get(0); // 형변환 해주기

        // System.out.println(c1);

        // list.remove(2); // remove

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).kind + "," + list.get(i).number);
        }
        System.out.println("개수 : " + list.size());

        // HEART 삭제
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).kind.equals("HEART")) {
                list.remove(i);
            }
        }
        System.out.println();

        // 4번 삭제
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).number == 4) {
                list.remove(i);
            }
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).kind + "," + list.get(i).number);
        }
        System.out.println("개수 : " + list.size());

        System.out.println("--------------------");

        System.out.println("프로그램 종료");

    }
}