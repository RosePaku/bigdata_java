//2차원 배열 출력 (번호 입력, 번호 출력) (범위4,3)
//1 2 3
// .....
//10 11 12
//---------

package j0515_task;

public class C05105_task_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][] = new int[4][3];

		// 번호 입력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				num[i][j] = (int) (3 * i) + (j + 1);
			}

		}
		
		System.out.println("----------------");
		// 번호출력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();

		}
		System.out.println("-----------------");

	}// main

}// class
