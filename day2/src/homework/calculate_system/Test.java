package homework.calculate_system;

import homework.calculate_system.calculaturimpl.AddTest;
import homework.calculate_system.calculaturimpl.DivideTest;
import homework.calculate_system.calculaturimpl.MathTest;

public class Test {
    public static void main(String[] args) {
        MathTest mathTest = new AddTest();
        mathTest.setA(3);
        mathTest.setB(4);
        System.out.println(mathTest.getQuestion());
        System.out.println(mathTest.calculator());
        MathTest mathTest1 = new DivideTest();
        mathTest1.setA(10);
        mathTest1.setB(2);
        System.out.println(mathTest1.getQuestion());
        System.out.println(mathTest1.calculator());
    }
}
