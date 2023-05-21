// 작업 날짜 : 20230522
// 제목 : 학생성적처리 프로그램 (class)
// 주 기능 : sum, avg
// 주요 변수 : title, Student(score) 

package j0519_task;

public class Student {

    // 기본생성자
    // Student(){}
    Student(String n, int k, int e, int m) {
        name = n;
        kor = k;
        eng = e;
        math = m;
        total = k + e + m;
        avg = total / 3.0;
    }

    static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

    String name;
    int kor;
    int eng;
    int math;
    int total;
    double avg;
    int rank;

    void sum() {
        total = kor + eng + math;
    }

    void average() {
        avg = total / 3.0;
    }

}