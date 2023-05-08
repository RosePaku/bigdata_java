// 정수의 오버플로우
package j0508_01;

public class Class0508_05 {

	public static void main(String[] args) {
		//오버플로우
		//2147483647
		int num = 2147483647;
		System.out.println(num+2); //오버플로우로 인해 거꾸로 연산이 됨.
	
		int num2 = -2147483648;
		System.out.println(num2-1); //오버플로우로 인해 거꾸로 연산이 됨.
		
		int num1 = 1000000;
		int num0 = 2000000;
		System.out.println(num1*num); //2,000,000,000,000
		
		
	}// main


}// class
