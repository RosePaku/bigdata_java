package j0519;

import java.util.Scanner;

public class C0519_06 {
    public static void main(String[] args) {
        // String[] saveBoard = new String[10];

        String no = "1";
        String title = "홈페이지 오픈";
        String date = "2023-05-19";
        String name = "홍길동";

        // 객체선언
        Board b = new Board();
        String[] saveBoard = b.save(no, title, date, name);

        for (int i = 0; i < saveBoard.length; i++) {
            System.out.println(saveBoard[i] + " ");
        }

        // 버스의 역할
        b.save(no, title, date, name);

    }
}