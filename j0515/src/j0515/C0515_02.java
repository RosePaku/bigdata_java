//주졔 : 보물찾기 프로그램
//출력값
//보물은 n개입니다. (기본값 3개)
// 0  1  2   3  4
// -------------------
// ?  ?   ?  ?  (10개)
// 번호 입력하세요
// 번호 입력해서 맞추면 보물 또는 꽝이라고 뜸



package j0515;

import java.util.Scanner;

public class C0515_02 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        // 상자 10개
        // int[] box = {0,0,0,0,0,0,0,0,0,1};
        int temp = 0, random = 0, input = 0, count1=0;
        String[] arr = new String[10];
        int[] box = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "?";
        }

        
        
        for (int i = 0; i < box.length; i++) {
            if (i < 7) { //7개는 0 나머지는 1  (1은 총 3개)
                box[i] = 0;
            } else {
                box[i] = 1;
                count1++;
            }

        }

        // 번호 섞기
        for (int i = 0; i < 100; i++) {
            random = (int) (Math.random() * 10);
            temp = box[0];
            box[0] = box[random];
            box[random] = temp;

        }

        while (true) {
            // 화면 출력
            System.out.println("[보물찾기 프로그램]");
            System.out.println("보물은"+count1+"개입니다");
            for (int i = 0; i < box.length; i++) {
                System.out.print(i + "\t");
            }

            // 번호출력
            System.out.println();
            System.out.println("--------------------");
            for (int i = 0; i < box.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();

            // 번호 입력
            System.out.println();
            System.out.println("번호 입력하세요");
            input = scan.nextInt();
            // 보물인지 아닌지 비교
            if (box[input] == 0) {
                arr[input] = "보물";
            } else
                arr[input] = "꽝";

        }//while

    }// main
}// class
