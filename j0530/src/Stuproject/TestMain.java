package Stuproject;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) throws Exception {
        // 객체선언
        TestFile t = new TestFile();
        // t.fileSave();// 저장하기
        ArrayList<Student> list = new ArrayList<Student>();
        list = t.fileRead(); // 파일 읽어오기

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
