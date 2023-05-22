package j0522;

import java.util.Scanner;

public class Student1 {

    static String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
    static int count = 1000; // 클래스 변수 - 객체선언 없이 클래스명.변수명
    String name;
    int stuNo; // 인스턴스 변수 - 객체 선언 후 참조변수명.변수명
    int kor;
    int eng;
    int math;
    int total;
    double avg;
    int rank;

    {
        count++;
        stuNo = count;
    }

    Student1() { // 생성자 -클래스명과 일치, void 없음
    }

    Student1(String name, int kor, int eng, int math) { // 생성자
        this.name = name; //
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;
        this.avg = total / 3.0;
    }

}
