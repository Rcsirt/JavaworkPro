package homework.staffadmin;
//子类 经理类
public class Manager extends Employee{
    static {
        System.out.println("======经理栏======");
    }
    @Override
    public void calWages(){
        System.out.println("经理计算工资");
    }
}
