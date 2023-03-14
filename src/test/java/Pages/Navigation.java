package Pages;

import Utilities.BasicDriver;
import Utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends MyMethods {

    public Navigation(){
        PageFactory.initElements(BasicDriver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupBtn;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameterBtn;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement countriesBtn;

    public WebElement getSetupBtn() {
        return setupBtn;
    }

    public WebElement getParameterBtn() {
        return parameterBtn;
    }

    public WebElement getCountriesBtn() {
        return countriesBtn;
    }
}
