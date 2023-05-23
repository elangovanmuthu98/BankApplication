public class sbiAccout implements BankAccount{
    private int balance;
    public  sbiAccout(int balance)
    {
        this.balance=balance;
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
    // addd
}
