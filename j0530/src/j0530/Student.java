package j0530;

public class Student {
    Student() {
    }

    public Student(int stuNo, String name, int kor, int eng, int math) {
        this.stuNo = stuNo;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;
        this.avg = (double) this.total / 3;
        this.rank = 0; // 초기화

    }

    // private : 같은 클래스 내에서만 사용 가능
    private int stuNo;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private double avg;
    private int rank;

    public int getStuNo() {
        return this.stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return this.kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return this.eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return this.math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getAvg() {
        return this.avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int getRank() {
        return this.rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

}
