import java.util.Scanner;

public class C0512_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1차원배열
//		int[] num = new int[3];
//		for(int i=0;i<num.length;i++) {
//			System.out.println("점수를 입력하세요.");
//			num[i] = scan.nextInt();
//		}
//		
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}

		// 2차원 배열
		int[][] score = new int[3][4];
		// 입력
		for (int i = 0; i < score.length; i++) {
			//

			for (int j = 0; j < score[i].length; j++) {
				System.out.println("2차원 점수를 입력하세요.");
				score[i][j] = scan.nextInt();
			}
		}

		// 출력
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}

}

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		// 10진수를 2진수로 변경하는 프로그램
//
//		// 1. 숫자입력
//		int[] num = new int[10];
//		// 0 1 2 3 4 5 6 7 8 9
//		String[] data = { "0", "10", "20", "30", "40", "50", "60", "70", "80", "90" };
//
//		for (int i = 0; i < data.length; i++) {
//			System.out.println("10진수를 입력하세요"); // 5
//			num[i] = scan.nextInt();
////			System.out.println(data[i]);
//
//		}
//
//		// 2. 2진코드 출력
//		for (int i = 0; i < data.length; i++) {
//			System.out.println("num[i] : " + num[i]);
//			System.out.println("data[i] : " + data[i]);
//			
//
//		}
//
//	}
//}