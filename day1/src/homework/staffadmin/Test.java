package homework.staffadmin;

/*创建一个Employee类，其中包含姓名、年龄和工资的私有实例变量。
实现计算工资和显示员工信息的方法。使用静态变量跟踪员工总数。
为不同类型的雇员(例如，经理、工程师)创建子类，这些子类具有计算工资的特定行为。
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setName("lele");
        manager.setAge(20);
        manager.setWages(5000);
        manager.getInformation();
        manager.calWages();

        Employee employee1 = new Employee();
        employee1.setName("qio");
        employee1.setAge(21);
        employee1.setWages(2500);
        employee1.getInformation();
        employee1.calWages();

        System.out.println("员工数量: "+Employee.number);
    }
}
