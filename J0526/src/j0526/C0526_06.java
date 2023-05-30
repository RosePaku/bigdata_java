// 문자와 숫자를 각각 0~10까지 더하는 것의 합

package j0526;

public class C0526_06 {

    public static void main(String[] args) {
        int sum = 0;
        String str = "";
        for (int i = 0; i <= 10; i++) {
            sum += i;
            str += i + " ";
        }

        System.out.println(sum);
        System.out.println(str);
    }
}
