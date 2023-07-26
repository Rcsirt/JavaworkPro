package homework.bank;

//活期账户
public class CurrentAccount extends BankAccount{
    @Override
    public void getAccountIn() {
        System.out.println("姓名: " + getName());
        System.out.println("账号: " + getAccount());
        System.out.println("活期存款: " + getBalance());
    }
}
