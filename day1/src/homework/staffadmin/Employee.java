package homework.staffadmin;
//创建一个Employee类，其中包含姓名、年龄和工资的私有实例变量。
public class Employee {
    private String name;
    private int age;
    private int wages;

    public static int number;     //跟踪员工总数
    public Employee(){
        number++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public void getInformation(){
        System.out.println("======员工信息======");
        System.out.println("员工姓名:"+getName());
        System.out.println("年龄:"+getAge());
        System.out.println("工资:"+getWages());
    }

    public void calWages(){
        System.out.println("员工计算工资");
    }
}
