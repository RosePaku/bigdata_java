package j0523;

public class Deck {
    // 52개 카드 생성
    Card[] c = new Card[52]; // 배열선언, 4종류 * 13 = 52장

    Deck() {
        for (int i = 0; i < 52; i++) {
            c[i] = new Card(); // 객체 선언
            c[i].kind = c[i].shape[i / 13]; // 0~0 /// 1~1
            c[i].number = (i % 13) + 1; // 1~13 // 1~~5
        }
    }

    Card pick(int index) {
        return c[index];
    }

    // 0~51
    /** 셔플 기능 */
    void shuffle() {
        for (int i = 0; i < 1000; i++) {
            int random = (int) (Math.random() * 51);
            Card temp = null;
            temp = c[0]; // new Card();
            c[0] = c[random];
            c[random] = temp;

        }

    }

}

// Deck() { // 기본생성자
// // kind =null, number= 0; // space1, space2, space3
// int k = 0;
// for (int i = 0; i < 4; i++) { // 모양
// for (int j = 0; j < 13; j++) { // 숫자
// // c[(13*i)+j] = new Card(Card.kinds[i],j+1);
// c[k] = new Card(card.shape[i], j + 1);
// k++;
// }
// }
// }