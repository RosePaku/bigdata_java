package j0530;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator; //컬렉션을 읽어오는 객체

public class C0530_06 {
    public static void main(String[] args) {
        // list : 객체들의 집합, 데이터 이동 및 읽기, 저장용도로 사용
        ArrayList list = new ArrayList();
        for (int i = 1; i <= 7; i++) {
            list.add(i);
        }
        System.out.println("현재 : " + list.size());

        // // 삭제
        // for (int i = list.size() - 1; i >= 0; i--) {
        // list.remove(i);
        // }

        // Iterator 사용출력 - 예전버전 : Enumeration

        // 기본적인 출력 방법
        Iterator it = list.iterator(); // 컬렉션을 읽어오는 객체

        while (it.hasNext()) { // 데이터가 있는지 확인
            System.out.println(it.next()); // 1개의 데이터를 가져옴
        }

        // 잘 안씀 두번 객체 선언 해야 두번 출력 가능함.
        // set을 사용할 때만 자주 사용함.
        Iterator it2 = list.iterator(); // 컬렉션을 읽어오는 객체

        while (it2.hasNext()) { // 데이터가 있는지 확인
            System.out.println(it2.next()); // 1개의 데이터를 가져옴
        }

        // for문 출력
        // System.out.print("출력:"+list.size());
        // for (int i = 0; i < list.size(); i++) {
        // System.out.println("list : " + list.get(i));
        // }
    }
}