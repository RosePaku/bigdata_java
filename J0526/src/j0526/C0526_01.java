// 파일 저장

package j0526;

public class C0526_01 {
    public static void main(String[] args) {
        Exception e1 = new Exception("고의로 예외 발생");
        System.out.println("[프로그램 시작]");
        try {
            System.out.println("파일 복사를 시작합니다.");
            System.out.println("파일 복사 진행...");
            // throw e1;
            System.out.println(0 / 0);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            System.out.println("파일을 종료합니다.!!");
        }
        System.out.println("[프로그램 종료]");

    }
}
