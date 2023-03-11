package uma.uma;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import uma.BMICalcImpl;

public class StepDefinitions {
	private BMICalcImpl b;
	private double res;

    @Given("i have a calculator")
    public void i_have_a_calculator() {
    	b = new BMICalcImpl();
    }

    @When("i compute the {int} and {int}")
    public void i_compute_the_and(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        res = b.bmi(int1, int2);
    }
    @Then("returns {int}")
    public void returns(int int1) {
    	Assertions.assertEquals(int1, 1);
    }

}
