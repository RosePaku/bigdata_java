package j0525;

public class Card {
    Card() {
        this(kinds[0], 1); // SPACE, 1
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    static String[] kinds = { "SPACE", "HEART", "DIAMOND", "CLOVER" };
    static String[] numbers = { "0", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
  
    String kind;
    int number;
}
