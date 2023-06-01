package j0601;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class C0601_03 {

    public static void main(String[] args) {

        FileWriter fw = null;
        try {
            fw = new FileWriter("c:/savedate/a.txt", true); // false를 하면 덮어쓰기 true를 하면 추가
            String data = "많은 뉴스들을 저장합니다.";
            fw.write(data);
        } catch (Exception e) {
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
    }
}