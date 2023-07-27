package abstractcase.template_method;

public abstract class Template {
    //模板方法1
    public final void write() {
        System.out.println("《标题》");
        content();
        System.out.println("《结尾》");
    }

    //模板方法1中的抽象方法
    public abstract void content();

    //模板方法2
    public final void Login() {
        System.out.println("登录方式");
        LoginType();
    }

    //模板方法2中的抽象方法
    public abstract void LoginType();
}
