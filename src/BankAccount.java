public interface BankAccount{
    boolean withdrawmoney(int money);
    boolean addmoney(int money);
    int checkbalance();
    int getRoI();
    int getTotalInterest(int amount,int timeinyears);
}
