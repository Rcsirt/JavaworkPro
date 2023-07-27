package interfacecase.studermanager;

import interfacecase.studermanager.bean.Student;

import java.util.ArrayList;

public class StuderManagerImpl2 implements StuderManager {
    @Override
    public void printInformation(ArrayList<Student> studentsList) {
        int countB = 0;
        int countG = 0;
        System.out.println("========全部学生信息========");
        for (Student student : studentsList) {
            System.out.println("姓名: " + student.getName() +
                    " 性别: " + student.getGender() +
                    " 成绩: " + student.getGrade());
            if (student.getGender().equals("男")) {
                countB++;
            } else countG++;
        }
        System.out.println("男生人数:" + countB + " 女生人数:" + countG);
        System.out.println("=========================");
    }

    @Override
    public void printAverage(ArrayList<Student> studentsList) {
        double max = studentsList.get(0).getGrade();
        double min = studentsList.get(0).getGrade();
        double addAverage = studentsList.get(0).getGrade();
        for (int i = 1; i < studentsList.size(); i++) {
            addAverage += studentsList.get(i).getGrade();
            if (max < studentsList.get(i).getGrade()) {
                max = studentsList.get(i).getGrade();
            }
            if (min > studentsList.get(i).getGrade()) {
                min = studentsList.get(i).getGrade();
            }
        }
        double average = (addAverage - max - min) / studentsList.size();
        System.out.println("班级平均分(去掉最高最低分)为:" + average);
    }
}