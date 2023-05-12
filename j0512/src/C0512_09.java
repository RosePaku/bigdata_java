import java.util.Iterator;
import java.util.Scanner;

public class C0512_09 {

	public static void main(String[] args) {
		// 이름 국어,영어,수학,합계,평균
		Scanner scan = new Scanner(System.in);
		String[] title = { "이름", "국어", "영어", "수학", "합계" };
		String[] name = new String[5]; // 이름
		int[][] score = new int[5][4]; // 5명의 국어,영어,수학,합계
		// 점수입력
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번째 :");
			// 이름입력받으면 됨.
			System.out.println("이름을 입력하세요.");
			name[i] = scan.next();
			for (int j = 0; j < 3; j++) {
				System.out.println(title[j + 1] + " 점수를 입력하세요.");
				score[i][j] = scan.nextInt();
			}
			// 합계
			score[i][3] = score[i][0] + score[i][1] + score[i][2];
		}
		// 점수출력
		for (int i = 0; i < title.length; i++) {
			System.out.printf("%s\t", title[i]);
		}
		System.out.println();
		System.out.println("---------------------------------------");
		for (int i = 0; i < score.length; i++) {
			// 이름 출력
			System.out.print(name[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		} // for

	}

}

//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		// 5명 국영수합
//		// 합계 부분에 입력한 숫자를 더함
//		int[][] num = new int[5][4];
//		int[] total = new int[3];
//		String[] title = { "국어", "영어", "수학", "합계" };
//
//		// 점수입력
//
//		for (int i = 0; i < num.length; i++) {
//			System.out.println((i + 1) + "번째 입력하세요");
//			for (int j = 0; j < num[i].length - 1; j++) {
//				System.out.println("점수를 입력하세요");
//				num[i][j] = scan.nextInt();
////			total[i] = num[i][j]+num[i][j];	
//			}
//			//j값은 존재 안함
//			num[i][3] = num[i][0] + num[i][0] + num[i][0];
//			
//		} // for문
//
//		//점수출력
//		for (int i = 0; i < num.length; i++) {
//			System.out.printf("%s\t",title[i]);
//		}
//		
//		for (int i = 0; i < num.length; i++) {
//			for (int j = 0; j < num[i].length; j++) {
//				System.out.println(num[i][j] + "\t");
//
////				total[i] = num[i][j]+num[i][j];
////				System.out.println(total[i]);
//			}
//			System.out.println();
//
//		} // for문
//
//	}
//}