package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends MyMethods {

    public DialogContent() {
        PageFactory.initElements(BasicDriver.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Username']")
    private WebElement loginUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//span[contains(text(),'LOGIN')]")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'Dashboard')]")
    private WebElement dashBoardHeader;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement addButton;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement formNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    private WebElement formCodeInput;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//div[@id='cconsent-bar']//button[@class='consent-give']")
    private WebElement acceptCookies;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[1]")
    private WebElement countryNameSearch;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[1]")
    private WebElement countryCodeSearch;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement countrySearchBtn;

    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private WebElement deleteCountryButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement confirmDeleteCountry;


    public WebElement getLoginUsername() {
        return loginUsername;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getDashBoardHeader() {
        return dashBoardHeader;
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getFormNameInput() {
        return formNameInput;
    }

    public WebElement getFormCodeInput() {
        return formCodeInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getAcceptCookies() {
        return acceptCookies;
    }

    public WebElement getCountryNameSearch() {
        return countryNameSearch;
    }

    public WebElement getCountryCodeSearch() {
        return countryCodeSearch;
    }

    public WebElement getCountrySearchBtn() {
        return countrySearchBtn;
    }

    public WebElement getDeleteCountryButton() {
        return deleteCountryButton;
    }

    public WebElement getConfirmDeleteCountry() {
        return confirmDeleteCountry;
    }
}
