package stuProject2;

public class Student {

    {
        count++;
        stuNo = count;
    }

    Student() {
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public static String[] getTitle() {
    	return title;
    }
    
    public static void setTitle(String[] title) {
    	Student.title = title;
    }
    
    public int getStuNo() {
    	return stuNo;
    }
    
    public void setStuNo(int stuNo) {
    	this.stuNo = stuNo;
    }

    Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;
        this.avg = total / 3.0;
    }

    static int count = 1000;
    static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };

    private String name;

	private int stuNo;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private double avg;
    private int rank;
}
