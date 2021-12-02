package homework;
import io.cucumber.java8.En;
import org.junit.Assert;


public class IsNumberDivisibleSteps implements En {

    private int number;
    private String answer;

    public IsNumberDivisibleSteps() {

        Given("My number is  27", (Integer) -> {
            // Write code here that turns the phrase above into concrete actions
           // throw new io.cucumber.java8.PendingException();
            this.number = 27;

        });

        Given("My number is  15", () -> {
            // Write code here that turns the phrase above into concrete actions
            // throw new io.cucumber.java8.PendingException();
            this.number = 15;

        });

        Given("My number is  25", () -> {
            // Write code here that turns the phrase above into concrete actions
            // throw new io.cucumber.java8.PendingException();
            this.number = 25;

        });

        Given("My number is  13", () -> {
            // Write code here that turns the phrase above into concrete actions
            // throw new io.cucumber.java8.PendingException();
            this.number = 13;

        });

        When("I'm checking if my number is divisible by {int} and {int}", (Integer int1, Integer int2) -> {
            // Write code here that turns the phrase above into concrete actions
            //throw new io.cucumber.java8.PendingException();
            IsDivisible isDivisible= new IsDivisible();
            this.answer = isDivisible.checkIfDivisible(this.number);

        });

        Then("I should be told and {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            //throw new io.cucumber.java8.PendingException();
            Assert.assertEquals(string, this.answer);
        });

    }
}