package j0530;

import java.util.Scanner;

public class C0530_02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] files = { "fifamobile", "asgard", "GodzillaDF", "csonline" };

        String domain = "https://forum.nexon.com";
        String url = "https://forum.nexon.com/asgard";
        String input = url.substring(domain.length() + 1);
        System.out.println("파일명 : " + input);

        System.out.println("원하는 페이지를 호출하시오.");
        input = scan.next();

        if (input.equalsIgnoreCase(files[0])) {
            System.out.println("fifamobile 페이지를 호출합니다.");
        } else if (input.equalsIgnoreCase(files[1])) {
            System.out.println("asgard 페이지를 호출합니다.");
        } else if (input.equalsIgnoreCase(files[2])) {
            System.out.println("GodzillaDF 페이지를 호출합니다.");
        } else {
            System.out.println("csonline 페이지를 호출합니다.");
        }

        // files 배열에 1에 있습니다.
        // switch (input) {
        // case "fifamobile":
        // System.out.println("fifamobile 페이지를 열어줍니다.");
        // break;
        // case "asgard":
        // System.out.println("asgard 페이지를 열어줍니다.");
        // break;
        // case "GodzillaDF":
        // System.out.println("GodzillaDF 페이지를 열어줍니다.");
        // break;
        // case "csonline":
        // System.out.println("csonline 페이지를 열어줍니다.");
        // break;
        // }//switch

    }

}