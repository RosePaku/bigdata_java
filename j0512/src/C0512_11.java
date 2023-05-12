
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Iterator;
import java.util.Arrays;
import java.util.Scanner;

public class C0512_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = { 1, 11, 23, 45, 2, 3, 9, 5 };
//		integer = 객체 타입
		Arrays.sort(arr); // 오름차순 정렬
//		Arrays.sort(arr,Collections.reverseOrder()); // 내림차순정렬
		int num = 10;
		
		// 단순 for문
		for (int i : arr) {
			System.out.println(i + " ");
		}
		
//		//기본 for문
//		for (int i = 0; i < arr.length; i++) {
//			
//		}
		
	}
}