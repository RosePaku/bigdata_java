//로또 출력프로그램
// 입력창
// ~번째 번호를 입력하세요
// 결과창
// 로또번호,입력번호, 맞춘 번호, 맞춘 개수 출력
package j0515;

import java.util.Scanner;

public class C0515_01 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int random = 0, temp=0, count=0;
        int[] myNum = new int[6]; // 입력번호
        int[] lottoNum = new int[6]; // 당첨번호

        //배열 - 45개 생성
        int[] arr = new int[45]; // 로또번호


        for (int i = 0; i < 45; i++) {
            arr[i] = i+1;
        }

        //섞기
        for (int i = 0; i < 1000; i++) {
            random = (int) (Math.random() * 45);
            temp = arr[0];
            arr[0] = arr[random]; 
            arr[random] = temp;

        }
        
        //번호 입력 - 6개
        for (int i = 0; i < myNum.length; i++) {
            System.out.println((i+1)+"번째 번호를 입력하세요.");
            myNum[i] = scan.nextInt();
        }

        //맞춘 개수출력
        for (int i = 0; i < myNum.length; i++) {
            for (int j = 0; j < myNum.length; j++) {
                if (arr[i] == myNum[j]) {
                    lottoNum[count] = arr[i];
                    count++;
                    continue;
                }
            }
        }

        //로또번호 출력
        System.out.println("로또번호 출력 : ");
        for (int i = 0; i < myNum.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        //입력번호 출력
        System.out.println("입력번호 출력 : ");
        for (int i = 0; i < myNum.length; i++) {
            System.out.print(myNum[i]+"\t");
        }
        System.out.println();

        //로또번호 출력
        System.out.println("맞춘번호 출력 : ");
        for (int i = 0; i < count; i++) {
            System.out.print(lottoNum[i]+"\t");
        }
        System.out.println();

        System.out.println("맞춘 개수 : "+count);
    }// main
}// class
