package j0525;

public class C0525_06 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0); // 예외 발생 스킵하고 5로
            System.out.println(4);

        } catch (Exception e) {
            System.out.println(5);

        }
        System.out.println(6);
    }
}
// try는 if else임