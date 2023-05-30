// txt에 글자 저장

package j0526;

import java.io.File;
import java.io.FileWriter;

public class C0526_02 {
    public static void main(String[] args) {
        // File dir = new File("c:/bbb");
        // dir.mkdirs(); // 폴더생성 메소드
        // System.out.println("폴더를 생성합니다.");

        // File f = new File("c:/bbb/test.txt");
        // try {
        // f.createNewFile(); // 파일생성 메소드
        // } catch (Exception e) {
        // // TODO: handle exception
        // e.printStackTrace();

        // }
        // System.out.println("파일을 생성합니다.");

        // 파일에 문자열 쓰기
        FileWriter fw = null;
        String str = "";
        try {
            fw = new FileWriter("c:/bbb/test.txt");
            for (int i = 0; i < 10; i++) {
                str = str + "글자를 저장합니다. \r \n";
                fw.write(str); // 글자 저장 메소드
                // fw.flush(); //버퍼에 있는 모든것을 저장
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            ;
        } finally {
            try { // 파일 닫는 작업에서 예외처리를 하기 위해 (저장 안정성)
                fw.close();
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
        System.out.println("글자가 저장되었습니다.");

    }
}
