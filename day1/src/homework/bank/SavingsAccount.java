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
    public void setBalance(double i) {
        if (i > getBalance()) {
            super.setBalance(i);
            return;
        }
        System.out.println("取款失败:储蓄账户需要转为活期才能取款");
    }
}
