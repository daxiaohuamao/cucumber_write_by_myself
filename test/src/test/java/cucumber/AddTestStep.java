package cucumber;

import cucumber.AddCalculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class AddTestStep {

    private int sum;
    private AddCalculator addCalculator;

    @Given("^I have a calculator$")
    public void HaveCalculator() {
        this.addCalculator = new AddCalculator();
    }

    @When("^I input two numbers$")
    public void InputTwoNumbers() {
        int num1 = 2;
        int num2 = 2;
        this.sum = addCalculator.add(num1, num2);

    }

    @Then("^I will get the result$")
    public void WillGetResult() {
        assertThat(sum, is(4));
    }


}


