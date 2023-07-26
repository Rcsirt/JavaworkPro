package single;

//单例设计模式示例//
//单例设计模式:确保一个类只有一个对象

public class Student {
    //饿汉单例:先创建对象，后调用
    private static Student student = new Student();

    private Student() {
    }

    public static Student student() {
        return student;
    }
    //=================================//

    //懒汉单例:调用时才创建对象
    private static Student student1;

    /*
    private Student() {
    }*/

    public static Student student1() {
        //此处做if判断，只有在变量student为null时才创建对象
        if (student1 == null){
            student1 = new Student();
        }
        return student;
    }
}


