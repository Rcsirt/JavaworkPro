package abstractcase.template_method;

public class PhoneLogin extends Template {
    @Override
    public void content() {
        //练习用，为避免报错就重写了
    }

    @Override
    public void LoginType() {
        System.out.println("使用手机验证码登录");
    }
}
