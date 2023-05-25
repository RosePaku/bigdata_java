package j0525;

import java.util.ArrayList;

public class C0525_02 {

    public static void main(String[] args) {
        ArrayList<Card> list = new ArrayList<>();
        // Card c1 = new Card(Card.kinds[0], 1);
        // Card c2 = new Card(Card.kinds[0], 2);
        // Card c3 = new Card(Card.kinds[0], 3);
        // list.add(new Card(Card.kinds[0], 1));
        // list.add(new Card(Card.kinds[0], 2));
        // list.add(new Card(Card.kinds[0], 3));

        // 퀴즈1 1,13
        // for (int i = 1; i < 14; i++) {
        // list.add(new Card(Card.kinds[0], i));
        // }

        // for (int i = 0; i < list.size(); i++) {
        // // System.out.println(list.get(i).kind + "," + list.get(i).number);
        // System.out.println(list.get(i).kind + "," +
        // Card.numbers[list.get(i).number]);
        // }

        // // 퀴즈2 - 카드 4개 만들고, 4가지 종류 넣기 (숫자 무조건 1)
        // for (int i = 0; i < 4; i++) {
        // // for (int j = 1; j < 14; j++) {
        // list.add(new Card(Card.kinds[i], 1));
        // // }
        // }

        // for (int i = 0; i < 4; i++) {
        // // for (int j = 1; j < 14; j++) {
        // System.out.println(list.get(i).kind + "," + list.get(i).number);
        // // }
        // }

        // 퀴즈 3 - 카드 52 만들기 // 각 13개씩
        // %13을 사용하여
        for (int i = 0; i < 52; i++) {
            list.add(new Card(Card.kinds[i / 13], (i % 13) + 1));

        }

        for (int i = 0; i < 52; i++) {
            System.out.println(list.get(i).kind + "," + list.get(i).number);

        }

    }
}