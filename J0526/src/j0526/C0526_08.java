// 찾는 문자 반복 (없으면 종료)

package j0526;

import java.util.Scanner;

public class C0526_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "안녕하세요. 반갑습니다. 좋은 하루 되세요. 오늘 불금요 완전 좋음요";
        int count = 0, searchNum = -1; // 찾는 문자 개수, 찾는 문자 위치

        System.out.println("찾고자 하는 문자를 입력하세요");

        // 교수님이 짠거
        while (true) {
            String search = scan.next();
            searchNum = str.indexOf(search, searchNum + 1); // 찾는 위치 메소드
            if (searchNum != -1) {
                System.out.println("찾는 문자 위치 : " + searchNum);
                count++;
            } else {
                System.out.println("더 이상 찾는 문자가 없습니다.");
                break;
            }
        }

        System.out.println("=====================");
        System.out.println("찾은 문자 개수 : " + count);
        System.out.println("종료합니다.");

        // 내가 짠거
        // while (true) {
        // String search = scan.next();
        // int index = str.indexOf(search, 0);

        // if (str.indexOf(search, 0) == -1) {
        // System.out.println("찾는 문자가 없습니다. 종료합니다 ");
        // break;

        // } else {
        // System.out.println("찾는 문자: " + search);
        // System.out.println("첫 번째로 나타나는 위치 : " + index);
        // count++;
        // }

        // } // while

    }// main
}// clas
