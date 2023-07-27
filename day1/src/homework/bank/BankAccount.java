package homework.bank;

//具有用于帐号、帐户持有人名称、余额的私有实例变量，以及用于帐户总数的静态变量。
public class BankAccount {
    private String account;
    private String name;
    private double balance;

    public static int accountNum;


    public BankAccount() {
        accountNum++;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    //账户信息
    public void getAccountIn() {
        System.out.println("姓名: " + getName());
        System.out.println("账号: " + getAccount());
        System.out.println("存款: " + getBalance());
    }

    //取款
    public void withdrawal(double money) {
        if (getBalance() - money >= 0) {
            setBalance(getBalance() - money);
            System.out.println("取款成功，当前余额: " + getBalance());
            return;
        }
        System.out.println("余额不足无法取款");
    }

    public void deposit(double money) {
        setBalance(money + getBalance());
        System.out.println("存款成功");
    }
}
