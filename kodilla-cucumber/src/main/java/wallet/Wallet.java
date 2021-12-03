package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet(){
    }

    public void deposit(int money){
        this.balance += money;

    }

    public int getBalance(){
        return balance;
    }

    public String balanceMessage(){
        return "Your balance is $" + balance;
    }
//zmniejszanie konta
    public void debit(int money) {
        this.balance -= money;
    }
}
