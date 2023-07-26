package static_case.single;

public class Test {
    public static void main(String[] args) {

        System.out.println(Student.student());//饿汉方式
        System.out.println(Student.student1());//懒汉方式
    }
}
