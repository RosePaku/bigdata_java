package j0530;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ColClass4 {
    // list, nowPage=1,startRow=1,endRow=1
    // 메소드명 : execute4()
    // 리턴타입 : Map<String,Object> map
    // map리턴까지

    Map<String, Object> execute4() {
        Map<String, Object> map = new HashMap<String, Object>();
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "홍길동0", 100, 100, 99));
        list.add(new Student(2, "유관순0", 90, 90, 99));
        list.add(new Student(3, "이순신0", 80, 80, 87));

        list.add(new Student(4, "홍길동1", 100, 100, 99));
        list.add(new Student(5, "유관순1", 90, 90, 99));
        list.add(new Student(6, "이순신1", 80, 80, 87));

        list.add(new Student(7, "홍길동2", 100, 100, 99));
        list.add(new Student(8, "유관순2", 90, 90, 99));
        list.add(new Student(9, "이순신2", 80, 80, 87));

        list.add(new Student(10, "홍길동3", 100, 100, 99));

        int nowPage = 1;
        int startRow = 1;
        int endRow = 1;

        map.put("list", list);
        map.put("nowPage", nowPage);
        map.put("StartRow", startRow);
        map.put("endRow", endRow);

        return map;
    }
}
