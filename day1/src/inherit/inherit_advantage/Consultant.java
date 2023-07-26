package inherit.inherit_advantage;
//继承的好处
//咨询师类111
public class Consultant extends People {
    private int number;
    public Consultant(){
        number++;
    }

    public int getNumber() {
        return number;
    }

    public void printInfo() {
        System.out.println(getName() + "解答问题的总人数: " + getNumber());
    }
}
