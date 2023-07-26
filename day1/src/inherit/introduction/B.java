package inherit.introduction;
//继承快速入门B类
public class B extends A{
    public void print3(){
        System.out.println(i);//继承并输出父类的变量i
        print1();
        //System.out.println(j);    私有成员可以被继承，但不能被使用
        //print2();
    }

}
