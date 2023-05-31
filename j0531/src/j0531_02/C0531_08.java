package j0531_02;

import java.util.ArrayList;
import java.util.List;

import j0531.Student;

public class C0531_08 {
    public static void main(String[] args) { // throw exception 넣으면 try catch 필요 없음
        // 객체선언
        DataClass d = new DataClass();
        int num1 = 10;
        int num2 = 5;
        int sum = d.numAdd(num1, num2);
        System.out.println(sum * 2);

        int kor = 100, eng = 100, math = 99;
        Student s = d.stuAdd(kor, eng, math);
        System.out.println(s.getTotal());

        // 학번, 이름을 출력하시오.
        List<Student> list = d.stuList(); // 리스트 형태에서 stuList 정보 선언하기
        // int num = 0; (타입) (이름) = (정보) 선언

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d, %s \n", list.get(i).getStuNo(), list.get(i).getName());
        }

    }
}