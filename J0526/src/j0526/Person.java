package j0526;

public class Person {
    long id; // 주민번호 8801011111111 13자리

    Person() {
    }

    Person(long id) {
        this.id = id;
    }

    Person(Person p) {
        this.id = p.id;
    }

    public boolean equals(Object obj) {
        Person p = (Person) obj;
        boolean chk = false;
        if (id == (p.id)) {
            chk = true;
        }
        return chk;
    }

    // public String toString() {
    // String str = "주민번호 : "+id;
    // return str;
    // }

}
