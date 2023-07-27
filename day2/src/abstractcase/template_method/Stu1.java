package abstractcase.template_method;

public class Stu1 extends Template {
    @Override
    public void content() {
        System.out.println("这是正文......");
    }

    @Override
    public void LoginType() {
        //练习用，为避免报错就重写了
    }
}
