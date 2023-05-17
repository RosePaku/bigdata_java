package j0516;

public class Student1 {
    String name;
    int kor, eng, math, total, rank;
    double avg;

    void sum() {
        total = kor + eng + math;
    }

    void average() {
        avg = total / 3.0;
    }

}
