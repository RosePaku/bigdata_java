// 5,5배열을 만드는데 1-25까지랜덤으로 섞어서 출력하시오
// 출력값
// 0 1 2 3 4
//----------------
// 0| random 숫자 (05개)
// 1| random 숫자 (5개)
// 2| random 숫자 (5개)
// 3| random 숫자 (5개)
// 4| random 숫자 (5개)
//----------------
// 좌표를 입력하면 X표시로 뜸
// 예 01 입력시 box[0][1]에 숫자가 X로 표시



//*좌표입력값
//			//좌표입력
//			System.out.println("좌표를 입력하세요.>>");
//			input = scan.next();   //42
//			
//			// x표시 넣기 - char를 int형 변환
//			int no1 = input.charAt(0)-'0'; //첫째자리 4 - a:97 A:65 0:48 '3'-'0'=3
//			int no2 = input.charAt(1)-'0'; //둘째자리 2
//			box[no1][no2] = "x";
// 출력값 04와 동일







package j0515;

import java.util.Scanner;

public class C0515_06 {
    public static void main(String[] args) {
    	// 5,5배열을 만드는데 1-25까지 랜덤으로 섞어서 출력하시오
    	
        Scanner scan = new Scanner(System.in);
        int temp = 0;
        int random = 0;
        String input = ""; // 좌표입력받음
        String[][] box = new String[5][5];
        // String[][] arr = new String[5][5];
        int[] num = new int[25];
        // 1~25까지 숫자입력
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }
        
        // 1차원배열을 섞기 (100번)
        for (int i = 0; i < 100; i++) {
            random = (int) (Math.random() * 25);
            temp = num[0];
            num[0] = num[random];
            num[random] = temp;
        }

        // 1차원배열 값을 2차원 배열에 넣기 배열 5개5개
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                box[i][j] = "" + num[5 * i + j];
            }
        }

        // 무한반복 출력
        while (true) {
            // 상단번호출력
            System.out.print(" " + "\t");
            for (int i = 0; i < 5; i++) {
                System.out.print(i + "\t");
            }

            System.out.println();
            System.out.println("--------------------------------------------");

            // box번호출력
            for (int i = 0; i < 5; i++) {
                System.out.print(i + "|\t");
                for (int j = 0; j < 5; j++) {
                    System.out.print(box[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();

            // 좌표입력
            System.out.print("좌표를 입력하세요.>> 예) 01");
            input = scan.next();
            
         // 입력값의 길이가 2가 아닌 경우 오류 출력 후 다시 입력받기
            if (input.length() != 2) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }
            
            // x표시 넣기 - char를 int형 변환 // 배열을 지정하면 X표시가 됨.
            int no1 = input.charAt(0) - '0'; //첫째자리 4 - a:97 A:65 0:48 '3'-'0'=3
            int no2 = input.charAt(1) - '0'; //둘째자리 2
            box[no1][no2] = "X";

        } // while문

    }// main
}// class