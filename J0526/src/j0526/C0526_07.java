// 문자 찾기

package j0526;

import java.util.Scanner;

public class C0526_07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("찾고자 하는 문자를 입력하세요.");
        String search = scan.next();
        String str1 = "홍길동 홍길순 홍길자 이순신 강감찬 유관순 김구 김유신";
        String str2 = "https://semiconductor.samsung.com/kr/dram/ddr.jsp";
        String str3 = "https://semiconductor.samsung.com/kr/foundry/process-technology.jsp";

        if (str2.endsWith(search)) {
            System.out.println("jsp로 끝납니다.");
        } else
            System.out.println("jsp로 끝나지 않습니다.");

        // contains() - 문자얄 내에 문자가 있는지 확인
        if (str1.contains(search)) {
            System.out.println(search + "(이)라는 글자가 있습니다.");
        } else
            System.out.println(search + "(이)라는 글자가 없습니다.");
    }
}