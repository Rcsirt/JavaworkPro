package inherit.super_constructor;

public class Test {
    public static void main(String[] args) {
        //子类构造器在调用时都会先调用父类构造器，再执行自身
        Z z = new Z();
        Z z1 = new Z("11");
    }
}
