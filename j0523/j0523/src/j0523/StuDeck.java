package j0523;

import stuProject.Student;

public class StuDeck {

        Student s = new Student("홍길동", 100, 100, 100);

        void stuPrint() {
                s.kor = 50;
                // s.eng=90;
                System.out.println(s.kor);
        }
}
