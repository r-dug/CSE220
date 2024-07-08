public class Account {
    private long acctNum;
    private double balance;
    private String name;
    public final double RATE = 0.01;
    public Account (String owner, long account, double initial){
        acctNum = account;
        balance = initial;
        name = owner;
    }
    public void deposit (double amount)
    {
        balance += amount;
    }
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    public void addInterest ()
    {
        balance += balance*RATE;
    }
    public double getBalance ()
    {
        return balance;
    }
}
