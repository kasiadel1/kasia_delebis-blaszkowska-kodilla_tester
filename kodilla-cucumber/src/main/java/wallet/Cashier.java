package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }


    public String withdraw(Wallet wallet, int amount) {
        if (amount > wallet.getBalance())
            return "There is not enough money on your account";
        else
            wallet.debit(amount);
        cashSlot.dispense(amount);
        return wallet.balanceMessage();
    }
}