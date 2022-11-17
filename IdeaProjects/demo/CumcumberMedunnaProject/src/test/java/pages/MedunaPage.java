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

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id='entity-menu']")
    public WebElement mypages;

    @FindBy (xpath = "//div[@class='dropdown-menu dropdown-menu-right show']")
    public List<WebElement> pagesDdm;

  @FindBy (xpath =  "(//a[@class='dropdown-item'])[1]")
    public WebElement myAppointments;

  @FindBy (xpath = "//thead//tr//th")
    public List<WebElement> appointmentTitles;



}
