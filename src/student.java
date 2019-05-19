public class student implements Comparable {
    public Integer age;
    private String name;

    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        student s=(student)(o);
        if (this.age > s.age){
            return 1;
        }else if (this.age < s.age){
            return -1;
        }
        return 0;
    }
}
