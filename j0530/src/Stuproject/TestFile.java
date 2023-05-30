package Stuproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class TestFile {

    ArrayList<Student> fileRead() throws Exception {
        ArrayList<Student> list = new ArrayList<Student>();
        BufferedReader br = null;
        // 1줄씩 읽는 방식
        br = new BufferedReader(new FileReader("c:/data/student.txt"));
        while (true) {
            String data = br.readLine();
            if (data == null)
                break;
            System.out.println(data);
            // student.txt 파일에서 1줄을 읽어와서 ,로 분리 - 1,홍길동,100,100,99
            String[] dataArr = data.split(","); // 1,홍길동,100,100,99 (5개의 데이터가 배열로 삽입)
            int stuNo = Integer.parseInt(dataArr[0]); // 형변환
            String name = dataArr[1];
            int kor = Integer.parseInt(dataArr[2]);
            int eng = Integer.parseInt(dataArr[3]);
            int math = Integer.parseInt(dataArr[4]);

            // ArrayList<Student> list = new ArrayList<Student>();
            list.add(new Student(stuNo, name, kor, eng, math));
            // list.add(new Student(1, "홍길동", 100, 100, 99));
            // list.add(new Student(2, "유관순", 99, 99, 98));
            // list.add(new Student(3, "이순신", 98, 98, 91));

        }
        br.close();
        return list;

        // //2byte씩 읽는 방식
        // try {
        // FileReader fr =new FileReader("C:/data/student.txt");
        // } catch (FileNotFoundException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
    }

    // 저장 메소드
    void fileSave() throws Exception {
        // 될 수 있으면 try catch문으로
        FileWriter fw = null;
        fw = new FileWriter("c:/data/student.txt");
        String data = "1,홍길동,100,100,99 \r \n";
        data += "2,유관순,99,99,98 \r \n";
        data += "3,이순신,98,98,91 \r \n";

        fw.write(data);
        fw.flush();
        fw.close();

        System.out.println("파일이 저장되었습니다.");
    }
}
