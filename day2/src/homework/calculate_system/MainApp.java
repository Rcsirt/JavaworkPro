package homework.calculate_system;

import homework.calculate_system.calculaturimpl.*;
import homework.calculate_system.user.Student;
import homework.calculate_system.user.Teacher;
import homework.calculate_system.user.User;

import java.util.ArrayList;
import java.util.Scanner;

//程序入口类
public class MainApp {

    public static void main(String[] args) {
        //默认的用户
        Teacher teacher = new Teacher("太乙真人", "123456");
        Student student = new Student("哪吒", "123456");
        //默认的题目
        MathTest mathTest = new AddTest();
        MathTest mathTest2 = new SubtractTest();
        MathTest mathTest3 = new Multiply();
        MathTest mathTest4 = new DivideTest();
        mathTest4.setA(8);
        mathTest4.setB(4);

        ArrayList<User> users = new ArrayList<>();                  //用户列表
        ArrayList<MathTest> topicList = MathTest.getTopicList();    //题目列表
        //将默认题目加入题目集合
        topicList.add(mathTest);
        topicList.add(mathTest2);
        topicList.add(mathTest3);
        topicList.add(mathTest4);
        //将默认用户加入用户集合
        users.add(teacher);
        users.add(student);
        //以上，无家可归的默认参数(不确定题目让放哪就丢这了)

        String type;
        Scanner sc = new Scanner(System.in);
        back:while (true){
            System.out.print("欢迎来到黑马数学心算练习系统\n"+"请输入用户名: ");
            type = sc.next();
            for (User user1 : users) {
                if (user1.getName().equals(type)) {
                    System.out.print("请输入密码:");
                    String password = sc.next();
                    if (password.equals(user1.getPassword())) {
                        switch (user1.id) {
                            case "teacher" -> {
                                showTeacherUI(sc, (Teacher) user1, topicList);
                                break back;
                            }
                            case "student" -> {
                                showStudentUI(sc, (Student) user1, topicList);
                                System.out.println("继续登录系统请输入Y，否则退出系统");
                                type = sc.next();
                                if (type.equals("Y")){
                                    continue back;
                                }else break back;
                            }
                        }
                    }
                }
            }
            System.out.println("未找到该用户");
        }
    }

    //添加题目
    private static void addTest(Scanner sc, ArrayList<MathTest> topicList) {

    }

    //删除题目
    private static void deleteTest(Scanner sc, ArrayList<MathTest> topicList) {

    }

    //学生界面
    private static void showStudentUI(Scanner sc, Student student, ArrayList<MathTest> topicList) {
        System.out.println("欢迎" + student.getName() + "同学进入系统!\n请开始您的答题: ");
        answer(sc, topicList);
    }

    //老师界面
    private static void showTeacherUI(Scanner sc, Teacher teacher, ArrayList<MathTest> topicList) {

    }

    //答题
    public static void answer(Scanner sc, ArrayList<MathTest> topicList) {
        String type;
        do {
            System.out.println("您好，一共" + topicList.size() + "道题目，请开始作答，答对一题得1分，答错不给分");
            int count = 0;
            for (MathTest mathTest : topicList) {
                System.out.println("请回答以下问题，机会只有一次:");
                System.out.println(mathTest.getQuestion());
                if (mathTest instanceof DivideTest) {
                    System.out.println("这是一道除法题，只要回答商就行，余数不考虑");
                }
                int answer = sc.nextInt();
                if (answer == mathTest.calculator()) {
                    System.out.println("回答正确!");
                    count++;
                } else System.out.println("回答错误..");
            }
            System.out.println("一共" + topicList.size() + "道题，每题1分，共得分" + count);
            if (count == topicList.size()) {
                System.out.println("哇哦！算术这方面，你就是王者！佩服你");
            } else if (count > topicList.size() - 2) {
                System.out.println("可惜，差一点就满分了");
            } else System.out.println("不想接着打分数了，就这样了");

            System.out.println("成绩不服，输入 Y 继续挑战，否则输入其他退出");
            type = sc.next();
        } while (type.equals("Y"));
    }
}
