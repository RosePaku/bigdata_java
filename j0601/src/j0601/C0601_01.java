package j0601;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class C0601_01 {
    public static void main(String[] args) {

        // 날짜형태를 지정하는 객체
        Date today = new Date(); // 날짜객체 2023-06-01 , 2023년 06월 01일
        System.out.println(today.toString());
        // 날짜형태를 지정하는 객체 (hh:mm:ss zz)
        // System.out.println("today");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss zzz");
        System.out.println(sdf.format(today));

        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDate());
        System.out.println(today.getDay());
        System.out.println(today.getHours());
        System.out.println(today.getMinutes());
        System.out.println(today.getSeconds());

        // 객체 선언 - 싱글톤 패턴
        // Calendar cal = new Calendar();
        Calendar cal = Calendar.getInstance();
        Date date1 = cal.getTime();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf2.format(date1));

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int date = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        // 년,월,일,시,분,초

        System.out.println(year);
        System.out.println(month + 1);
        System.out.println(date);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);

    }
}
