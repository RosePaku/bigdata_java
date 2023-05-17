//1. 3개의 숫자를 입력 받아 작은 수부터 순차적으로 출력하시오.
// calculate() 메소드
package j0517;

import java.util.Scanner;

public class C0517_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("숫자 입력하세요");
            arr[i] = scan.nextInt();
        }
        // //배열정렬
        // Arrays.sort(arr);
        calculate(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void calculate(int[] arr) {
        // arr[0] = Math.min(Math.min(arr[0], arr[1]), arr[2]); // 이렇게 하면 안됨
        int min = Math.min(Math.min(arr[0], arr[1]), arr[2]);
        int max = Math.max(Math.max(arr[0], arr[1]), arr[2]);
        int middle = (arr[0] + arr[1] + arr[2]) - max - min;

        arr[0] = min;
        arr[1] = middle;
        arr[2] = max;
    }
}

// 쓰지 말기
// package j0517;

// import java.util.Arrays;
// import java.util.Scanner;

// public class C0517_08 {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// int[] arr = new int[3];

// for (int i = 0; i < arr.length; i++) {
// System.out.println("숫자 입력하세요");
// arr[i] = scan.nextInt();
// }
// //배열정렬
// Arrays.sort(arr);

// for (int i = 0; i < arr.length; i++) {
// System.out.println(arr[i]+" ");
// }
// System.out.println();
// }
// }

// * 인공지능
// package j0517;

// import java.util.Scanner;

// public class C0517_08 {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);

// System.out.print("3개의 숫자를 입력하세요: ");
// int num1 = scan.nextInt();
// int num2 = scan.nextInt();
// int num3 = scan.nextInt();

// int min = num1;
// if (num2 < min) {
// min = num2;
// }
// if (num3 < min) {
// min = num3;
// }

// System.out.print(min);
// if (num1 != min) {
// System.out.print(" " + num1);
// }
// if (num2 != min) {
// System.out.print(" " + num2);
// }
// if (num3 != min) {
// System.out.print(" " + num3);
// }
// }
// }