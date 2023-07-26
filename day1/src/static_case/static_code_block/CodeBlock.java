package static_case.static_code_block;

//演示静态代码块
public class CodeBlock {
    //静态代码块随着类加载而加载，只加载一遍
    static {
        System.out.println("静态代码块执行了");
    }

    public CodeBlock() {
        System.out.println("构造器创建对象了");
    }

    //实例代码块随着对象创建而在构造器之前加载
    {
        System.out.println("实例代码块执行了");
    }

}
