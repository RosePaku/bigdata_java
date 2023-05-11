package j0511;



public class C0511_13 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        
        // a와 b의 값을 서로 바꿔서 저장을 하기 위해, 
        // 먼저 a의 값을 c에 저장합니다.
        c = a;
        
        // 그 다음 b의 값을 a에 저장합니다.
        a = b;
        
        // 마지막으로 c에 저장되어 있는 a의 값을 b에 저장합니다.
        b = c;
        
        // a와 b의 값이 바뀐 것을 확인합니다.
        System.out.println(a + ":" + b + ":" + c);
    }
}
