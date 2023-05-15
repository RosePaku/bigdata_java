//2차원 배열 출력 (자동 번호 입력, 번호 출력) (범위4,3)
//1 2 3
// .....
//10 11 12
//---------

package j0515;

import java.util.Scanner;

public class C0515_04 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // 2차원 배열
        // [4][3] 배열
        int[][] box = new int[4][3];

        // 번호입력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                box[i][j] = (3 * i) + (j + 1);
            }
        }

        // 번호출력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(box[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------");

    }// main
}// class