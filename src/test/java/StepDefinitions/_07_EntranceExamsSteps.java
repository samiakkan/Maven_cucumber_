package StepDefinitions;

import Pages.DialogContent;
import Pages.Navigation;
import Utilities.BasicDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.ArrayList;
import java.util.List;

public class _07_EntranceExamsSteps {

    Navigation nv = new Navigation();
    DialogContent dc = new DialogContent();
    @Given("Go to Entrance Exams page")
    public void goToEntranceExamsPage() {
        nv.clickMethod(nv.getEntranceExamsButton());
        nv.clickMethod(nv.getEntranceExamsSetupButton());
        nv.clickMethod(nv.getEntranceExamsInnerButton());
    }

    @And("Fill the Create Exam form")
    public void fillTheCreateExamForm(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.waitUntilVisible(dc.getDescription());
        dc.sendKeysMethod(dc.getEntranceExamsCreateNameInput(),dataList.get(0));
        dc.clickMethod(dc.getAcademicPeriodSelect());
        dc.clickMethod(dc.getAcademicPeriodOption());
        dc.clickMethod(dc.getGradeLevelSelect());
        dc.clickMethod(dc.getGradeLevelOption());
    }

    @And("Create a description")
    public void createADescription(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.clickMethod(dc.getDescription());
        BasicDriver.getDriver().switchTo().frame(dc.getDescriptionAndNoteIFrame());
        dc.sendKeysMethod(dc.getDescriptionAndNoteInput(), dataList.get(0));
        BasicDriver.getDriver().switchTo().defaultContent();
    }

    @And("Create a note")
    public void createANote(DataTable dataTable) {
        List<String> dataList = dataTable.asList(String.class);
        dc.clickMethod(dc.getNote());
        BasicDriver.getDriver().switchTo().frame(dc.getDescriptionAndNoteIFrame());
        dc.sendKeysMethod(dc.getDescriptionAndNoteInput(), dataList.get(0));
        BasicDriver.getDriver().switchTo().defaultContent();
    }
}