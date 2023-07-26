package homework.studentadmin;
//学生类应该具有学生姓名、学号、年龄等属性
public class Student {
    private String name;
    private int studentNum;
    private int age;
    public Student(String name,int studentNum,int age){
        this.name = name;
        this.studentNum = studentNum;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
