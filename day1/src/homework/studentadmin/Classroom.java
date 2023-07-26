package homework.studentadmin;

import inherit.rewrite.A;

import java.util.ArrayList;

//班级类应该包含学生列表和添加学生的方法
//使用单例设计模式确保每个班级只有一个实例。
//分别使用饿汉式、懒汉式实现
public class Classroom {
    //学生列表
    private ArrayList<Student> studentsList = new ArrayList<>();

    private Classroom() {

    }

    //班级1 //饿汉方式
    private static Classroom classroom1 = new Classroom();

    public static Classroom getClassroom1() {
        return classroom1;
    }

    //班级2 //懒汉方式
    private static Classroom classroom2;

    public static Classroom getClassroom2() {
        if (classroom2 == null) {
            classroom2 = new Classroom();
        }
        return classroom2;
    }

    public void addStudentList(Student student){
            studentsList.add(student);
    }

    public ArrayList<Student> getList(){
        return studentsList;
    }

}
