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
        mathTest.setA(10);
        mathTest.setB(5);
        mathTest2.setA(6);
        mathTest2.setB(3);
        mathTest3.setA(10);
        mathTest3.setB(2);
        mathTest4.setA(8);
        mathTest4.setB(2);

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
        back:
        while (true) {
            System.out.print("""
                    欢迎来到黑马数学心算练习系统
                    (输入 Q 退出系统)
                    请输入用户名:""");
            type = sc.next();
            if (type.equals("Q")){
                break;
            }
            for (User user1 : users) {
                if (user1.getName().equals(type)) {
                    System.out.print("请输入密码:");
                    String password = sc.next();
                    if (password.equals(user1.getPassword())) {
                        switch (user1.id) {
                            case "teacher" -> {
                                showTeacherUI(sc, (Teacher) user1, topicList);
                                continue back;
                            }
                            case "student" -> {
                                showStudentUI(sc, (Student) user1, topicList);
                                System.out.println("继续登录系统请输入Y，否则退出系统");
                                type = sc.next();
                                if (type.equals("Y")) {
                                    continue back;
                                } else break back;
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
        System.out.println("""
                请选择需要添加的题型:
                1:加法题
                2:减法题
                3:乘法题
                4:除法题""");
        String select = sc.next();
        switch (select) {
            case "1" -> {
                MathTest mathTest = new AddTest();
                System.out.println("请输入被加数:");
                mathTest.setA(sc.nextInt());
                System.out.println("请输入加数:");
                mathTest.setB(sc.nextInt());
                topicList.add(mathTest);
                System.out.println("题目: " + mathTest.getQuestion() + " 添加成功!");
            }
            case "2" -> {
                MathTest mathTest = new SubtractTest();
                System.out.println("请输入被减数:");
                mathTest.setA(sc.nextInt());
                System.out.println("请输入减数:");
                mathTest.setB(sc.nextInt());
                topicList.add(mathTest);
                System.out.println("题目: " + mathTest.getQuestion() + " 添加成功!");
            }
            case "3" -> {
                MathTest mathTest = new Multiply();
                System.out.println("请输入被乘数:");
                mathTest.setA(sc.nextInt());
                System.out.println("请输入乘数:");
                mathTest.setB(sc.nextInt());
                topicList.add(mathTest);
                System.out.println("题目: " + mathTest.getQuestion() + " 添加成功!");
            }
            case "4" -> {
                MathTest mathTest = new DivideTest();
                System.out.println("请输入被除数:");
                mathTest.setA(sc.nextInt());
                System.out.println("请输入除数:");
                mathTest.setB(sc.nextInt());
                topicList.add(mathTest);
                System.out.println("题目: " + mathTest.getQuestion() + " 添加成功!");
            }
            default -> System.out.println("选项不存在");
        }

    }

    //删除题目
    private static void deleteTest(Scanner sc, ArrayList<MathTest> topicList) {
        System.out.println("当前题库为:");
        for (int i = 0; i < topicList.size(); i++) {
            System.out.println("题目" + (i+1) + ": " + topicList.get(i).getQuestion() + "\t\t" +
                    "参考答案: " + topicList.get(i).calculator());
        }
        System.out.println("请选择要删除的题目");
        int select = sc.nextInt();
        System.out.println("是否删除题目:"+topicList.get(select - 1).getQuestion()+"\t输入 Y 确定删除,输入其他取消删除操作");
        if (sc.next().equals("Y")){
            topicList.remove(select-1);
            return;
        }
        System.out.println("已取消");

    }

    //学生界面
    private static void showStudentUI(Scanner sc, Student student, ArrayList<MathTest> topicList) {
        System.out.println("欢迎" + student.getName() + "同学进入系统!\n请开始您的答题: ");
        answer(sc, topicList);
    }

    //老师界面
    private static void showTeacherUI(Scanner sc, Teacher teacher, ArrayList<MathTest> topicList) {
        String select;
        do {
            System.out.println("欢迎" + teacher.getName() + "老师进入系统\n当前题库如下:");
            for (int i = 0; i < topicList.size(); i++) {
                System.out.println("问题" + (i+1) + ": " + topicList.get(i).getQuestion() + "\t\t" +
                        "参考答案: " + topicList.get(i).calculator());
            }
            System.out.println("是否要编辑题目，需要编辑输入 Y ，输入其他无需修改，并退出登录！");
            String updateTopic = sc.next();
            if (!updateTopic.equals("Y")) {
                System.out.println("已退出");
                return;
            }
            System.out.println("1、添加题目");
            System.out.println("2、删除题目");
            updateTopic = sc.next();
            switch (updateTopic) {
                case "1" -> addTest(sc, topicList);
                case "2" -> deleteTest(sc, topicList);
                default -> System.out.println("无效选择");
            }
            System.out.println("是否继续编辑题目，是请按 Y ，否则任意输入");
            select = sc.next();
        } while (select.equals("Y"));


    }

    //答题
    public static void answer(Scanner sc, ArrayList<MathTest> topicList) {
        String select;
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
            select = sc.next();
        } while (select.equals("Y"));
    }
}
