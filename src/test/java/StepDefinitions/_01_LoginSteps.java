package StepDefinitions;

import io.cucumber.java.en.*;

public class _01_LoginSteps {

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        System.out.println("step1");
    }
    @When("Enter username and password")
    public void enter_username_and_password() {
        System.out.println("Step 2");
    }
    @When("Click on Login Button")
    public void click_on_login_button() {
        System.out.println("Step 3");
    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("Step 4");
    }
}