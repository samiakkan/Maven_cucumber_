package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class _04_DataTableSteps {
    @Given("Go to the WebPage")
    public void goToTheWebPage() {
        System.out.println("We are on the web page");
    }

    @And("Fill the form with valid data")
    public void fillTheFormWithValidData(DataTable formInfo) {
        List<String> formInfoElements = formInfo.asList(String.class);

        for (String element : formInfoElements) {
            System.out.println(element);
        }

    }

    @Then("Save the form")
    public void saveTheForm() {
        System.out.println("We saved the form");
    }

    @And("Enter Valid information")
    public void enterValidInformation(DataTable formInfo) {
        List<List<String>> formInfoElements = formInfo.asLists(String.class);

        for (List<String> list : formInfoElements) {
            for (String info : list) {
                System.out.println(info);
            }
        }
    }
}