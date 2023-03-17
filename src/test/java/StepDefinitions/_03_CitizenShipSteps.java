package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_CitizenShipSteps {

    DialogContent dc = new DialogContent();
    Navigation nv = new Navigation();
    @Given("Navigate to Citizenships page")
    public void navigateToCitizenshipsPage() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getCitizenshipButton());
    }

    @And("Enter citizenship name as {string} and citizenship short name as {string}")
    public void enterCitizenshipNameAsAndCitizenshipShortNameAs(String citizenshipName, String citizenshipShortName) {
        dc.sendKeysMethod(dc.getFormNameInput(),citizenshipName);
        dc.sendKeysMethod(dc.getCitizenshipShortName(),citizenshipShortName);
    }

    @And("Search for Citizenship with name as {string} nad short name as {string}")
    public void searchForCitizenshipWithNameAsNadShortNameAs(String citizenshipName, String citizenshipShortName) {
        dc.sendKeysMethod(dc.getNameSearch(),citizenshipName);
        dc.sendKeysMethod(dc.getCitizenShipShortNameSearch(),citizenshipShortName);
    }

    @And("Delete citizenship")
    public void deleteCitizenship() {
        dc.clickMethod(dc.getSearchButton());
        dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"),10));
        dc.clickMethod(dc.getDeleteButton());
        dc.clickMethod(dc.getConfirmDeleteButton());
    }
}
