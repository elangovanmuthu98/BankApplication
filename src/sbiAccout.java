import javax.swing.*;

public class sbiAccout implements BankAccount{
    private int balance;
    private int roi;
    private String acno;
    public  sbiAccout(int balance)
    {
        this.balance=balance;
        this.roi=5;
    }

    public sbiAccout(int balance,int roi)
    {
        this.balance=balance;
        this.roi=roi;
        //this.acno= UIDefaults
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public boolean withdrawmoney(int money) {
        if(this.balance>=money)
        {
            this.balance=this.balance-money;
            return true;
        }

        return false;
    }

    @Override
    public boolean addmoney(int money) {
        this.balance=this.balance+money;
        return true;
    }

    @Override
    public int checkbalance() {
        return this.balance;
    }

    @Override
    public int getRoI() {
        return this.roi;
    }

    @Override
    public int getTotalInterest(int amount, int timeinyears) {
        return amount *timeinyears*this.roi/100;
    }
    // addd
}
