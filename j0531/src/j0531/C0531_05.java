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
import java.io.OutputStream;
import java.util.Scanner;

public class C0531_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 파일쓰기 - c.txt
        String str = "파일쓰기를 시작합니다.";
        File f = new File("c:/savedata/c.txt");
        FileWriter fw = null;
        System.out.println("글을 입력하세요");
        String input = scan.nextLine();
        try {
            fw = new FileWriter(f);
            // fw.write(str); str에 대한
            fw.write(input); // 입력 받은 값
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally { // 안전문제로 finally e2 생성해서 닫기.
            try {
                fw.close();
            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
        System.out.println("파일이 저장되었습니다.");

        // //파일 읽어오기 UTF-8 선언해야 함.
        // BufferedReader br = null;
        // try {
        // br = new BufferedReader(new FileReader("c:/savedata/news.txt"));
        // while (true) {
        // String data = br.readLine();
        // if (data == null) {
        // break;
        // }
        // System.out.println(data);
        // }
        // } catch (Exception e) {
        // // TODO: handle exception
        // e.printStackTrace();
        // } finally {
        // try {
        // br.close();
        // } catch (Exception e2) {
        // // TODO: handle exception
        // e2.printStackTrace();
        // }
        // }
        // System.out.println();

    }
}