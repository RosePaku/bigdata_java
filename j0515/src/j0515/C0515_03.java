//주졔 : 보물찾기 프로그램
//출력값
//1억 보물은 n개입니다. (기본값 1개)
//10억 보물은 n개입니다. (기본값 1개)
// 0  1  2   3  4
// -------------------
// ?  ?   ?  ?  (10개)
// 번호 입력하세요
// 번호 입력해서 맞추면 보물 또는 꽝이라고 뜸
// 1억보물, 10억보물 1개씩

package j0515;

import java.util.Scanner;

public class C0515_03 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        //10개 중 2개의 보물을 찾기 프로그램을 구성하시오.
        //box배열 10개
        //arr배열 10개
        //섞기 temp, random
        //scna 입력 -> input
        //while - 무한반복
        //화면출력 - arr출력, 번호출력
        //꽝 - 0 1억보물 - 1 10억보물 - 2
        int[] box = {0,0,0,0,0,0,0,0,1,2}; //번호를 맞추기 위한 배열
        String[] arr = {"?","?","?","?","?","?","?","?","?","?"};
        int input = 0; // 입력받은 번호 변수

        int temp = 0;
        int random = 0;

        //box번호 섞기
        for (int i = 0; i < 100; i++) {
            random = (int)(Math.random() * 10);
            temp = box[0];
            box[0] = box[random];
            box[random] = temp;
        }

        //무한반복

        while (true) {
            //타이틀
            System.out.println("[보물찾기 프로그램]");
            //번호출력
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i+"\t");
            
            }
            System.out.println();
            //밑줄
            System.out.println("------------------------------------");
            //정답화면 출력
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");    
            }
            System.out.println();
            System.out.println("번호를 입력하세요.>>");
            input = scan.nextInt(); 

            //입력된 번호가 보물인지 비교 box배열 0,1,2
            if (box[input] == 0) {
                arr[input] = "꽝";
            }else if (box[input] == 1) {
                arr[input] = "1억보물";
            } else {
                arr[input] = "10억보물";
            }

        }//while문


    }// main
}// class
