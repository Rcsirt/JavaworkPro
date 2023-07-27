package homework.bank;

//储蓄账户
public class SavingsAccount extends BankAccount {
    @Override
    public void getAccountIn() {
        System.out.println("姓名: " + getName());
        System.out.println("账号: " + getAccount());
        System.out.println("储蓄: " + getBalance());
    }

    @Override
    public void withdrawal(double money) {
        System.out.println("储蓄账户需要转为活期才能取款");
    }
}
