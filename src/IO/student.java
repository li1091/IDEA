package IO;
//实现serialzable接口，可以被序列化
public class student implements java.io.Serializable{
    //序列码
    private static final long serialVersionUID = 5666663583490287905L;
    private int age;
    private String name;

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
