package stuProject;

import java.util.Objects;

public class Student {

	private int stuNo, kor, eng, math, total, rank;
	private String name, createDate, updateDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	private double avg;

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	Student() {
	} // 기본생성자

	public Student(int stuNo, String name, int kor, int eng, int math, int total, int rank, double avg,
			String createDate) {
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.rank = rank;
		this.avg = this.total / 3.0;
		this.createDate = createDate;
	}

	// setter
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	// setter

	public int getStuNo() {
		return stuNo;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTotal() {
		return total;
	}

	public int getRank() {
		return rank;
	}

}
