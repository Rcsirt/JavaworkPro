package inherit.rewrite;
//B类
public class B extends A{
    @Override
    public void print1(){
        System.out.println("12345");
    }
    @Override
    public void print2(int i){
        System.out.println("54321");
    }
}
