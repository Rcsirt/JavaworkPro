package polycase;

public class Student extends People{
    @Override
    public void print1() {
        System.out.println("这是一个学生类");
    }

    public void print2(){
        System.out.println("这是学生类独有的方法");
    }
}
