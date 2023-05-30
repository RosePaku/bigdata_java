package j0530;

import java.util.Scanner;

public class C0530_03 {
    // 소문자 대문자 출력. a = 97, A=65, 0=48
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("소문자 입력하세요");
        // char input = scan.next().charAt(0);
        // System.out.println("입력한 문자 : " + input);
        // char output = (char) (input - 32); // char+int = int+int = int 형변환 ->char
        // System.out.println("대문자 : " + output);

        // 소문자 -> 대문자, 대문자->소문자 출력하시오

        // 입력된 문자 1개를 치환
        // System.out.println("[소문자 -> 대문자 // 대문자 -> 소문자 변환]");
        // System.out.println("영문자를 입력하세요");
        // char input1 = scan.next().charAt(0);

        // if ('a' <= input1 && input1 <= 'z') {
        // char output1 = (char) (input1 - 32); // 소문자 출력
        // System.out.println("입력한 소문자 : " + input1);
        // System.out.println("소문자 -> 대문자 : " + output1);
        // } else if ('A' <= input1 && input1 <= 'Z') {
        // char output2 = (char) (input1 + 32); // 대문자 출력
        // System.out.println("입력한 대문자 : " + input1);
        // System.out.println("대문자 -> 소문자 : " + output2);
        // } else
        // System.out.println("숫자가 아닙니다. 종료합니다.");

        // 입력된 문자들을 치환
        System.out.println("[문자형 치환 프로그램]");
        System.out.println("영문자를 입력하세요");
        String input1 = scan.next();
        String output = "";
        char temp = ' ';
        for (int i = 0; i < input1.length(); i++) {
            temp = input1.charAt(i);

            if ('a' <= temp && temp <= 'z') {
                output += (char) (temp - 32); // 소문자 출력
                // System.out.println("입력한 소문자 : " + temp);
                // System.out.println("소문자 -> 대문자 : " + output1);
            } else if ('A' <= temp && temp <= 'Z') {
                output += (char) (temp + 32); // 대문자 출력
                // System.out.println("입력한 대문자 : " + input1);
                // System.out.println("대문자 -> 소문자 : " + output2);
                // System.out.print("입력한 문자 : " + temp);
                // System.out.print("변환한 문자 : " + output);

            }
        }
        System.out.print("입력한 문자 : " + temp);
        System.out.print("출력한 문자 : " + output);
        // System.out.print(temp);
        // System.out.print(output);

    }
}
