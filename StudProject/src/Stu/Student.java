package Stu;

public class Student {
	static String[] title = { "이름", "국어", "영어", "수학", "합계", "평균" };
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	void sum() {
		total = kor + eng + math;
	}

	void average() {
		avg = total / 3.0;
	}

}
