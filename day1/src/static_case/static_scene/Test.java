package static_case.static_scene;
//static修饰成员变量的应用场景的测试类
public class Test {
    public static void main(String[] args) {
        new Static();
        new Static();
        new Static();
        new Static();
        System.out.println(Static.num);
    }
}
