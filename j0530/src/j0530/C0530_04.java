package j0530;

import java.util.Scanner;

public class C0530_04 {
    // 소문자 대문자 출력. a = 97, A=65, 0=48
    public static void main(String[] args) {
        String str = "abc";
        str += "1";
        System.out.println(str);

        int a = 0;
        a += 1;

        StringBuffer sb = new StringBuffer("abc");
        // sb = sb+1;
        sb.append(1);
        sb.append(1);
        System.out.println(sb);

    }
}