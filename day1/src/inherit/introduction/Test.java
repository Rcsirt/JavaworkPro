package inherit.introduction;
//继承入门测试类
public class Test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.i);
        b.print1();     //子类对象可以调用父类非private修饰的成员

        //System.out.println(b.j);
        //b.print2();   //private修饰的成员不可以被子类对象调用
    }
}
