// 12번 해결 안 됨

package j0526;

import java.util.Scanner;

public class C0526_12 {
    public static void main(String[] args) {
        String lotto = "48888";
        // 1-9조 00000 - 99999
        // 0-9 랜덤숫자를 맞추는 게임을 구현하시오
        // 입력 : 1

        // 랜덤 숫자 : int random
        // 입력 숫자 : int myNum
        // 당첨, 꽝을 출력하시오

        Scanner scan = new Scanner(System.in);
        int random = 0, myNum = 0;

        // 값 입력
        random = (int) (Math.random() * 99999);
        int temp = random; // 랜덤 숫자 임시 저장
        String randomStr = Integer.toString(random);
        int length = randomStr.length();
        StringBuilder hintBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            hintBuilder.append("*");
        }
        String hint = hintBuilder.toString();

        while (true) {
            System.out.println();
            System.out.println("값을 입력하세요");
            myNum = scan.nextInt();

            if (myNum == random) {
                System.out.println("당첨");
                break;
            } else if (myNum != random) {
                System.out.println("꽝");
                System.out.println();

                // 힌트1 : 랜덤숫자를 한자리씩 출력하세요
                // 랜덤숫자가 123456이라고 할 때 1***** 12**** 123*** 1234**
                int numDigits = (int) (Math.log10(random) + 1);
                for (int i = 0; i < numDigits; i++) {

                    System.out.println(randomStr.substring(0, i) + hint.substring(i));

                }
            }

            System.out.println("정답 : " + random);
        } // while

    }// main

}