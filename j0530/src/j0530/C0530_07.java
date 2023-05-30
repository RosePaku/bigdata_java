package j0530;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator; //컬렉션을 읽어오는 객체

public class C0530_07 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("abc");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("abc");
        list.add("bbb");
        list.add("aaa");

        // 출력
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // 정렬 기능 있음
        System.out.println("--------------------");
        System.out.println("[기본 이터레이터 출력]");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        HashSet hs = new HashSet();
        hs.add("abc");
        hs.add("aaa");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("abc");
        hs.add("bbb");
        hs.add("aaa");

        System.out.println("-------------");
        System.out.println("[set 출력]");
        Iterator it2 = hs.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}