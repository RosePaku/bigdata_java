package j0531;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C0531_07 {
    public static void main(String[] args) { // throw exception 넣으면 try catch 필요 없음
        String data = "";

        List<Student> list = new ArrayList<>();
        list.add(new Student(1, " 홍길동 ", 100, 100, 99));
        list.add(new Student(2, "유관순", 99, 99, 98));
        list.add(new Student(3, "이순신", 88, 88, 87));

        // System.out.printf("%d,%s,%d,%d,%d", list.get(0).getStuNo(),
        // list.get(0).getName(), list.get(0).getKor(),
        // list.get(0).getEng(), list.get(0).getMath());

        for (int i = 0; i < list.size(); i++) {
            data += String.format("%d,%s,%d,%d,%d \r \n", list.get(i).getStuNo(), list.get(i).getName().trim(),
                    list.get(i).getKor(),
                    list.get(i).getEng(), list.get(i).getMath());
        }

        // String data = "1,홍길동,100,100,99\r\n2,유관순,99,99,98 \r\n3,이순신,88,88,87 \r\n";
        // 파일 저장
        FileWriter fw = null;
        try {
            fw = new FileWriter("c:/savedata/student3.txt");
            fw.write(data);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                fw.close();

            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
        System.out.println("저장되었습니다.");

        // // 대신 에러 나면 해결책 없음 될 수 있으면 try catch
        // // student.txt 파일 읽어오기
        // BufferedReader br = null;

        // br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
        // String data = "";
        // while (true) {
        // data = br.readLine();
        // if (data == null)
        // break;
        // System.out.println(data);
        // }
        // br.close();

    }// main
}