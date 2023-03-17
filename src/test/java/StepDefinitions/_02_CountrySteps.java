package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _02_CountrySteps {

    DialogContent dc = new DialogContent();
    Navigation nv = new Navigation();
    @And("Navigate to Country page")
    public void navigateToCountryPage() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getCountriesBtn());
    }

    @When("Create a new country")
    public void createANewCountry() {
        dc.clickMethod(dc.getAddButton());
        dc.sendKeysMethod(dc.getFormNameInput(),"USA1");
        dc.sendKeysMethod(dc.getFormCodeInput(),"U1");
        dc.clickMethod(dc.getSaveButton());
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.getSuccessMessage(),"successfully");
    }

    @When("Delete country")
    public void deleteCountry() {
        dc.sendKeysMethod(dc.getNameSearch(),"USA1");
        dc.sendKeysMethod(dc.getCodeSearch(),"U1");
        dc.clickMethod(dc.getSearchButton());
        dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"),10));
        dc.clickMethod(dc.getDeleteButton());
        dc.clickMethod(dc.getConfirmDeleteButton());
    }

    @And("Click on add button")
    public void clickOnAddButton() {
        dc.clickMethod(dc.getAddButton());
    }

    @When("Enter country name as {string} and code as {string}")
    public void enterCountryNameAsAndCodeAs(String countryName, String countryCode) {
        dc.sendKeysMethod(dc.getFormNameInput(),countryName);
        dc.sendKeysMethod(dc.getFormCodeInput(),countryCode);
    }

    @And("Click on save button")
    public void clickOnSaveButton() {
        dc.clickMethod(dc.getSaveButton());
    }
}