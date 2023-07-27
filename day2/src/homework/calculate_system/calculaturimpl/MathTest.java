package homework.calculate_system.calculaturimpl;

import homework.calculate_system.Calculator;

import java.util.ArrayList;

//算术题父类
public abstract class MathTest implements Calculator {
    private static final ArrayList<MathTest> topicList = new ArrayList<>();

    public static ArrayList<MathTest> getTopicList() {
        return topicList;
    }

    protected int a;  //被操作数
    protected int b;  //操作数

    //获取题目描述
    public abstract String getQuestion();

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
