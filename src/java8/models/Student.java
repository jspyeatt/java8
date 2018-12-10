package java8.models;

import java.util.*;

/**
 * Created by John on 7/4/2018.
 */
public class Student {
    public static final Comparator<Student> NAME_COMPARATOR = new NameComparator();
    public static final Comparator<Student> AGE_COMPARATOR = new AgeComparator();
    public final String name;
    public final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static Map<Integer, Student> getStandardStudentMap() {
        Map<Integer, Student> studMap = new HashMap<>();
        studMap.put(10, new Student("John", 15));
        studMap.put(101, new Student("Betsey", 13));
        studMap.put(203, new Student("Thorin", 1));
        studMap.put(204, new Student("Clifford", 2));
        return studMap;
    }
    public static List<Student> getStandardStudentList() {
        List <Student> studList = new ArrayList<>();
        studList.add(new Student("John", 55));
        studList.add(new Student("Betsey", 53));
        studList.add(new Student("Thorin", 1));
        studList.add(new Student("Clifford", 2));
        studList.add(new Student("Sam", 21));
        studList.add(new Student("Gwen", 19));
        return studList;
    }
    public static class NameComparator implements Comparator<Student> {

        @Override
        public int compare(Student student, Student t1) {
            return student.name.compareTo(t1.name);
        }
    }
    public static class AgeComparator implements Comparator<Student> {

        @Override
        public int compare(Student student, Student t1) {
            return student.age - t1.age;
        }
    }
}