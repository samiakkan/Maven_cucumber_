package StepDefinitions;

import Pages.DialogContent;
import Utilities.DriverClass;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class _01_LoginSteps {
    DialogContent dialogContent = new DialogContent();
    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        DriverClass.getDriver().manage().deleteAllCookies();
        DriverClass.getDriver().get("https://test.mersys.io/");
        DriverClass.getDriver().manage().window().maximize();

    }

    @When("Enter username and password")
    public void enter_username_and_password() {
        dialogContent.sendKeysMethod(dialogContent.getLoginUsername(),"turkeyts");
        //dialogContent.getLoginUsername().sendKeys("turkeyts");
        dialogContent.sendKeysMethod(dialogContent.getLoginPassword(), "TechnoStudy123");
        //dialogContent.getLoginPassword().sendKeys("TechnoStudy123");
    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        dialogContent.clickMethod(dialogContent.getLoginButton());
        //dialogContent.getLoginButton().click();
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        dialogContent.waitUntilVisible(dialogContent.getDashBoardHeader());
        Assert.assertTrue(dialogContent.getDashBoardHeader().isDisplayed());
//        dialogContent.clickMethod(dialogContent.getAcceptCookies());
    }
}
