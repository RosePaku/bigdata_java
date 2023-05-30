// 문자 전처리 방법

package j0526;

public class C0526_09 {
    public static void main(String[] args) {
        String str = "        aaa      aaa       aaa         ";
        String str2 = "        bbb,      bbb,       bbb,         ";

        System.out.println("현재 str : " + str);
        System.out.println("--------------------");
        String result = str.trim(); // 앞쪽뒤쪽 공백 제거
        String result2 = str2.replace("bbb", "abc"); // 앞쪽뒤쪽 공백 제거
        String result3 = str2.replace(",", " "); // 앞쪽뒤쪽 공백 제거
        String result4 = str.replace(" ", ""); // 앞쪽뒤쪽 공백 제거
        System.out.println("공백제거 str : " + result);
        System.out.println("문자변경 str2 : " + result2);
        System.out.println("쉼표변경 str2 : " + result3);
        System.out.println("공백전부제거(변경) str : " + result4);

        // str을 앞뒤 공백,사이공백을 모두제거하여 출력하시오.

    }
}
