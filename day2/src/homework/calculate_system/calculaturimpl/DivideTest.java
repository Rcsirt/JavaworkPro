package homework.calculate_system.calculaturimpl;

//除法试题类
public class DivideTest extends MathTest {
    @Override
    //计算功能
    public int calculator() {
        return a / b;
    }

    @Override
    //题目描述
    public String getQuestion() {
        return a + "÷" + b + "= ?";
    }
}
