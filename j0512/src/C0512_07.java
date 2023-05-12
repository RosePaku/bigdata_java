import java.util.Iterator;
import java.util.Scanner;

public class C0512_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		int[][] score = new int[3][4];

//		배열 개수만큼 포문 사용

		//입력 1차원
		for (int i = 0; i < num.length; i++) {
			System.out.println("점수를 입력하세요."); // 3번 입력
			num[i] = scan.nextInt();
		}

		//입력 2차원		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.println("2차원 점수를 입력하세요."); // 12번 입력
				score[i][j] = scan.nextInt();
			}
		}
		
		
		//출력 1차원
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);  
		}

		//출력 2차원
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println(" ");
		}

	}
}