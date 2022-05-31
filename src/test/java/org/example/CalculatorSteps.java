package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorSteps {
  private int total;
  private Calculator calculator;
  @BeforeEach
  private void init() {
    total = -999;
  }
  @Given("I have a calculator")
  public void initializeCalculator() throws Throwable {
    calculator = new Calculator();
  }
  @When("I add {int} and {int}")
  public void testAdd(int num1, int num2) throws Throwable{
    total = calculator.sum(num1, num2);
  }


  @When("I multiply {int} and {int}")
  public void i_mul_and(int num1, int num2) {
    // Write code here that turns the phrase above into concrete actions
    total = calculator.mul(num1, num2);
  }


  @When("I divide {int} and {int}")
  public void i_divide_and(int int1, int int2) {
    total = calculator.div(int1, int2);
  }


    @Then("the result should be {int}")
  public void validateResult(int result) throws Throwable{
    Assertions.assertEquals(total, result); }



}
