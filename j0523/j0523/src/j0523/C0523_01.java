package j0523;

public class C0523_01 {
    public static void main(String[] args) throws Exception {
        Deck d = new Deck();
        // Card[] c = new Card[52];

        // d.c[0].shape;
        System.out.printf("%s,%d", d.c[0].number, d.c[1].number);
        System.out.println(d.c[0].shape);
        System.out.println(d.c[0].number);
        System.out.println(d.c[1].shape);
        System.out.println(d.c[1].number);

        System.out.println();
        for (int i = 0; i < d.c.length; i++) {
            System.out.print(d.c[i]);
            System.out.println();

        }

        for (int i = 0; i < d.c.length; i++) {
            System.out.println(d.c[i].shape);
            System.out.println();

        }

    }

}

// int a = 0;
// System.out.println(a);
// int[] arr = { 1, 2, 3, 4, 5 };
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");

// }

// // 구구단
// for (int i = 1; i < 10; i++) {
// for (int j = 1; j < 10; j++) {
// System.out.println(i + "" + "*" + j + "=" + i * j);
// }
// System.out.println();
// }