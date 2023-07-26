package inherit.inherit_advantage;
//继承的好处 测试类
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Consultant consultant = new Consultant();
        teacher.setName("lez");
        teacher.setSkill("python、java、c艹");
        consultant.setName("kun");
        System.out.println(teacher.getName());
        System.out.println(teacher.getSkill());
        System.out.println(consultant.getName());
        System.out.println(consultant.getNumber());
    }
}
