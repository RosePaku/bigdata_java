package j0601;

import java.text.SimpleDateFormat;
import java.util.*;

public class C0601_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("학번을 입력하세요.");
        int stuNo = scan.nextInt();
        System.out.println("이름을 입력하세요.");
        String name = scan.next();
        System.out.println("국어점수를 입력하세요.");
        int kor = scan.nextInt();
        System.out.println("영어점수를 입력하세요.");
        int eng = scan.nextInt();
        System.out.println("수학점수를 입력하세요.");
        int math = scan.nextInt();
        // 1.Date객체선언 2.SimpleDateFormat 3.format
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String createDate = sdf.format(today);
        String updateDate = sdf.format(today);

        Student s = new Student(stuNo, name, kor, eng, math, createDate, updateDate);

        System.out.println("입력된 날짜 : " + s.getCreateDate());

        System.out.println("저장되었습니다.");

    }

}