// 하다 말았음

package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator; //컬렉션을 읽어오는 객체
import java.util.List;

public class C0530_08 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("aaa");
        System.out.println("list : " + list.get(0));
        Iterator it2 = list.iterator();

        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        for (int i = 0; i < list.size(); i++) {

        }

        HashMap map = new HashMap<>();
        map.put("id", "aaa");
        map.put("list", "data");
        map.put("no", "1");
        map.put("lastNo", "100");
        map.put("id", "bbb");

        // 1개 출력
        System.out.println("map : " + map.get("id"));

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}