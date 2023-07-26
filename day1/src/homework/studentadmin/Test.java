package homework.studentadmin;
/*设计一个学生管理系统，其中包含学生类（Student）和班级类（Classroom）。
学生类应该具有学生姓名、学号、年龄等属性，班级类应该包含学生列表和添加学生的方法。
使用单例设计模式确保每个班级只有一个实例。
分别使用饿汉式、懒汉式实现
 */
public class Test {
    public static void main(String[] args) {
    Student student1 = new Student("lez",114,20);
    Student student2 = new Student("kun",115,21);
    Student student3 = new Student("qio",116,22);
    Student student4 = new Student("zhu",117,23);
    Classroom classroom1 = Classroom.getClassroom1();
    Classroom classroom2 = Classroom.getClassroom2();
    classroom1.addStudentList(student1);
    classroom1.addStudentList(student2);
    classroom2.addStudentList(student3);
    classroom2.addStudentList(student4);

        for (Student student : classroom1.getList()) {
            System.out.println("班级1:"+student.getName());
        }
        for (Student student : classroom2.getList()) {
            System.out.println("班级2:"+student.getName());
        }
    }
}
