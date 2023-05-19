package j0519;

import java.util.Scanner;

public class Board {
    String[] saveBoard = new String[10];

    String[] save(String no, String title, String date, String name) {
        saveBoard[0] = no;
        saveBoard[1] = title;
        saveBoard[2] = date;
        saveBoard[3] = name;

        return saveBoard;

    }
}
