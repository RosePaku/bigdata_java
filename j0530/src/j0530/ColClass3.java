package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColClass3 {
    // execute3()메소드를 만들어서
    // lsit main 메소드에 전달하시오.
    ArrayList<Student> execute3() {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "홍길동0", 100, 100, 99));
        list.add(new Student(2, "유관순0", 90, 90, 99));
        list.add(new Student(3, "이순신0", 80, 80, 87));

        list.add(new Student(4, "홍길동1", 100, 100, 99));
        list.add(new Student(5, "유관순1", 90, 90, 99));
        list.add(new Student(6, "이순신1", 80, 80, 87));

        list.add(new Student(7, "홍길동2", 100, 100, 99));
        list.add(new Student(8, "유관순2", 90, 90, 99));
        list.add(new Student(9, "이순신2", 80, 80, 87));

        list.add(new Student(10, "홍길동3", 100, 100, 99));

        return list;

    }
}
