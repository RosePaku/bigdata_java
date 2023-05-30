
package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator; //컬렉션을 읽어오는 객체
import java.util.List;
import java.util.Map;

public class C0530_09 {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        ColClass c = new ColClass();
        map = c.execute();

        // ColClass2
        int nowPage = 0;
        ColClass2 c1 = new ColClass2();
        nowPage = c1.execute2();

        // ColClass3
        ColClass3 c3 = new ColClass3();
        ArrayList<Student> list = new ArrayList<Student>();
        list = c3.execute3();

        // ColClass4
        Map<String, Object> map1 = new HashMap<>();
        ColClass4 c4 = new ColClass4();
        map1 = c4.execute4();

    }// main

    // static Map<String, Object> subMethod() {

    // int nowPage = 3;
    // int startRow = 21;
    // int endRow = 30;
    // map.put("list", list);
    // map.put("nowPage", nowPage);
    // map.put("StratRow", startRow);
    // map.put("endRow", endRow);

    // return map;
    // }
    // int subMethod() {
    // int result = 0;
    // String name = "홍길동";
    // return result;
    // // 파이썬은 2개 이상 타입 리턴이 불가능 (자바는 1개만 리턴 가능)
    // }

}