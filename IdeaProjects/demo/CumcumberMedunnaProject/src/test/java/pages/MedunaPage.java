package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MedunaPage {
    public MedunaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@id='account-menu']")
    public WebElement SignIn;

    @FindBy (xpath = "//*[@id='login-item']")
    public WebElement signin2;

    @FindBy (xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy (xpath = "//input[@name='ssn']")
    public WebElement ssnNo;

    @FindBy (xpath = "//input[@name='firstName']")
    public WebElement firstName;

}
