package j0523;

public class C0523_02 {
    public static void main(String[] args) throws Exception {
        // Card[] c = new Card[52];
        // String[] kind = new String[52];
        // int[] number = new int[52];
        // Space,Heart,Diamond,Clover
        // 입력
        // for (int i = 0; i < 52; i++) {
        // c[i] = new Card(); // 객체 선언
        // c[i].kind = c[i].shape[i / 13]; // 0~0 /// 1~1
        // c[i].number = (i % 13) + 1; // 1~13 // 1~~5
        // }

        Deck d = new Deck();
        d.shuffle();

        // 카드뽑기 메소드 = d.pick(번호)
        // System.out.printf("%s, %d \n", d.pick(51).kind, d.pick(0).number);

        // 출력하세요
        for (int i = 0; i < 52; i++) {
            System.out.printf("%s, %s \n", d.c[i].kind, Card.numbers[d.c[i].number]);
        }

        // d.pick(5);

        // System.out.println(d.pick(51).kind);

    }
}

// for (int i = 0; i < 52; i++) {
// System.out.print(c[i].kind);
// System.out.print(c[i].number);
// System.out.println();
// }
// for (int i = 0; i < 52; i++) {
// System.out.print(c[i].kind);
// System.out.print(c[i].number);
// System.out.println();
// }