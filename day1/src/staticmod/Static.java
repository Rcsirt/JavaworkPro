package staticmod;


public class Static {
    //类变量
    public static String name;
    //实例变量
    int code;

    //类方法
    public static void tr() {
        System.out.println("helloWurd");
        System.out.println("helloWurd");
        System.out.println("helloWurd");
    }
    //实例方法
    public void tr2() {
        //打印成绩是否合格
        System.out.println(code >= 60 ? "合格" : "不合格");
    }
}
