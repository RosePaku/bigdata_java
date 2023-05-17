package j0517;

import java.util.Scanner;

public class C0517_07 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        t1.channel = 7;
        System.out.println("Tv t1 채널" + t1.channel);

        t2.channel = 8;
        System.out.println("Tv t2 채널" + t2.channel);

        t2 = t1;
        System.out.println("t2 채널" + t2.channel);

        t2.channel = 0;
    }
}