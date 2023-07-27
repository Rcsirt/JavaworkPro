package polycase;
//多态的好处: 增加代码的扩展性和维护性
public class Test {
    public static void main(String[] args) {
        People people1 = new Student();
        people1.print1();
        People people2 = new Teacher();
        people2.print1();
        //people1.print2();  #错误的       //多态的弊端，父类类型引用指向的子类对象不可以调用子类自身的方法
        //如需调用子类自身的方法，需要使用 强制类型转换 将当前父类类型转换成相应子类类型
        //  ↓ ↓ ↓
        Student s1 = (Student) people1;

        //可以使用关键字 instanceof 来判断一个对象的真实类型
        System.out.println("判断对象people2是否为Teacher类:"+(people2 instanceof Teacher));
        System.out.println("判断对象people2是否为Student类:"+(people2 instanceof Student));
        Student student = new Student();
        System.out.println("判断对象student是否为Student类:"+(student instanceof Student));
    }
}
