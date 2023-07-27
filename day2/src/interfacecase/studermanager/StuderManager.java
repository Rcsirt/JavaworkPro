package interfacecase.studermanager;

import interfacecase.studermanager.bean.Student;

import java.util.ArrayList;

public interface StuderManager {
    void printInformation(ArrayList<Student> studentsList);

    void printAverage(ArrayList<Student> studentsList);
}
