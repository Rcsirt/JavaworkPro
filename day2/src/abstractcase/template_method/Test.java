package abstractcase.template_method;
//模板方法设计模式练习
public class Test {
    public static void main(String[] args) {
        Template template = new Stu1();
        template.write();
        System.out.println();
        Template template1 = new PhoneLogin();
        template1.Login();

    }
}
