package j0601;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StuMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 객체선언
        StuProcess sp = new StuProcess();
        List<Student> list = new ArrayList<Student>();
        int choice = 0;
        int stuCount = list.size() + 1;
        // 학번
        // list.add(new Student(1, "홍길동", 100, 100, 99));
        // list.add(new Student(2, "유관순", 99, 99, 98));
        // 저장된 파일을 읽어올까요?
        System.out.println("저장된 학생성적파일을 읽어올까요?(1.yes,2.no)");
        choice = scan.nextInt();
        if (choice == 1) {
            list = sp.stuRead();
            System.out.println("파일 읽어오기가 완료되었습니다.");
            System.out.println();

        } else {

        }

        while (true) {
            System.out.println("[학생 성적 처리 프로그램]");
            System.out.println("1. 학생입력");
            System.out.println("2. 학생출력");
            System.out.println("8. 파일에서 가져오기");
            System.out.println("9. 파일저장하기");
            System.out.println("--------------------------");

            System.out.println("학생 성적 처리 프로그램에서 원하는 번호를 입력하세요");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    // 메소드호출 후 데이터 전달 받음
                    stuCount = list.size() + 1;
                    Map<String, Object> map = sp.stuInput(list, stuCount);
                    list = (List<Student>) map.get("list");
                    stuCount = (int) map.get("stuCount");
                    break;

                case 2:
                    // 메소드호출(매개변수 전달)- list
                    list = sp.stuOutput(list);
                    break;

                case 8:
                    list = sp.stuRead();
                    System.out.println("파일 읽어오기가 완료되었습니다.");
                    System.out.println();
                    break;

                case 9:
                    sp.stuSave(list);
                    System.out.println("[학생 성적이 저장 되었습니다]");
                    break;

            }// switch

        } // while

    }// main
}
