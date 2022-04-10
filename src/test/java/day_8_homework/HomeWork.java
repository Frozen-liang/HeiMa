package day_8_homework;

import org.junit.Test;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

class student_8_3{
    private String name;
    private int age;

    public student_8_3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student_8{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class student_8_4 implements Comparable<student_8_4>{
    private String name;
    private int age;

    public student_8_4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student_8{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(student_8_4 student84) {
        return 0;
    }
}

public class HomeWork {
    @Test
    public void test3(){
        TreeMap<student_8_3, String> map = new TreeMap<>();

        map.put(new student_8_3("黑马",16),"西安");
        map.put(new student_8_3("传智",16),"北京");

        map.forEach((student_8,String)-> System.out.println(student_8 + "--" +String));

        
    }

    @Test
    public void test4(){
        TreeMap<student_8_4, String> map = new TreeMap<>();

        map.put(new student_8_4("黑马",16),"西安");
        map.put(new student_8_4("传智",16),"北京");

        map.forEach((student_8_4,String)-> System.out.println(student_8_4 + "--" +String));
    }
}
