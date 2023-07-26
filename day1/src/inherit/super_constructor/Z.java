package inherit.super_constructor;

public class Z extends F{
    public Z(){
        super();//父类有无参构造器时可写可不写
        System.out.println("子类的无参构造器执行了");
    }
    public Z(String string){
        System.out.println("子类带参构造器执行了");
    }
}
