// Student 기능 부여

package j0601;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StuProcess {
    Scanner scan = new Scanner(System.in);
    int stuNo;
    String name;
    int kor, eng, math;
    String createDate, updateDate;

    // 파일 저장하기
    void stuSave(List<Student> list) {
        String data = "";
        // System.out.printf("%d,%s,%d,%d,%d", list.get(0).getStuNo(),
        // list.get(0).getName(), list.get(0).getKor(),
        // list.get(0).getEng(), list.get(0).getMath());

        for (int i = 0; i < list.size(); i++) {
            data += String.format("%d,%s,%d,%d,%d,%s,%s \r \n", list.get(i).getStuNo(), list.get(i).getName().trim(),
                    list.get(i).getKor(),
                    list.get(i).getEng(), list.get(i).getMath(), list.get(i).getCreateDate(),
                    list.get(i).getUpdateDate());
        }

        // String data = "1,홍길동,100,100,99\r\n2,유관순,99,99,98 \r\n3,이순신,88,88,87 \r\n";
        // 파일 저장
        FileWriter fw = null;
        try {
            fw = new FileWriter("c:/savedata/student.txt");
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
    }

    // 읽어오기
    List<Student> stuRead() {

        // int stuNo = 0;
        // String name = "";
        // int kor = 0, eng = 0, math = 0;
        List<Student> list = new ArrayList<Student>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("c:/savedata/student.txt"));
            String data = "";
            while (true) {
                data = br.readLine();// data = "1,홍길동 ....."
                String[] dataArr = data.split(","); // 1,홍길동,100 .....
                if (data == null)
                    break;
                stuNo = Integer.parseInt(dataArr[0]);
                name = dataArr[1];
                kor = Integer.parseInt(dataArr[2]); // 정수형으로 형변환
                eng = Integer.parseInt(dataArr[3]); // 정수형으로 형변환
                math = Integer.parseInt(dataArr[4]); // 정수형으로 형변환
                createDate = dataArr[5];
                // updateDate = dataArr[6]; // 없어서 인식 불가능
                list.add(new Student(stuNo, name, kor, eng, math, createDate));
                // list.add(new Student(stuNo, name, kor, eng, math, createDate, updateDate));

            }
        } catch (

        Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();

            }
        }

        return list;
    }

    // 리턴타입 메소드명
    List<Student> stuOutput(List<Student> list) {
        System.out.println("[학생성적 출력화면]");

        //
        String[] title = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수", "입력일", "수정일" };
        // 출력
        System.out.println("[학생성적 출력화면]");
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s \n",
                title[0], title[1], title[2], title[3], title[4], title[5], title[6], title[7], title[8], title[9]);

        System.out.println("----------------------------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%s\t%s \n",
                    s.getStuNo(), s.getName(), s.getKor(), s.getEng(), s.getMath(),
                    s.getTotal(), s.getAvg(), s.getRank(), s.getCreateDate(), s.getUpdateDate());
        }
        System.out.println();

        return list;
    }// stuOutput

    // 리턴타입 메소드명 (학생성적 입력)
    Map<String, Object> stuInput(List<Student> list, int stuCount) {
        // 반복
        while (true) {
            System.out.println("[학생성적 입력]");
            System.out.println(stuCount + "번째 이름을 입력하세요. (0.이전페이지 이동)");
            name = scan.next();
            if (name.equals("0")) {
                System.out.println("[이전페이지 이동]");
                break;
            }
            System.out.println("국어점수 입력하세요");
            kor = scan.nextInt();
            System.out.println("영어점수 입력하세요");
            eng = scan.nextInt();
            System.out.println("수학점수 입력하세요");
            math = scan.nextInt();

            // 날짜객체선언
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            createDate = sdf.format(d);

            // 새로운 Student 객체를 생성하여 입력 받은 값을 이용해 초기화하고, 리스트에 추가합니다.
            // stuCount : 학생 학번
            // ![]2023-05-31-17-01-04.png
            list.add(new Student(stuCount, name, kor, eng, math, createDate, updateDate));
            // list.add(new Student(stuCount, name, kor, eng, math));
            stuCount++; // 1증가
        } // while

        System.out.println();
        // list,stuCount 2개를 담는 Map 생성
        // list : 학생 정보
        // stuCount : 입력된 학생의 수를 나타내는 변수

        // ![]2023-05-31-16-56-26.png
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", list); // list=list
        map.put("stuCount", stuCount); // stuCount=4

        return map;
    }// map

}
