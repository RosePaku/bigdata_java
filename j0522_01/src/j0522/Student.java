package j0522;

import java.util.Scanner;

public class Student {

    static int count = 1000; // 클래스 변수
    int stuNo;
    String name; // 인스턴스변수
    int kor;
    int eng;
    int math;
    int total;
    double avg;
    int rank;

    { // 초기화 블럭
      // ++count; // 1101
      // // stuNo = count;
      // // stuNo = "2023101" + count; // 2023 101 1001
      // stuNo = "" + count; // 1001,1002 ~~
    }

    Student() {
        ++count; // 1101
        // stuNo = count;
        // stuNo = "2023101" + count; // 2023 101 1001
        stuNo = count; // 1001,1002 ~~
    }

    Student(String name, int kor, int eng, int math) { // 매개변수
        // 지역 변수
        ++count; // 1101
        // stuNo = count;
        // stuNo = "2023101" + count; // 2023 101 1001
        stuNo = count; // 1001,1002 ~~

        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;
        this.avg = this.total / 3.0;

    }

}