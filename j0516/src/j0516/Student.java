package j0516;

public class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void sum() {
		total = kor+eng+math;
	}
	
	void average() {
		avg = total/3.0;
	}

}

//package j0516;
//
//public class Student {
//
//    // 기존 변수 선언
//    String name = "홍길동";
//    int kor = 100;
//
//    String[] arrName = new String[5];
//    int[] arrKor = new int[5];
//
//    // 객체 변수 선언
//    Student s1 = new Student(); // 홍길동, 100
//    Student s2 = new Student("유관순", 99); // 유관순, 99
//
//    // 생성자
//    public Student() {
//        // 기본 생성자
//    }
//
//    public Student(String name, int kor) {
//        // 생성자 오버로딩
//        this.name = name;
//        this.kor = kor;
//    }
//
//    // 메소드
//    public static void main(String[] args) {
//
//    }
//
//}
