package day_8_homework;

import org.junit.Test;

import java.util.*;

public class SeatWork {

    //    统计字符串出现次数 hash实现
    @Test
    public void test1() {
        String s = "Even if we make mistakes, we can try to make things right";

        HashMap<Character, Integer> map = new HashMap<>();
        // 把字符串变为数组
        char[] chars = s.toCharArray();
        // 循环遍历数组 并且统计字符出现的次数 存入集合中
        for (Character character:chars) {
            // 判断map出现的字符 出现则统计
            // 如果不存在就直接加一
            if (map.containsKey(character)) {
                Integer integer = map.get(character);
                integer++;
                map.put(character,integer);
            }else {
                map.put(character,1);
            }
//            Integer integer = map.get(character);
//            integer++;
//            map.containsKey(character) ? map.put(character, integer) : map.put(character, 1);
        }

        // 循环遍历key 输出key 对应的value
        Set<Character> set = map.keySet();
        for (Character c :
                set) {
            System.out.println(c + "出现了" + map.get(c));
        }

    }

    //    map通过value来排序
    @Test
    public void test2() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("离开家", 111);
        map.put("护士", 222);
        map.put("大多数", 333);
        map.put("阿迪王", 444);

        for (Object o : map.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "--" + value);
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        // TreeSet实现
        Set<Map.Entry<String, Integer>> objects = new TreeSet<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        objects.addAll(entries);
        System.out.println(objects);

        //
    }
}
