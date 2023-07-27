package abstractcase.abstractdefinition;
//抽象类的好处，将父类行为中不能直接确定的方法抽象化，让继承的子类根据需求重写抽象方法
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.setName("lez");
        System.out.println(cat.getName());
        cat.cry();
        dog.setName("kun");
        System.out.println(dog.getName());
        dog.cry();
    }
}
