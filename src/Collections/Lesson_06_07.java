package Collections;

import java.util.*;

public class Lesson_06_07 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(56);


        Map<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");



        for(Map.Entry<Integer,String>entry: map.entrySet())
            System.out.println(entry.getKey()+":"+ entry.getValue());

        Set<Integer>set_1 = new HashSet<>();
        set_1.add(3);
        set_1.add(5);
        set_1.add(1);
        set_1.add(6);
        set_1.add(6);
        set_1.add(6);
        set_1.add(6);
        Set<Integer>set_2 = new LinkedHashSet<>();
        set_2.add(4);
        set_2.add(1);
        set_2.add(2);
        set_2.add(2);
        set_2.add(2);
        set_2.add(9);
        Set<Integer>set_3 = new TreeSet<>();
        set_3.add(3);
        set_3.add(5);
        set_3.add(1);
        set_3.add(6);
        set_3.add(6);
        set_3.add(6);
        set_3.add(6);

       /* System.out.println(set_2);
        System.out.println(set_3);
        System.out.println(list);
        System.out.println(map);*/
        Map(1,"one") -> 1 -> 5656 -> 3
        Map(2,"two") -> 2 -> 5656 -> 3

                []
        []
        [5656] > "one" > "two"
                []
        []



    }
}

