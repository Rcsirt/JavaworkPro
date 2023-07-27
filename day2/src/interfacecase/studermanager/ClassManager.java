package interfacecase.studermanager;

import interfacecase.studermanager.bean.Student;

import java.util.ArrayList;

public class ClassManager {
    private static final ClassManager classManager = new ClassManager();
    private ArrayList<Student> studentList = new ArrayList<>();

    private StuderManager studerManager = new StuderManagerImpl2();

    private ClassManager() {
        Student student1 = new Student("张三","男",80);
        Student student2 = new Student("李四","男",70);
        Student student3 = new Student("王五","女",90);
        Student student4 = new Student("lez","男",40);
        Student student5 = new Student("qio","女",50);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
    }

    public static ClassManager getClassManager() {
        return classManager;
    }

    public void printInformation() {
        studerManager.printInformation(studentList);
    }

    public void printAverage() {
        studerManager.printAverage(studentList);
    }
}
