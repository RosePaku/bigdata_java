package Stuproject;

import java.util.Scanner;

public class C0526_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String data1 = "1001,홍길동,100,100,99";
        String info3 = "";

        // 배열로 담아 출력하시오
        String[] result = data1.split(",");
        
            // String 문자열을 int로 변환
            
				
            	int stuNo = Integer.parseInt(result[0]);
            	int kor = Integer.parseInt(result[2]);
            	int eng = Integer.parseInt(result[3]);
            	int math = Integer.parseInt(result[4]);
            	// Double.parseInt(resul[2]);
            	// Long.parseInt(resul[3]);
		
        
        String name = result[1];

        Student s = new Student(stuNo, name, kor, eng, math);
        // total,avg 출력
        System.out.println(s.getTotal());
        System.out.println(s.getAvg());

        String[] chk_info = new String[3];
        chk_info[0] = "HTML";
        // chk_info[1] = "CSS";
        // chk_info[2] = "webDesign";

        for (int i = 0; i < chk_info.length; i++) {
            if (i == 0)
                info3 = "," + info3 + "," + chk_info[i];
            else
                info3 = info3 + "," + chk_info[i];
        }

        System.out.println(info3);
        // String info1 = ""+chk_info[0]+","+chk_info[1]+","+chk_info[2]; <-에러가 나옴
        // String info2 = "HTML,CSS,webDesign";

        // 내가 만지작한거

        // while (true) {
        // System.out.println("출력할 것들 ");
        // System.out.println("-------------------");
        // System.out.println(data1);

        // System.out.println("찾고자 하는 문자를 입력하세요");
        // String search = scan.next();

        // if (isNumeric(search)) {
        // int stuNo = Integer.parseInt(search);
        // // 숫자로 검색한 경우의 동작을 여기에 작성
        // } else {
        // // 문자열로 검색한 경우의 동작을 여기에 작성
        // // 예: 이름이 일치하는 학생 정보를 출력하는 등의 작업 수행
        // }

        // } // while

        // }

        // private static boolean isNumeric(String search) {
        // return false;
        // }
    }
}
