//Person 클래스 사용하여 주소 비교

package j0526;

public class C0526_04 {
    public static void main(String[] args) {
        Person p1 = new Person(880101111111L);
        Person p2 = new Person(880102111111L);
        Person p3 = new Person(880101111111L);

        Person p4 = new Person(p1); // 공간분리,깊은복사
        Person p5 = p3; // 주소복사, 얕은복사

        System.out.println(p4.id);

        System.out.println(p1);
        System.out.println(p3);

        if (p1.equals(p3)) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }
    }
}
