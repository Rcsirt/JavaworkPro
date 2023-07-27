package interfacecase.studermanager;

import interfacecase.studermanager.bean.Student;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ClassManager classManager = ClassManager.getClassManager();
        classManager.printInformation();
        classManager.printAverage();

    }
}
