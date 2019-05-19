package Oop.day16.TreeSet;

import java.util.Objects;
//自定义引用数据类型使用tree的时候，需要加入比较器
//可以实现Comparable接口，自定义内部比较器，也可以专门写个比较器类
//实现Comparator接口，从而引用外部比较器.
public class student implements Comparable{
    private int age;
    private String name;
    private double height;

    public student() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public student(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        student stu=(student)o;
        //return this.age-stu.age;
        //return -((Double)(this.height)).compareTo((Double)(stu.height));
        return this.name.compareTo(stu.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return age == student.age &&
                Double.compare(student.height, height) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, height);
    }
}




