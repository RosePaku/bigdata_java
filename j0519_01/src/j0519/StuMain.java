package j0519;

import java.util.Scanner;

public class StuMain {
    static Scanner scan = new Scanner(System.in);
    static int input = 0, count = 0;
    static int A = 2, B = 4;

    static String[] name = new String[A];
    static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
    static int[][] score = new int[A][B];
    static double[] avg = new double[A];
    static int[] rank = new int[A];

    // static static static static

    public static void main(String[] args) throws Exception {

        loop: while (true) {
            System.out.println();
            System.out.println("[성적 입력 프로그램]");
            System.out.println("1. 성적입력");
            System.out.println("2. 성적출력");
            System.out.println("3. 성적수정");
            System.out.println("4. 등수처리");
            System.out.println("5. 학생검색");
            System.out.println("0. 종료");
            System.out.println("-------------------------");
            System.out.println("[번호를 입력하세요]");

            input = scan.nextInt();

            switch (input) {

                case 1:
                    scoreInput();

                    break;

                case 2:
                    scoreOutput();
                    break;

                case 3:
                    scoreFix();
                    break;

                case 4:
                    rank();
                    break;

                case 5:
                    searchStu();
                    break;

                case 0:
                    System.out.println("종료합니다.");
                    break loop;

            }// switch

        } // while

    }// main

    static void scoreInput() { // 입력

        // 이름
        for (int i = 0; i < name.length; i++) {
            System.out.println((i + 1) + "번째 학생의 이름을 입력하세요");
            name[i] = scan.next();
            // 점수 입력 (국영수)
            for (int j = 0; j < 3; j++) {
                System.out.println(title[j + 1] + "점수를 입력하세요");
                score[i][j] = scan.nextInt();
                // 합계, 평균
            }
            score[i][3] = score[i][0] + score[i][1] + score[i][2];
            avg[i] = score[i][3] / 3.0;

        }

    }

    // 출력
    static void scoreOutput() {
        // 타이틀
        for (int i = 0; i < title.length; i++) {
            System.out.print(title[i] + "\t");
        }
        System.out.println();
        System.out.println("------------------------------------------------------");

        // 이름
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + "\t");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t");
            }
            System.out.print(avg[i] + "\t");
            System.out.print(rank[i] + "\t");
            System.out.println();

        }

    }

    static void scoreFix() {
        // 학생 성적 수정

        System.out.println("성적을 수정할 학생의 이름을 입력하세요");
        String studentName = scan.next();

        System.out.println("수정할 과목을 선택하세요");
        System.out.println("1. 국어");
        System.out.println("2. 영어");
        System.out.println("3. 수학");

        int subject = scan.nextInt();

        System.out.println("새로운 점수를 입력하세요");
        int newScore = scan.nextInt();

        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(studentName)) {
                score[i][subject - 1] = newScore;
            }
        }

    }//

    static void rank() {
        // 등수처리
        for (int i = 0; i < name.length; i++) {
            rank[i] = 1; // 모든 학생의 등수를 1로 초기화
        }

        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name.length; j++) {
                if (score[i][3] < score[j][3]) {
                    rank[i]++; // 합계가 더 작은 학생이 있으면 등수를 1 증가시킴
                }
            }
        }

        // 등수 출력
        for (int i = 0; i < rank.length; i++) {
            System.out.println(name[i] + "의 등수: " + rank[i]);
        }
    }

    static void searchStu() {
        // 검색

        System.out.println("검색할 학생의 이름을 입력하세요");
        String studentName = scan.next();

        boolean found = false;

        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(studentName)) {
                System.out.println(name + "의 성적은 " + score[i][0] + ", " + score[i][1] + ", " + score[i][2] + "입니다.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("검색된 학생이 없습니다.");
        }

    }

}// class
