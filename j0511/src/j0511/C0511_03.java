package j0511;

public class C0511_03 {

	public static void main(String[] args) {
		// 실습 1
		int i = 0, sum = 0;
		while (true) {
			if (sum > 100) {
				break; // while,for문 종료할 때 : break문
			}
			sum = sum + i; // i=0, sum = 0, i=1, sum=1
			i++;
			System.out.println("sum 값 : " + sum + "\n" + "i 값 : " + i);
			System.out.println("if문 실행중");
		}
		System.out.println("if문 나왔음");
		System.out.println("sum 값 : " + sum + "\n" + "i 값 : " + i);

	}
}

////실습 2
//int i=0, sum=0;
//
//for (i = 0;;) {
//if (sum>10) {
//	break;
//}
//i++;
//sum+=i;
//}
//System.out.println("i의 결과값 :"+(i));
//System.out.println("sum의 결과값 :"+sum);