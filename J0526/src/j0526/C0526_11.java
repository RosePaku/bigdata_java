package j0526;

public class C0526_11 {
    public static void main(String[] args) {
        String str2 = "https://semiconductor.samsung.com/kr/dram/ddr.jsp";
        String str3 = "https://semiconductor.samsung.com/kr/foundry/process-technology.jsp/";
        String test = "abcdefghijklmn";
        String lotto = "1조198756";

        String result1 = lotto.substring(2);
        System.out.println("lotto: " + result1);

        String result2 = test.substring(3, 6);
        System.out.println("lotto: " + result2);

        // kr로 끝나는 것까지 선언하기
        String result3 = str2.substring(36);
        System.out.println("str2 " + result3);

        String result4 = str3.substring(36, 45);
        System.out.println("str3 " + result4);

        String result5 = str3.substring(str3.length() - 1);
        System.out.println("빼기 : " + result5);
    }

}