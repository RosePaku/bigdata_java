package j0523;

public class Time {

    private int hour; // 인스턴스 변수 : 객체선언 참조변수.변수
    private int minute;
    private int second;

    Time() {
    } // 기본생성자

    Time(int hour, int minute, int second) { // 매개변수가 있는 생성자
        this.hour = hour; // this - 인스턴스 변수 가리킴
        this.minute = minute;
        this.second = second;
    }

    public int getHour() { // hour의 변수값을 읽어 오는 메소드
        return hour;
    }

    // public int getMinute() { // minute의 변수값을 읽어 오는 메소드
    // return minute;
    // }

    // public int getSecond() { // Second의 변수값을 읽어 오는 메소드
    // return second;
    // }

    public void setHour(int hour) { // hour의 변수값을 저장하는 메소드
        // , int minute, int second
        if (hour < 0 || hour > 23) {
            System.out.println("데이터 잘못 입력됨");
            return;
        }
        this.hour = hour;
        // this.minute = minute;
        // this.second = second;
    }
}
