package interfacecase.studermanager;

import interfacecase.studermanager.bean.Student;

import java.util.ArrayList;

public class StuderManagerImpl implements StuderManager {
    @Override
    public void printInformation(ArrayList<Student> studentsList) {
        System.out.println("========全部学生信息========");
        for (Student student : studentsList) {
            System.out.println("姓名: " + student.getName() +
                    " 性别: " + student.getGender() +
                    " 成绩: " + student.getGrade());
        }
        System.out.println("=========================");
    }

    @Override
    public void printAverage(ArrayList<Student> studentsList) {
        double addaverage = 0;
        for (Student student : studentsList) {
            addaverage += student.getGrade();
        }
        double average = addaverage / studentsList.size();
        System.out.println("班级平均分为:"+average);
    }
}