//1차원 배열, 2차원 배열 출력
//출력값
//	 0 1 2 3
//-------------
//0| 0 0 0 1  
//1| 0 0 0 0
//2| 0 0 0 1
//3| 1 0 0 0
//4| 0 0 1 0

package j0515_task;

import java.util.Random;
import java.util.Scanner;

public class C05105_task_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] box = new int[5][4];
		int[] num = new int[20];
		int input = 0, temp = 0, random = 0;

		// 20에 0,1 넣기
		for (int i = 0; i < num.length; i++) {
			if (i < 16) {
				num[i] = 0;
			} else
				num[i] = 1;
		}

		// 1차원 배열 섞기
		for (int i = 0; i < num.length; i++) {
			random = (int) (Math.random() * 20);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}

		// 1차원 배열 값을 2차원 배열에 넣기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				box[i][j] = num[i * 4 + j];
				
//				*4만 1로 출력됨
//				if (i!=4) {
//					box[i][j] = 0;
//				}
//				else
//				box[i][j] = 1;
			}
		}

		// 출력
		System.out.print(" "+"\t");
		for (int i = 0; i < 4; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.print(i+"|\t");
			for (int j = 0; j < 4; j++) {
				System.out.print(box[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
