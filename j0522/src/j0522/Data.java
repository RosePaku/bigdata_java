package j0522;

/**
 * Data
 */
public class Data {
	Data() {
		// 같은 클래스 내 다른생성자를 호출 this()
		this(1, 1);

		// num1=1;
		// num2=1;
		// data1 = num1+num2;
		// data2 = num1-num2;
		// data3 = num1*num2;
		// data4 = num1/num2;
	}

	Data(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		data1 = num1 + num2;
		data2 = num1 - num2;
		data3 = num1 * num2;
		data4 = num1 / num2;

	}

	int num1;
	int num2;
	int data1;
	int data2;
	int data3;
	int data4;

}