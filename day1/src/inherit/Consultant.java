package inherit;
//咨询师类111
public class Consultant extends People {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void printInfo() {
        System.out.println(getName() + "解答问题的总人数: " + getNumber());
    }
}
