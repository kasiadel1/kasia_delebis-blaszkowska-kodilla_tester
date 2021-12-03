package wallet;
import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {

        Given("I have deposited $200 in my wallet", () -> {
            // Write code here that turns the phrase above into concrete actions
            //throw new io.cucumber.java8.PendingException();
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            // Write code here that turns the phrase above into concrete actions
            //throw new io.cucumber.java8.PendingException();
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
            // Write code here that turns the phrase above into concrete actions
            // throw new io.cucumber.java8.PendingException();
            Assert.assertEquals(30, cashSlot.getContents());
        });


        When("I request $200", () -> {
            // Write code here that turns the phrase above into concrete actions
            //throw new io.cucumber.java8.PendingException();
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 200);
        });

        Then("$200 should be dispensed", () -> {
            Assert.assertEquals(200, cashSlot.getContents());
        });







        //withdraw exceeds account balance

        Given("User's balance is $500", () -> {
            wallet.deposit(500);
            Assert.assertEquals("Incorrect wallet balance", 500, wallet.getBalance());
        });

        When("User withdraws $1000", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,1000);
        });

        Then("no money is dispensed", () -> {

            Assert.assertEquals(500,wallet.getBalance());
        });

        Then("User should be told that has not enough money", () -> {

            Cashier cashier = new Cashier(cashSlot);
            Assert.assertEquals("There is not enough money on your account",cashier.withdraw(wallet,1000));
        });

        //checking balance
        Given("User has $0 on bank account", () -> {

            wallet.deposit(0);
            Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance());
        });

        When("When user is checking balance", () -> {
            System.out.print(wallet.getBalance());

        });

        Then("Should be displayed $0", () -> {
            Assert.assertEquals(0,wallet.getBalance());
        });

    }
}
