package j0515;

import java.util.Iterator;
import java.util.Scanner;

public class C0515_10 {
    // 10개의 숫자를 입력받아 합계를 출력하시오.
    public static void main(String[] args) {
        // 국어,영어,수학 합계 평균 출력
        // 1. 성적 입력
        // 2. 성적 출력
        // 3. 성적 수정
        // 4. 등수처리
        // 5. 학생검색
        // 0. 프로그램종료

        Scanner scan = new Scanner(System.in);
        // 이름,국영수,합계,평균 - 10명
        int input = 0, count = 0;
        String modifyName = "";
        String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
        String[] name = new String[2];
        int[][] score = new int[10][4];
        double[] avg = new double[2];

        while (true) {

            // 화면출력
            System.out.println("[성적처리프로그램]");
            System.out.println("1. 입력");
            System.out.println("2. 출력");
            System.out.println("3. 수정");
            System.out.println("4. 종료");

            System.out.println("원하는번호를 입력하세요");
            input = scan.nextInt();
            if (input == 0)

            {
                System.out.println("종료합니다.");
                break;
            }

            // 3 조건문
            switch (input) {

                case 1:

                    // 학생 수 만큼 반복
                    for (int i = count; i < name.length; i++) {

                        System.out.println((count + 1) + "번째 이름을 입력하세요 \n(0을 누르면 종료합니다.)");
                        name[i] = scan.next();
                        if (name[i].equals("0")) {
                            System.out.println("이전 화면으로 이동합니다");
                            break;
                        }
                        for (int j = 0; j < 3; j++) {
                            System.out.println(title[j + 1] + "점수를 입력하세요.");
                            score[i][j] = scan.nextInt();
                            score[i][3] = score[i][3] + score[i][j]; // 합계에 대한 부분
                        }

                        // 자동 성적
                        avg[i] = score[i][3] / 3.0;
                        count++; // 1이라는 학생부터 입력함 // 나왔다 들어갔다가
                    }
                    break;

                case 2:

                    for (int i = 0; i < title.length; i++) {
                        System.out.print(title[i] + "\t");
                    }
                    System.out.println("\n-------------------------------------------------");
                    for (int i = 0; i < count; i++) {
                        System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f \n", name[i], score[i][0], score[i][1], score[i][2],
                                score[i][3], avg[i]);

                    }
                    break;

                case 3:

                    System.out.println("수정할 학생 이름을 입력하세요.");
                    modifyName = scan.next();

                    int chk = 0; // 찾을 학생이 없을 경우 0, 있으면 1
                    for (int i = 0; i < count; i++) {
                        if (name[i].equals(modifyName)) {
                            System.out.println("[수정과목 선택]");
                            System.out.println("-----------------");
                            System.out.println("1. 국어");
                            System.out.println("2. 영어");
                            System.out.println("3. 수학");
                            System.out.println("수정할 과목을 선택하세요.");
                            input = scan.nextInt();
                            chk = 1; // 찾는 학생이 있을 경우 1로 변경

                            switch (input) {
                                case 1:
                                    System.out.println("현재 국어 점수 : " + score[i][0]);
                                    System.out.println("변경할 점수를 입력하세요");
                                    input = scan.nextInt();
                                    score[i][0] = input;
                                    System.out.println("[수정 완료 !!]");

                                    score[i][3] = score[i][0] + score[i][1] + score[i][2]; // 합계에 대한 부분

                                    System.out.println();
                                    avg[i] = score[i][3] / 3.0;

                                    break;

                                case 2:

                                    break;
                                case 3:

                                    break;

                            }// switch

                        } // if문
                    } // for _수정입력

                    // chk
                    if (chk == 0) {
                        System.out.println("[찾는 학생이 없음!]");
                        System.out.println("찾는 학생이 없습니다. 다시 입력해 주세요.");
                        System.out.println();
                    }
                    break;
            }// switch
        } // while
    }// class
}// main