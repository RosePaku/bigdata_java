package j0523;

public class C0523_05 {

    public static void main(String[] args) {
        // 12시 50분 52초를 입력하고,
        // 12시를 출력하시오.

        Time t = new Time(12, 50, 52);

        int hour = t.getHour();
        // int minute = t.getMinute();
        // int second = t.getSecond();
        System.out.println(hour + "시");
        System.out.println(t.getHour());

        // t.setHour(22);
        // t.hour = 25; // private을 선언하면 사용 불가능
        System.out.println(t.getHour());

        // System.out.println();
        // System.out.println(hour + "시" + minute + "분");
        // System.out.println();
        // System.out.println(hour + "시" + minute + "분" + second + "초");

    }

}
