package homework.bank;

import inherit.rewrite.B;

/*创建一个代表银行帐户的BankAccount类。
它应该具有用于帐号、帐户持有人名称、余额的私有实例变量，以及用于帐户总数的静态变量。
实现存入、提取和显示账户信息的方法。
使用继承来创建SavingsAccount和CurrentAccount这样的子类。
 */
public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setName("lez");
        bankAccount.setAccount("123456");
        bankAccount.setBalance(4000);
        bankAccount.withdrawal(2000);
        bankAccount.deposit(500);
        bankAccount.getAccountIn();
        System.out.println();
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setName("qio");
        currentAccount.setAccount("456789");
        currentAccount.setBalance(5000);
        currentAccount.withdrawal(2000);
        currentAccount.deposit(500);
        currentAccount.getAccountIn();
        System.out.println();
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setName("kun");
        savingsAccount.setAccount("192334");
        savingsAccount.setBalance(6000);
        savingsAccount.withdrawal(2000);
        savingsAccount.deposit(500);
        savingsAccount.getAccountIn();
        savingsAccount.setBalance(2000);

    }
}
